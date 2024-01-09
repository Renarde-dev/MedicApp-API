package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class TransparencyCommissionOpinionLinks(
    val hasDossierCode: String,
    val commissionOpinionLink: String?
)
