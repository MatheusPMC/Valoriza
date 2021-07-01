package com.valoriza.application.controller


import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.security.annotation.Secured
import java.security.Principal


@Secured("isAuthenticated()") // <1>
@Controller("/")
class UserController() {

    @Produces(MediaType.TEXT_PLAIN) // <3>
    @Get("/user")  // <4>
    fun index(principal: Principal): String {  // <5>
        return principal.name
    }

}
