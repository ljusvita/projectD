package com.example.lottery.app

import spock.lang.Specification

import java.util.stream.Collectors

class Loto7ServiceTest extends Specification {

    def "1부터 37까지의 랜덤한 7자리 자연수가 중복없이 선택되어 반환될것"() {
        given:
        Loto7Service target = new Loto7Service()

        when:
        Loto7 actual = target.pick()

        then:
        actual.getNumbers().stream().distinct().collect(Collectors.toList()).size() == 7
    }
}
