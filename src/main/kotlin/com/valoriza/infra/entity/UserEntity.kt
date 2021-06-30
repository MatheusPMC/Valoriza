package com.valoriza.infra.entity

import io.micronaut.core.annotation.Introspected
import java.util.*

@Introspected
data class UserEntity (
    val id: UUID? = null,
    val name: String = "",
    val email: String = "",
    val password: String = "",
    var created_at: String? = "",
    var updated_at: String? = "",
)