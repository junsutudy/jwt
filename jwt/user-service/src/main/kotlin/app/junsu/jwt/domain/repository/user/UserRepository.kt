package app.junsu.jwt.domain.repository.user

import app.junsu.jwt.domain.entity.user.User
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserRepository : CoroutineCrudRepository<User, Long> {

    suspend fun findByEmail(email: String) : User?
}
