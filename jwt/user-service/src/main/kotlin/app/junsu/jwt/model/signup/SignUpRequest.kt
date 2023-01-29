package app.junsu.jwt.model.signup

data class SignUpRequest(
    val email: String,
    val username: String,
    val profileUrl: String?,
)
