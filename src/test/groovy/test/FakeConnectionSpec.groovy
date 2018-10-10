package test

import spock.lang.Specification

class FakeConnectionSpec extends Specification {

    def 'test'() {
        setup:
        FakeConnection fakeConnection = new FakeConnection()

        when:
        String value = fakeConnection.getFakeConnection()

        then:
        value == "FAKE CONNECTION"
    }
}
