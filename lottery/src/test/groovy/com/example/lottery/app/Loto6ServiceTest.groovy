package com.example.lottery.app

import spock.lang.Specification

class Loto6ServiceTest extends Specification {

    def "1부터 43까지의 랜덤한 6자리 자연수가 중복없이 선택되어 반환될것"() {
        given:
        Loto6Service target = new Loto6Service()
        List<String> expect = List.of("1", "2", "3", "4", "5", "6")

        when:
        List<String> actual = target.pick()

        then:
        actual.stream().filter( o -> expect.contains(o))
        6 == expect.size()
    }
}
