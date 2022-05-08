package com.example.lottery.app

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Specification

@WebFluxTest(Lottery7Controller.class)
class Lottery7ClientTest extends Specification{

    @Autowired
    private WebTestClient webTestClient

    def "when get is performed then the response has status 200 and content is '1, 2, 3, 4, 5, 6, 7'"() {
        expect: "Status is 200 and the response is '1, 2, 3, 4, 5, 6, 7'"
        webTestClient.get()
            .uri("/lotto7")
            .exchange()
            .expectStatus().isOk()
            .expectBody(String)
            .value( result -> result == "1, 2, 3, 4, 5, 6, 7")
    }

}
