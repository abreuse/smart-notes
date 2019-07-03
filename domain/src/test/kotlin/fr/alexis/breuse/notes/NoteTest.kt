package fr.alexis.breuse.notes

import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class NoteTest {

    @Test
    fun should_not_create_note_with_empty_content() {
        assertThatThrownBy { createEmptyNote() }.isInstanceOf(IllegalArgumentException::class.java)
    }

    private fun createEmptyNote() = Note("")
}