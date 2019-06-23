package infra

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SmartNotesApplication

fun main(args: Array<String>) {
    runApplication<SmartNotesApplication>(*args)
}