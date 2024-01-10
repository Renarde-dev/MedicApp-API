package fr.medicapp.entities

import kotlinx.serialization.Serializable

@Serializable
data class Medication(
    val _id : String, // cisCode
    val name: String,
    val administrationRoutes : List<String>,
    val importantInformations: List<String>,
    val prescriptionDispensingConditions: List<String>,
) {
    override fun toString(): String {
        return "Medication(_id='$_id', name='$name', administrationRoutes=$administrationRoutes, importantInformations=$importantInformations, prescriptionDispensingConditions=$prescriptionDispensingConditions)"
    }
}