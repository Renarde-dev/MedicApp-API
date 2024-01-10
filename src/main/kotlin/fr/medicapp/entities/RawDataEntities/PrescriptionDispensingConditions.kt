package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class PrescriptionDispensingConditions(
    val CISCode: String,
    val PrescriptionDispensingCondition: String
)
