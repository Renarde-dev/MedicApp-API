package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class HasAsmrOpinion(
    val CISCode: String,
    val HasDossierCode: String,
    val EvaluationReason : String,
    val TransparencyCommissionOpinionDate: String,
    val AsmrValue: String,
    val AsmrLabel: String,
    val TransparencyCommissionOpinionLinks: List<TransparencyCommissionOpinionLinks>




)