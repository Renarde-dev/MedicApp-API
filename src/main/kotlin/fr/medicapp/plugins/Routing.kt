package fr.medicapp.plugins

import fr.medicapp.dao.DaoMedication
import fr.medicapp.entities.RawDataEntities.RawData
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("API de MedicApp")
        }

        post("medication/renew") {
            val rawData = call.receive<RawData>()
            DaoMedication.INSTANCE.renewDatabase(rawData.Data)
            call.respond(200)
        }

        get("medication/byCisCode/{ciscode}") {
            if (call.parameters["ciscode"] != null) {
                val med = DaoMedication.INSTANCE.getFromCisCode(call.parameters["ciscode"]!!)
                if (med != null) {
                    call.respond(med)
                } else { // if not medication is found, the CisCode is supposed invalid
                    call.respondText("Invalid CisCode", status = HttpStatusCode.NotFound)
                }
            } else {
                call.respondText("Missing parameters", status = HttpStatusCode.BadRequest)
            }
        }

        get("medication/byName/{name}") {
            if (call.parameters["ciscode"] != null) {
                val med = DaoMedication.INSTANCE.getFromName(call.parameters["name"]!!)
                if (med.isNotEmpty()) {
                    call.respond(med)
                } else {
                    call.respondText("Medication not found", status = HttpStatusCode.NotFound)
                }
            } else {
                call.respondText("Missing parameters", status = HttpStatusCode.BadRequest)
            }
        }
    }
}