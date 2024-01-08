package fr.medicapp.dao

import com.mongodb.kotlin.client.coroutine.MongoClient
import com.mongodb.kotlin.client.coroutine.MongoCollection
import fr.medicapp.entities.Medication
import fr.medicapp.entities.User

class MongoInstance {

    private var medicationCollection : MongoCollection<Medication>
    private var userCollection : MongoCollection<User>

    init {
        val uri = "CONNECTION_STRING_URI_PLACEHOLDER"
        val mongoClient = MongoClient.create(uri)
        val database = mongoClient.getDatabase("MedicApp")
        medicationCollection = database.getCollection<Medication>("medication")
        userCollection = database.getCollection<User>("user")
    }

    fun getMedicationCollection(): MongoCollection<Medication> {
        return medicationCollection
    }

    fun getUserCollection(): MongoCollection<User> {
        return userCollection
    }


}