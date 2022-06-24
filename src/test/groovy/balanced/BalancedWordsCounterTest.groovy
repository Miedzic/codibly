package balanced

import spock.lang.Specification

class BalancedWordsCounterTest extends Specification {
    def balancedWordCounter = new BalancedWordsCounter()
    def "should give proper results"(){

        given:
        def input = "aabbabcccba"

        when:
        def result = balancedWordCounter.count(input)

        then:
        result == 28
    }
    def "should return 0 if string is empty"(){

        given:
        def input = ""

        when:
        def result = balancedWordCounter.count(input)

        then:
        result == 0
    }
    def "should throw Runtime Exception if string contains number"(){

        given:
        def input = "abababa1"

        when:
        def result = balancedWordCounter.count(input)

        then:
        thrown RuntimeException
    }
    def "should throw Runtime Exception if input was null"(){

        given:
        def input = null

        when:
        def result = balancedWordCounter.count(input)

        then:
        thrown RuntimeException
    }
}
