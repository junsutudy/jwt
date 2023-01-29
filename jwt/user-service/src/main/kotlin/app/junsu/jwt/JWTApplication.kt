package app.junsu.jwt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@SpringBootApplication
@ConfigurationPropertiesScan
class JWTApplication

fun main(args: Array<String>) {
    runApplication<JWTApplication>(*args)
}
