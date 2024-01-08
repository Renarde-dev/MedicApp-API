package fr.medicapp.dao

import com.mongodb.client.model.Filters
import com.mongodb.client.model.Indexes
import fr.medicapp.entities.Medication
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.runBlocking
import java.util.ArrayList

enum class DaoMedication {
    INSTANCE;

    val collection = MongoInstance().getMedicationCollection()


    fun getFromCisCode(ciscode: String): Medication? {
        return runBlocking {
            collection.find(Filters.eq("ciscode",ciscode)).firstOrNull()
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
}