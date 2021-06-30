package com.valoriza.application.controller

import com.valoriza.application.dto.UserDto
import com.valoriza.core.mapper.UserConverter
import com.valoriza.core.port.UserServicePort
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.*

@Controller("users")
class UserController(private val userService: UserServicePort) {
    @Post
    fun create(@Body userDto: UserDto): HttpResponse<Any> {
        userDto.id = UUID.randomUUID()
        val userDto = userService.createUser(UserConverter.userDtoToUser(userDto))
        return HttpResponse.created(HttpStatus.CREATED).body(userDto)
    }

}