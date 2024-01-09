package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable

@Serializable
data class MedicationRawData (
    val CISCode: String,
    val Name: String,
    val PharmaceuticalForm: String,
    val AdministrationRoutes: List<String>,
    val MarketingAuthorizationStatus: String,
    val MarketingAuthorizationProcedureType: String,
    val CommercializationStatus: String,
    val MarketingAuthorizationDate: String?,
    val BdmStatus: String,
    val EuropeanAuthorizationNumber: String,
    val Holders: List<String>,
    val EnhancedMonitoring: Boolean?,
    val MedicationCompositions: List<MedicationComposition>,
    val MedicationPresentations: List<MedicationPresentation>,
    val GenericGroups: List<GenericGroup>,
    val HasSmrOpinions: List<HasSmrOpinion>,
    val HasAsmrOpinions: List<HasSmrOpinion>,
    val ImportantInformations: List<RawImportantInformation>,
    val PrescriptionDispensingConditions: List<PrescriptionDispensingConditions>
)