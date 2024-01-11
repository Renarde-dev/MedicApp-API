package fr.medicapp.dao

import com.mongodb.kotlin.client.coroutine.MongoClient
import com.mongodb.kotlin.client.coroutine.MongoCollection
import fr.medicapp.entities.Medication
import fr.medicapp.entities.User

class MongoInstance {

    private var medicationCollection : MongoCollection<Medication>
    private var userCollection : MongoCollection<User>

    init {
        val uri = "mongodb+srv://ktor:fs14FL4ibexKAFds@sae-medecine-solution.0vspyix.mongodb.net/?retryWrites=true&w=majority"
        val mongoClient = MongoClient.create(uri)
        val database = mongoClient.getDatabase("MedicApp")
        medicationCollection = database.getCollection<Medication>("Medication")
        userCollection = database.getCollection<User>("User")
    }

    fun getMedicationCollection(): MongoCollection<Medication> {
        return medicationCollection
    }

    fun getUserCollection(): MongoCollection<User> {
        return userCollection
    }


}