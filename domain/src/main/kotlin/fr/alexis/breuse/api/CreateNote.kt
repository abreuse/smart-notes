package fr.alexis.breuse.api

import fr.alexis.breuse.notes.Note

@FunctionalInterface
interface CreateNote {
    fun with(content: String): Note
}