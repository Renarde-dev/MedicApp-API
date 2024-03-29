package fr.medicapp.plugins

import fr.medicapp.dao.DaoUser
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureSecurity() {
    authentication {
        basic(name = "authenticationAPI") {
            realm = "User login"
            validate { credentials ->
                val tryUser = DaoUser.INSTANCE.getByEmail(credentials.name)
                if (tryUser ==  null){
                    null
                }else {
                    if (tryUser.passwordHash == credentials.password) {
                        UserIdPrincipal(tryUser.id)
                    } else {
                        null
                    }
                }
            }
        }
    }
    routing {
        /*authenticate("authenticationAPI") {
            get("/protected/route/basic") {
                val principal = call.principal<UserIdPrincipal>()!!
                call.respondText("Hello ${principal.name}")
            }
        }*/

        TODO("Routing des Users, exemple ci-dessus")
    }
}