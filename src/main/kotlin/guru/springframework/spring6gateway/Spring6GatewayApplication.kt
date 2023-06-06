package guru.springframework.spring6gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Spring6GatewayApplication

fun main(args: Array<String>) {
	runApplication<Spring6GatewayApplication>(*args)
}
