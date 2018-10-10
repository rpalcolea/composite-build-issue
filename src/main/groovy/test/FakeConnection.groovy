package test

import com.netflix.ndbench.plugin.elassandra.ElassandraCassJavaDriverPlugin

class FakeConnection {

    String getFakeConnection() {
        ElassandraCassJavaDriverPlugin elassandraCassJavaDriverPlugin = new ElassandraCassJavaDriverPlugin()
        return elassandraCassJavaDriverPlugin.connectionInfo
    }
}
