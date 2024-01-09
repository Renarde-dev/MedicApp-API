package fr.medicapp.entities

data class Medication(
    val cisCode : String,
    val name: String,
    val administrationRoutes : List<String>,
)
