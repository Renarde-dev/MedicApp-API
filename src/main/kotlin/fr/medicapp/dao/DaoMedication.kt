package fr.medicapp.dao

import com.mongodb.client.model.Filters
import com.mongodb.client.model.Indexes
import fr.medicapp.entities.Medication
import fr.medicapp.entities.RawDataEntities.MedicationRawData
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import kotlin.collections.ArrayList

enum class DaoMedication {
    INSTANCE;

    private val collection = MongoInstance().getMedicationCollection()

    fun renewDatabase(data : ArrayList<MedicationRawData>) {
        val newMedicationList = data.map {
            Medication(
                _id = it.CISCode,
                name = it.Name,
                administrationRoutes = it.AdministrationRoutes,
                importantInformations = it.ImportantInformations.map { it.safetyInformationLink },
                prescriptionDispensingConditions = it.PrescriptionDispensingConditions.map { it.prescriptionDispensingCondition }
            )
        }
        runBlocking {
            collection.drop()
            collection.insertMany(newMedicationList)
        }
    }

    fun getFromCisCode(ciscode: String): Medication? {
        return runBlocking {
            collection.find(Filters.eq("_id",ciscode)).firstOrNull()
        }
    }

    fun getFromName(name: String): ArrayList<Medication> {
        val res = ArrayList<Medication>()
         runBlocking {
            collection.createIndex(Indexes.text("title"))
            return@runBlocking collection.find(Filters.text(name)).limit(10).collect {
                res.add(it)
            }
        }
        return res
    }

    fun test() : ArrayList<Medication> {
        val l = ArrayList<Medication>()
         runBlocking {
            collection.find().collect {
                l.add(it)
            }
         }
        return l
    }
}