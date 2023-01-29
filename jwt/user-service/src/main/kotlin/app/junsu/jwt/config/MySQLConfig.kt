package app.junsu.jwt.config

import io.r2dbc.spi.ConnectionFactory
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator
import org.springframework.stereotype.Component

@Component
class MySQLConfig {

    @Bean
    fun init(
        connectionFactory: ConnectionFactory,
    ): ConnectionFactoryInitializer {
        return ConnectionFactoryInitializer().apply {
            setConnectionFactory(connectionFactory)
            setDatabasePopulator(
                ResourceDatabasePopulator(
                    ClassPathResource("scripts/user_scheme.sql"),
                ),
            )
        }
    }
}
