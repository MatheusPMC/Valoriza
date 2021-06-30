package com.valoriza.core.mapper

import com.valoriza.application.dto.UserDto
import com.valoriza.core.domain.User
import com.valoriza.infra.entity.UserEntity
import javax.inject.Singleton

@Singleton
class UserConverter {
    companion object {
        fun userDtoToUser(userDto: UserDto) =
            User(userDto.id,userDto.name,userDto.email,
                userDto.password,userDto.created_at,userDto.updated_at)

        fun userToUserEntity(user: User) =
            UserEntity(user.id,user.name,user.email,
                user.password)

        fun userEntityToUser(userEntity: UserEntity) =
            User(userEntity.id,userEntity.name,userEntity.email,
                userEntity.password)

        fun userToUserDto(user: User) =
            UserDto(user.id,user.name,user.email,
                user.password,user.created_at,user.updated_at)
    }
}