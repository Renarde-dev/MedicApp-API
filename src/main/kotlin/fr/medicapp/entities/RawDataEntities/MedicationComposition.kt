package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class MedicationComposition(
    val cisCode: String,
    val pharmaceuticalElementDesignation: String,
    val substanceCode: String,
    val substanceName: String,
    val substanceDosage: String,
    val dosageReference: String,
    val componentNature: String,
    val linkNumber: Int?
)
