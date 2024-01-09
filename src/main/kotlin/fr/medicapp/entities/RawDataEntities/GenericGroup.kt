package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class GenericGroup(
    val genericGroupId: String,
    val genericGroupLabel: String,
    val cisCode: String,
    val genericType: String,
    val sortNumber: Int?
)
