package app.junsu.jwt.controller.user

import app.junsu.jwt.model.signup.SignUpRequest
import app.junsu.jwt.service.user.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    @Autowired private val userService: UserService,
) {

    @PostMapping
    suspend fun signUp(
        request: SignUpRequest,
    ) {
        userService.signUp(request)
    }
}
