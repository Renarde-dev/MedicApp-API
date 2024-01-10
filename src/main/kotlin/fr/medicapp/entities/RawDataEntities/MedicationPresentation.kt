package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class MedicationPresentation(
    val CISCode: String,
    val CIP7Code: String,
    val PresentationLabel: String,
    val PresentationStatus: String,
    val PresentationCommercializationStatus: String,
    val CommercializationDeclarationDate: String?,
    val CIP13Code: String,
    val ApprovalForCommunities: Boolean?,
    val ReimbursementRates: List<Float>,
    val PriceWithoutHonoraryInEuro: Float?,
    val PriceWithHonoraryInEuro: Float?,
    val PriceHonoraryInEuro: Float?,
    val ReimbursementIndications: String
)
