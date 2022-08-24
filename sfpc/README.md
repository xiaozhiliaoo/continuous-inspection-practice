# CI SFPC

Sample app to demonstrate use of Surefire, FindBugs, PMD and Checkstyle.

To run static analysis tools:

```
mvn clean compile test findbugs:findbugs pmd:pmd checkstyle:checkstyle
```
