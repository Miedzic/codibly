package bubble

import spock.lang.Specification

class BubbleSortTest extends Specification {
    def bubbleSort = new BubbleSort();
    def "should sort integer numbers"(){

        given:
        def input = [1,4,5,6,8,3,8]

        when:
        def result = bubbleSort.sort(input)

        then:
        result == [1,3,4,5,6,8,8]
    }
    def "should sort float numbers"(){

        given:
        def input = [-9.3,0.2,4.0,0.1,5.0,9.0]

        when:
        def result = bubbleSort.sort(input)

        then:
        result == [-9.3,0.1,0.2,4,5,9]
    }
    def "should output empty array"(){

        given:
        def input = []

        when:
        def result = bubbleSort.sort(input)

        then:
        result == []
    }
    def "should remove null if there are other characters"(){

        given:
        def input = [null,5.0001]

        when:
        def result = bubbleSort.sort(input)

        then:
        result == [5.0001]
    }
    def "should throw Runtime Exception if there is null input"(){
        given:
        def input = [null]

        when:
        def result = bubbleSort.sort(input)

        then:
        thrown RuntimeException
    }
}
