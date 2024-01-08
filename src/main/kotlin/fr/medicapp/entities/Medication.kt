package fr.medicapp.entities

data class Medication(
    val name: String,
    val cisCode: String,
    val administrationRoutes : Array<String>,
    val importantInformation : Array<String>
)
