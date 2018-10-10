# Intellij Composite Build Issue

1) `mkdir composite-test`
2) `cd composite-test`
3) `git clone git@github.com:rpalcolea/composite-build-issue.git`
4) `git clone git@github.com:Netflix/ndbench.git`
5) `cd composite-build-issue`
6) `./gradlew test` <- TEST should fail
7) Modify `getConnectionInfo()` method in `ElassandraCassJavaDriverPlugin` with
```
@Override
    public String getConnectionInfo() throws Exception {
        return "FAKE CONNECTION";
    }
```

8) `./gradlew --include-build ../ndbench test` <- Test pass
9) On IntelliJ, import `composite-build-issue` and create a composite build 

![alt text](https://i.imgur.com/9k5QuDw.png)

![alt text](https://i.imgur.com/QbyVSS8.png)

10) Execute `FakeConnectionSpec` and test should pass but i does not



