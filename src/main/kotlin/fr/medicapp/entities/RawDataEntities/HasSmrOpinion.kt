package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class HasSmrOpinion(
    val cisCode: String,
    val hasDossierCode: String,
    val evaluationReason: String,
    val transparencyCommissionOpinionDate: String?,
    val asmrValue: String,
    val asmrLabel: String,
    val transparencyCommissionOpinionLinks: List<TransparencyCommissionOpinionLinks>
)
