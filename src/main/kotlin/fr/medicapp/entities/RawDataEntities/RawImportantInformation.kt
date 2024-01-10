package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class RawImportantInformation(
    val CISCode: String,
    val SafetyInformationStartDate: String?,
    val SafetyInformationEndDate: String?,
    val SafetyInformationLink: String
)
