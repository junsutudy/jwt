package app.junsu.jwt.controller.user

import app.junsu.jwt.model.signup.SignUpRequest
import app.junsu.jwt.service.user.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(
    private val userService: UserService,
) {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    suspend fun signUp(
        @RequestBody request: SignUpRequest,
    ) {
        userService.signUp(request)
    }
}
