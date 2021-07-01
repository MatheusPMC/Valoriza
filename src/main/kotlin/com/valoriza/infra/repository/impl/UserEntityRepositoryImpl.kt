package com.valoriza.infra.repository.impl
/*
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.BoundStatement
import com.datastax.oss.driver.api.core.cql.PreparedStatement
import com.valoriza.infra.entity.UserEntity
import com.valoriza.infra.repository.UserEntityRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class UserEntityRepositoryImpl(private val session: CqlSession): UserEntityRepository {
    override fun userSave(userEntity: UserEntity): UserEntity {
        val date = Calendar.getInstance().time
        var created = date.toString().also { userEntity.created_at = it }
        var updated = date.toString().also { userEntity.updated_at = it }

        val preparedInsert: PreparedStatement = session.prepare(
            "INSERT INTO User(id, name, email, password, created_at, updated_at) VALUES (?,?,?,?,?,?) IF NOT EXISTS"
        )
        val insert: BoundStatement = preparedInsert.bind(userEntity.id,userEntity.name,userEntity.email,
            userEntity.password,created,updated)
        val result = session.execute(insert)

        if (!result.wasApplied()) {
            throw Exception()
        }
        return userEntity
    }
}

 */