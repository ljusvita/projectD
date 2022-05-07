package com.example.lottery

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@AutoConfigureMockMvc
@WebMvcTest
class LotteryControllerTest extends Specification {

    @Autowired
    private MockMvc mvc

    def "when get is performed then the response has status 200 and content is '1, 2, 3, 4, 5, 6'"() {
        expect: "Status is 200 and the response is '1, 2, 3, 4, 5, 6'"
        mvc.perform(get("/lotto6"))
                .andExpect(status().isOk())
                .andReturn()
                .response
                .contentAsString == "1, 2, 3, 4, 5, 6"
    }
}
