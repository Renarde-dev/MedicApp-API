package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class MedicationPresentation(
    val cisCode: String,
    val cip7Code: String,
    val presentationLabel: String,
    val presentationStatus: String,
    val presentationCommercializationStatus: String,
    val commercializationDeclarationDate: String?,
    val cip13Code: String,
    val approvalForCommunities: Boolean?,
    val reimbursementRates: List<Float>,
    val priceWithoutHonoraryInEuro: Float?,
    val priceWithHonoraryInEuro: Float?,
    val priceHonoraryInEuro: Float?,
    val reimbursementIndications: String
)
