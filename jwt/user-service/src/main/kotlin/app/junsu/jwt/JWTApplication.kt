package app.junsu.jwt

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JWTApplication : SpringApplication()

fun main(args: Array<String>) {
    runApplication<JWTApplication>(*args)
}
