package fr.alexis.breuse.notes

import fr.alexis.breuse.api.CreateNote
import fr.alexis.breuse.spi.Notes

class NoteCreator(val notes: Notes) : CreateNote {
    override fun with(content: String): Note = notes.save(Note(content))
}