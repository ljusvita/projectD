package com.example.lottery.app

import spock.lang.Ignore
import spock.lang.Specification

class Loto7Test extends Specification {

    def setup() {
        Loto7 loto7 = new Loto7()
        assert loto7.getNumbers().size() == 0
    }

    def "로또7이 랜덤으로 7개 무작위 번호를 생성 할 것"() {
        // 테스트 대상의 실행에 전제되는 조건 & 테스트 대상의 실행
        given:
        Loto7 loto7

        when:
        loto7 = new Loto7.builder().quickPick().build()

        // 테스트 대상의 실행 결과
        then:
        loto7.getNumbers().size() == 7
    }

    def "로또7 퀵픽 실행 후 매번 다른 결과가 생성될 것"() {
        // 테스트 대상의 실행에 전제되는 조건
        given:
        Loto7 firstGameOfLoto7 = new Loto7.builder().quickPick().build()
        Loto7 secondGameOfLoto7 = new Loto7.builder().quickPick().build()

        // 테스트 대상의 실행
        when:
        var firstGame = firstGameOfLoto7.getNumbers()
        var secondGame = secondGameOfLoto7.getNumbers()

        // 테스트 대상의 실행 결과
        then:
        firstGame.size() == 7
        secondGame.size() == 7
        firstGame != secondGame
    }
}
