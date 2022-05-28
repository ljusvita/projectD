package com.example.lottery.app

import org.junit.jupiter.api.Order
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Ignore
import spock.lang.Specification

@WebFluxTest(Loto6Controller.class)
class Loto6ServiceTest extends Specification {

    @Autowired
    private WebTestClient webTestClient

    @Ignore
    def "1부터 43까지의 랜덤한 6자리 자연수가 중복없이 선택되어 반환될것"() {
        given:
        Loto6Service target = new Loto6Service()
        List<String> expect = List.of("1", "2", "3", "4", "5", "6")

        when:
        List<String> actual = target.pick()

        then:
        actual.stream().filter( o -> expect.contains(o))
        actual.size() == expect.size()
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
