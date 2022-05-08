package com.example.lottery

import com.example.lottery.app.Loto7Controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class LoadContextTest extends Specification {

    @Autowired (required = false)
    private Loto7Controller loto7Controller

    def "when context is loaded then all expected beans are created"() {
        expect: "the WebController is created"
        loto7Controller
    }
}
