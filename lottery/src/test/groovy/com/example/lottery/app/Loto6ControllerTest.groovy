package com.example.lottery.app

import org.junit.jupiter.api.Order
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Ignore
import spock.lang.Specification

@WebFluxTest(Loto6Controller.class)
class Loto6ControllerTest extends Specification {

    @Autowired
    private WebTestClient webTestClient

    @Ignore
    def "when get is performed then the response has status 200 and content is '1, 2, 3, 4, 5, 6'"() {
        expect: "Status is 200 and the response is '1, 2, 3, 4, 5, 6'"
        webTestClient.get()
                .uri("/loto6")
                .exchange()
                .expectStatus().isOk()
                .expectBody(List<String>.class)
                .isEqualTo(List.of("1", "2", "3", "4", "5", "6"))
    }

    @Order(1)
    def "when get is performed then the response has status 200 and the content consist of json elements"() {
        expect: "Status is 200 and the response consist of json elements"
        webTestClient.get()
                .uri("/loto6")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath('$.numbers6').isNotEmpty()
//                .jsonPath('$.numbers6[0]').isEqualTo(1)
    }
}