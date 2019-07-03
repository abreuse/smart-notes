package fr.alexis.breuse.spi

import fr.alexis.breuse.notes.Note

interface Notes {
    fun save(note: Note): Note

    fun fetchAll(): List<Note>
}