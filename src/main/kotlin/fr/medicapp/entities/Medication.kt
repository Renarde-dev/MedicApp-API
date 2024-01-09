package fr.medicapp.entities

data class Medication(
    val _id : String, // cisCode
    val name: String,
    val administrationRoutes : List<String>,
    val importantInformations: List<String>,
    val prescriptionDispensingConditions: List<String>
)
