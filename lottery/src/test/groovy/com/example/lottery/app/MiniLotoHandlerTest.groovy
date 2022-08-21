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

@WebFluxTest(MiniLotoHandler.class)
class MiniLotoHandlerTest extends Specification {

    @Autowired
    MiniLotoHandler miniLotoHandler

    WebTestClient webTestClient

    def setup() {
        RouterFunction<ServerResponse> routerFunction = RouterFunctions.route(
                RequestPredicates.GET("/loto/mini") & RequestPredicates.accept(MediaType.APPLICATION_JSON),
                miniLotoHandler::miniloto)
        webTestClient = WebTestClient.bindToRouterFunction(routerFunction).build();
    }

    @Order(1)
    def "mini 로또 가 webTestClient 로 테스트 될것"() {
        expect: "mini 로또 가 webTestClient 로 테스트 될것"
        webTestClient.get()
                .uri("/loto/mini")
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath('$.numbers').isNotEmpty()
                .jsonPath('$.numbers').isArray()
                .consumeWith(
                        result -> result.getResponseBody().size() == 5)
    }
}
