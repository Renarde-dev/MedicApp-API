package fr.medicapp.entities

data class User(
    val id : String,
    val lastName: String,
    val firstName : String,
    val age: Int,
    val email: String,
    val passwordHash: String
)

