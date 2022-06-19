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

    @Order(1)
    def "get 메소드가 실행되면 response 스테이터스 코드는 200이고 json 요소로 구성되어 있을 것"() {
        expect: "스테이터스 코드 200 이고 numbers 라는 이름의 6개의 요소를 가진 json 객체일 것"
        webTestClient.get()
                .uri("/loto6")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath('$.numbers').isNotEmpty()
                .jsonPath('$.numbers').isArray()
                .consumeWith(
                        result -> result.getResponseBody().size() == 6)
    }
}
