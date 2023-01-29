package app.junsu.jwt.domain.entity.user

import app.junsu.jwt.domain.entity.base.BaseEntity
import jakarta.persistence.*

@Entity
data class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null
    @Column(name = "email")
    var email: String
    @Column(name = "username")
    var username: String
    @Column(name = "profile_url")
    var profileUrl: String?
}