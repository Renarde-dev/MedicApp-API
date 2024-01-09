package fr.medicapp.entities

data class Medication(
    val _id : String,
    val name: String,
    val administrationRoutes : Array<String>,
    val importantInformation : Array<String>
)
