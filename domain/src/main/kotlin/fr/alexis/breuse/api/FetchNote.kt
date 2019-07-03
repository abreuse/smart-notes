package fr.alexis.breuse.api

import fr.alexis.breuse.notes.Note

interface FetchNote {
    fun all(): List<Note>
}