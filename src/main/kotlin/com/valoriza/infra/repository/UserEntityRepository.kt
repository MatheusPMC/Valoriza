package com.valoriza.infra.repository

import com.valoriza.infra.entity.UserEntity
import javax.inject.Singleton

@Singleton
interface UserEntityRepository {
    fun userSave(userEntity: UserEntity): UserEntity
}