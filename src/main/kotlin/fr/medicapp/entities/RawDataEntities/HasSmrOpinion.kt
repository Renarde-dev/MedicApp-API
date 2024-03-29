package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class HasSmrOpinion(
    val CISCode: String,
    val HasDossierCode: String,
    val EvaluationReason: String,
    val TransparencyCommissionOpinionDate: String?,
    val SmrValue: String,
    val SmrLabel: String,
    val TransparencyCommissionOpinionLinks: List<TransparencyCommissionOpinionLinks>
)
