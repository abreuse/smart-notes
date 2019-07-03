package fr.alexis.breuse.controller

import org.hamcrest.Matchers.`is`
import org.junit.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@ExtendWith(SpringExtension::class)
@WebMvcTest(NoteController::class)
class NoteControllerTest {

    @Autowired
    private lateinit var mvc: MockMvc

    @Test
    fun should_create_a_note() {
        mvc.perform(
                post("/notes"))
                .andExpect(status().isCreated)
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.content", `is`("my content")))
    }
}