package com.example.lottery.app

import spock.lang.Specification

class Loto6Test extends Specification {

    def setup() {
        Loto6 loto6 = new Loto6()
        assert loto6.getNumbers().size() == 0
    }

    def "로또6가 랜덤으로 6개 무작위 번호를 생성 할 것"() {
        // 테스트 대상의 실행에 전제되는 조건
        given:
        Loto6 loto6 = new Loto6()

        when:
        loto6.quickPick()

        then:
        loto6.getNumbers().size() == 6
    }

    def "로또6 퀵픽 실행 후 매번 다른 결과가 생성될 것"() {
        // 테스트 대상의 실행에 전제되는 조건
        given:
        Loto6 firstGameOfLoto6 = new Loto6()
        firstGameOfLoto6.quickPick()

        Loto6 secondGameOfLoto6 = new Loto6()
        secondGameOfLoto6.quickPick()

        // 테스트 대상의 실행
        when:
        var firstGame = firstGameOfLoto6.getNumbers()
        var secondGame = secondGameOfLoto6.getNumbers()

        // 테스트 대상의 실행 결과
        then:
        firstGame.size() == 6
        secondGame.size() == 6
        firstGame != secondGame
    }
}
