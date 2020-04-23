# understanding-java-11-concurrency
Understanding Java 11 Concurrency

So, I decided to make a unit test case for every class under `java.util.concurrent`:

Start from here:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/module-summary.html

There are 3 links related to `java.util.concurrent`:
- [java.util.concurrent](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/package-summary.html)
- [java.util.concurrent.atomic](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/atomic/package-summary.html)
- [java.util.concurrent.locks](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/locks/package-summary.html)

Lets start with `java.util.concurrent`:
- 25 interfaces - `$("table.typeSummary:eq(0) tbody:eq(1) tr").length`
- 40 classes - `$("table.typeSummary:eq(1) tbody:eq(1) tr").length`
- 1 Enum - `$("table.typeSummary:eq(2) tbody:eq(1) tr").length`
- 6 Exceptions - `$("table.typeSummary:eq(3) tbody:eq(1) tr").length`

[View](java-util-concurrent.md) java.util.concurrent