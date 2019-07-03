package fr.alexis.breuse.configuration

import fr.alexis.breuse.notes.NoteCreator
import fr.alexis.breuse.notes.NoteFetcher
import fr.alexis.breuse.spi.stubs.InMemoryNotes
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class DomainConfiguration {

    @Bean
    open fun notes() = InMemoryNotes()

    @Bean
    open fun noteCreator() = NoteCreator(notes())

    @Bean
    open fun noteFetcher() = NoteFetcher(notes())
}