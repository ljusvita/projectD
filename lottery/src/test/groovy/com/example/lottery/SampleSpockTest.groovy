package com.example.lottery

import spock.lang.Specification
import spock.lang.Unroll

class SampleSpockTest extends Specification {

    @Unroll
    def "산도스라는 인간은 #question"() {
        given:
        String sentence = '산도스는 '

        when:
        sentence += question
        boolean result = sentence == answer

        then:
        result == expected

        where:
        question | answer | expected
        '잘생겼다' | '산도스는 잘생겼다' | true
        '똑똑하다' | '산도스는 똑똑하다' | true
        '바보같다' | '산도스는 바보같다..?' | false
    }
}
