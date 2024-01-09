package fr.medicapp.entities.RawDataEntities

import kotlinx.serialization.Serializable
import java.util.ArrayList

@Serializable
data class RawData(
    val Data: ArrayList<MedicationRawData>
)
