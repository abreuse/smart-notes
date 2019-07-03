package fr.alexis.breuse.notes

import org.apache.commons.lang3.Validate.notBlank

class Note(content: String) {
    val content: String = notBlank(content)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Note

        if (content != other.content) return false

        return true
    }

    override fun hashCode(): Int {
        return content.hashCode()
    }
}