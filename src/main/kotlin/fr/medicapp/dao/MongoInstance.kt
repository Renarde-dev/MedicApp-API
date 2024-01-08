package fr.medicapp.dao

import com.mongodb.kotlin.client.coroutine.MongoClient
import com.mongodb.kotlin.client.coroutine.MongoCollection
import fr.medicapp.entities.Medication
import fr.medicapp.entities.User

class MongoInstance {

    lateinit var MedicationCollection : MongoCollection<Medication>
    lateinit var UserCollection : MongoCollection<User>

    init {
        val uri = "CONNECTION_STRING_URI_PLACEHOLDER"
        val mongoClient = MongoClient.create(uri)
        val database = mongoClient.getDatabase("MedicApp")
        MedicationCollection = database.getCollection<Medication>("medication")
        UserCollection = database.getCollection<User>("user")
    }

}