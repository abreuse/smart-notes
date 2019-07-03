package fr.alexis.breuse.resources

import fr.alexis.breuse.notes.Note as DomainNote

data class Note(val content: String)

fun DomainNote.toResource(): Note = Note(this.content)

fun List<DomainNote>.toResource(): List<Note> = this.map { it.toResource() }