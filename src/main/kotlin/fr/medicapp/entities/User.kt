package fr.medicapp.entities

data class User(
    val lastName: String,
    val firstName : String,
    val age: Int,
    val email: String,
    val passwordHash: String
)

