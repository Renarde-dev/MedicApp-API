package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class TransparencyCommissionOpinionLinks(
    val HasDossierCode: String,
    val CommissionOpinionLink: String?
)
