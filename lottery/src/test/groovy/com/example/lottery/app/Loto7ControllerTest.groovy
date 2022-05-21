package com.example.lottery.app

import org.junit.jupiter.api.Order
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.test.web.reactive.server.WebTestClient
import reactor.core.publisher.Flux
import spock.lang.Specification

@WebFluxTest(Loto7Controller.class)
class Loto7ControllerTest extends Specification{

    @Autowired
    private WebTestClient webTestClient

    def "when get is performed then the response has status 200 and content is '1, 2, 3, 4, 5, 6, 7'"() {
        expect: "Status is 200 and the response is '1, 2, 3, 4, 5, 6, 7'"
        webTestClient.get()
            .uri("/loto7")
            .exchange()
            .expectStatus().isOk()
            .expectBody(String.class)
            .isEqualTo("1, 2, 3, 4, 5, 6, 7")
    }

    @Order(1)
    def "when get is performed then the response has status 200 and content must be String"() {
        expect: "Status is 200 and the response must be String"
        webTestClient.get()
                .uri("/loto7")
                .exchange()
                .expectStatus().isOk()
                .expectBodyList(String.class)
    }

}
