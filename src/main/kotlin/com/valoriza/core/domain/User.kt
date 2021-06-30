package com.valoriza.core.domain

import java.util.*

data class User(
    val id: UUID? = null,
    val name: String = "",
    val email: String = "",
    val password: String = "",
    var created_at: String? = "",
    var updated_at: String? = "",
)