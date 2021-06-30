package com.valoriza.infra.service

import com.valoriza.core.domain.User
import com.valoriza.core.mapper.UserConverter
import com.valoriza.core.port.UserRepositoryPort
import com.valoriza.infra.entity.UserEntity
import com.valoriza.infra.repository.UserEntityRepository
import javax.inject.Singleton

@Singleton
class UserEntityService(private val userEntityRepository: UserEntityRepository): UserRepositoryPort {
    override fun createUser(userEntity: UserEntity): User {
        val userEntityResult = userEntityRepository.userSave(userEntity)
        return UserConverter.userEntityToUser(userEntityResult)
    }
}