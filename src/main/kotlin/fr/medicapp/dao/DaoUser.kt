package fr.medicapp.dao

import com.mongodb.client.model.Filters
import fr.medicapp.entities.User
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.runBlocking

enum class DaoUser {
    INSTANCE;

    private val collection = MongoInstance().getUserCollection()

    fun getById(id: String) : User? {
        return runBlocking { collection.find(Filters.eq("id",id)).firstOrNull() }
    }

    fun getByEmail(email : String) : User? {
        return runBlocking { collection.find(Filters.eq("email",email)).firstOrNull() }
    }

    fun updateUser(user: User) : Boolean {
        return runBlocking {
            if (collection.find(Filters.eq("id",user.id)).firstOrNull() != null) {
                collection.replaceOne(Filters.eq("id",user.id),user)
                return@runBlocking true
            } else {
                return@runBlocking false
            }
        }
    }

    fun deleteUser(user: User) : Boolean {
        return runBlocking {
            if (collection.find(Filters.eq("id",user.id)).firstOrNull() != null) {
                collection.deleteOne(Filters.eq("id",user.id))
                return@runBlocking true
            } else {
                return@runBlocking false
            }
        }
    }
}