package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class GenericGroup(
    val GenericGroupId: String,
    val GenericGroupLabel: String,
    val CISCode: String,
    val GenericType: String,
    val SortNumber: Int?
)
