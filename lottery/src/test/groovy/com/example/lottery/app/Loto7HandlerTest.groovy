package com.example.lottery.app

import org.junit.jupiter.api.Order
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.web.reactive.function.server.RequestPredicates
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse
import spock.lang.Specification

@WebFluxTest(Loto7Handler.class)
class Loto7HandlerTest extends Specification {

    @Autowired
    Loto7Handler loto7Handler

    WebTestClient webTestClient

    def setup() {
        RouterFunction<ServerResponse> routerFunction = RouterFunctions.route(
                RequestPredicates.GET("/loto/7") & RequestPredicates.accept(MediaType.APPLICATION_JSON),
                loto7Handler::loto7)
        webTestClient = WebTestClient.bindToRouterFunction(routerFunction).build();
    }

    @Order(1)
    def "로또7 엔드포인트가 webTestClient 로 테스트 될것"() {
        expect: "로또7 엔드포인트가 webTestClient 로 테스트 될것"
        webTestClient.get()
                .uri("/loto/7")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath('$.numbers').isNotEmpty()
                .jsonPath('$.numbers').isArray()
                .consumeWith(
                        result -> result.getResponseBody().size() == 7)
    }
}
