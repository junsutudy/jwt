package app.junsu.jwt.service.user

import app.junsu.jwt.domain.entity.user.User
import app.junsu.jwt.domain.repository.user.UserRepository
import app.junsu.jwt.exception.ServerException.UserExistException
import app.junsu.jwt.model.signup.SignUpRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.ResponseStatus

@Service
class UserService(
    @Autowired private val userRepository: UserRepository,
) {

    @Transactional
    @ResponseStatus(HttpStatus.NO_CONTENT)
    suspend fun signUp(
        request: SignUpRequest,
    ) {

        userRepository.findByEmail(request.email)?.let {
            throw UserExistException()
        }

        val user = with(request) {
            User(
                email = email,
                username = username,
                profileUrl = profileUrl ?: DEFAULT_PROFILE_URL,
            )
        }

        userRepository.save(user)
    }
}

private const val DEFAULT_PROFILE_URL = "https://avatars.githubusercontent.com/u/101160207?v=4"
