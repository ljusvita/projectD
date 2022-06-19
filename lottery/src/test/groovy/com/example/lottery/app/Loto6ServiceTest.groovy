package com.example.lottery.app

import java.util.stream.Collectors
import spock.lang.Specification

class Loto6ServiceTest extends Specification {

    def "1부터 43까지의 랜덤한 6자리 자연수가 중복없이 선택되어 반환될것"() {
        given:
        Loto6Service target = new Loto6Service()

        when:
        Loto6 actual = target.pick()

        then:
        actual.getNumbers().stream().distinct().collect(Collectors.toList()).size() == 6
    }
}
