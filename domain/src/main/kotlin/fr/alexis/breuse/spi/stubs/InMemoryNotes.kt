package fr.alexis.breuse.spi.stubs

import fr.alexis.breuse.notes.Note
import fr.alexis.breuse.spi.Notes

class InMemoryNotes(private val notes: HashMap<String, Note> = HashMap()) : Notes {

    override fun save(note: Note): Note {
        notes[note.content] = note
        return note
    }

    override fun fetchAll(): List<Note> = notes.values.toList()
}