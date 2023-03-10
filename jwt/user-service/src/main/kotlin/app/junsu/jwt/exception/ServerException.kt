package app.junsu.jwt.exception

sealed class ServerException(
    val code: Int,
    override val message: String,
) : RuntimeException(message) {

    data class UserExistException(
        override val message: String = "User Already Exists",
    ) : ServerException(
        code = 409,
        message = message,
    )

    data class UserNotFoundException(
        override val message: String = "User Does Not Exists"
    ) : ServerException(
        code = 404,
        message = message,
    )

    data class PasswordMismatchException(
        override val message: String = "Password Mismatch"
    ) : ServerException(
        code = 400,
        message = message,
    )
}
