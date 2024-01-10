package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class MedicationComposition(
    val CISCode: String,
    val PharmaceuticalElementDesignation: String,
    val SubstanceCode: String,
    val SubstanceName: String,
    val SubstanceDosage: String,
    val DosageReference: String,
    val ComponentNature: String,
    val LinkNumber: Int?
)
