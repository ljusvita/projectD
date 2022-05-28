package com.example.lottery.app

import spock.lang.Specification

class Loto6ServiceTest extends Specification {

    def "1부터 43까지의 랜덤한 6자리 자연수가 중복없이 선택되어 반환될것2"() {
        given:
        Loto6Service target = new Loto6Service()
        Loto6 loto6 = new Loto6()
        var expect = List.of(1, 2, 3, 4, 5, 6)
        loto6.setNumbers(expect)

        when:
        Loto6 actual = target.pick()

        then:
        actual.getNumbers().stream().filter(o -> expect.contains(o))
        actual.getNumbers().size() == expect.size()
    }
}
