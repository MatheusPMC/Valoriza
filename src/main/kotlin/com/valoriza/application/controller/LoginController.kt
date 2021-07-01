package com.valoriza.application.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client
import io.micronaut.security.authentication.UsernamePasswordCredentials
import io.micronaut.security.token.jwt.render.BearerAccessRefreshToken

@Client("/")
interface LoginController {

    @Post("/login")
    fun login(@Body credentials: UsernamePasswordCredentials): BearerAccessRefreshToken

    @Consumes(MediaType.TEXT_PLAIN)
    @Get("/")
    fun home(@Header("authorization") authorization: String): String
}
