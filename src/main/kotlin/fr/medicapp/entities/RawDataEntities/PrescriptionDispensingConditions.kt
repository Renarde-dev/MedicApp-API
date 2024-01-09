package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class PrescriptionDispensingConditions(
    val cisCode: String,
    val prescriptionDispensingCondition: String
)
