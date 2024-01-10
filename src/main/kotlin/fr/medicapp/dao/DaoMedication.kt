package fr.medicapp.dao

import com.mongodb.client.model.Filters
import com.mongodb.client.model.Indexes
import fr.medicapp.entities.Medication
import fr.medicapp.entities.RawDataEntities.MedicationRawData
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.runBlocking
import kotlin.collections.ArrayList

enum class DaoMedication {
    INSTANCE;

    private val collection = MongoInstance().getMedicationCollection()

    fun renewDatabase(data: ArrayList<MedicationRawData>) {
        val newMedicationList = data.map {
            Medication(
                _id = it.CISCode,
                name = it.Name,
                administrationRoutes = it.AdministrationRoutes,
                importantInformations = it.ImportantInformations.map { it.SafetyInformationLink },
                prescriptionDispensingConditions = it.PrescriptionDispensingConditions.map { it.PrescriptionDispensingCondition }
            )
        }
        runBlocking {
            collection.drop()
            collection.insertMany(newMedicationList)
            collection.createIndex(Indexes.text("name"))
        }
    }

    fun getFromCisCode(ciscode: String): Medication? {
        return runBlocking {
            collection.find(Filters.eq("_id", ciscode)).firstOrNull()
        }
    }

    fun getFromName(name: String): ArrayList<Medication> {
        return runBlocking {
            val l = ArrayList<Medication>()
            collection.find(Filters.text(name)).limit(10).collect {
                l.add(it)
            }
            return@runBlocking l
        }
    }
}