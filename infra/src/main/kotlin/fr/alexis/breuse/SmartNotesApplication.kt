package fr.alexis.breuse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SmartNotesApplication

fun main(args: Array<String>) {
    runApplication<SmartNotesApplication>(*args)
}