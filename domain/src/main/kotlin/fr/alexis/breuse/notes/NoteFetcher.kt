package fr.alexis.breuse.notes

import fr.alexis.breuse.api.FetchNote
import fr.alexis.breuse.spi.Notes

class NoteFetcher(val notes: Notes) : FetchNote {
    override fun all(): List<Note> = notes.fetchAll()
}