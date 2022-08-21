package com.example.lottery.app

import spock.lang.Ignore
import spock.lang.Specification

class Loto7Test extends Specification {

    def setup() {
        Loto7 loto7 = new Loto7()
        assert loto7.getNumbers().size() == 0
    }

    def "로또7이 랜덤으로 7개 무작위 번호를 생성 할 것"() {
        // 테스트 대상의 실행에 전제되는 조건
        given:
        Loto7 loto7 = new Loto7()

        // 테스트 대상의 실행
        when:
        loto7.quickPick()

        // 테스트 대상의 실행 결과
        then:
        loto7.getNumbers().size() == 7

        // 테스트 대상의 결과 상세
//        where:
    }
}
