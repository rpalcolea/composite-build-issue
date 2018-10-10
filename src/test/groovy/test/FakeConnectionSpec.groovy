package test

import spock.lang.Specification

class FakeConnectionSpec extends Specification {

    def 'test'() {
        setup:
        FakeConnection fakeConnection = new FakeConnection()

        when:
        String value = fakeConnection.getFakeConnection()

        then:
        value == "Cluster Name - null : Keyspace Name - null : CF Name - null ::: ReadCL - null : WriteCL - null "
    }
}
