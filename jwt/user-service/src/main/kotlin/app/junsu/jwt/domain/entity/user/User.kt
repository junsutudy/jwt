package app.junsu.jwt.domain.entity.user

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("user")
data class User(
    @Id val id: Long? = null,
    @Column("email") val email: String,
    @Column("username") val username: String,
    @Column("profile_url") val profileUrl: String,
    @CreatedDate @Column("created_at") val createdAt: LocalDateTime? = null,
    @LastModifiedDate @Column("created_at") val updatedAt: LocalDateTime? = null,
)
