package fr.alexis.breuse.controller

import fr.alexis.breuse.api.CreateNote
import fr.alexis.breuse.api.FetchNote
import fr.alexis.breuse.resources.Note
import fr.alexis.breuse.resources.toResource
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController("/controller")
class NoteController(val createNote: CreateNote,
                     val fetchNote: FetchNote) {

    @GetMapping
    fun getAllNotes(): ResponseEntity<List<Note>> {
        return ResponseEntity(fetchNote.all().toResource(), HttpStatus.OK)
    }

    @PostMapping
    fun createNote(): ResponseEntity<Note> {
        val note = createNote.with("my content").toResource()
        return ResponseEntity.created(URI("")).body(note)
    }
}