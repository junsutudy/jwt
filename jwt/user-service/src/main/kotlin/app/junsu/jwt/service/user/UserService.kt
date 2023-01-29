package app.junsu.jwt.service.user

import app.junsu.jwt.domain.entity.user.User
import app.junsu.jwt.domain.repository.user.UserRepository
import app.junsu.jwt.exception.ServerException.UserExistException
import app.junsu.jwt.model.signup.SignUpRequest
import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
     private val userRepository: UserRepository,
) {

    private val logger = KotlinLogging.logger {}
    @Transactional
    suspend fun signUp(
        request: SignUpRequest,
    ) {
        with(request) {

            logger.warn { email }

            userRepository.findUserByEmail(email)

            logger.warn { email }

            userRepository.findUserByEmail(email)?.let {
                throw UserExistException()
            }

            val user = User(
                email = email,
                username = username,
                profileUrl = profileUrl ?: DEFAULT_PROFILE_URL,
            )

            userRepository.save(user)
        }
    }
}

private const val DEFAULT_PROFILE_URL = "https://avatars.githubusercontent.com/u/101160207?v=4"
