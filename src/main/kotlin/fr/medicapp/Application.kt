package fr.medicapp

import fr.medicapp.plugins.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 11020, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    //configureSecurity()
    configureHTTP()
    configureSerialization()
    configureRouting()
}