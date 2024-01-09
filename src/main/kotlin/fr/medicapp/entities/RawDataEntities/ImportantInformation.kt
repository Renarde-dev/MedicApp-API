package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class ImportantInformation(
    val cisCode: String,
    val safetyInformationStartDate: String?,
    val safetyInformationEndDate: String?,
    val safetyInformationLink: String
)
