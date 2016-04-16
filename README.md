# jbx - Java Beautification Extensions
## Overview
A library to improve Java readability by moving many common actions into static functions. They are named so that readability is preserved even when included statically.

## Examples
_java.util -> jbx.JbxUtil_
```
List<String> rainbow = list("red", "orange", "yellow", "indigo", "violet");

Set<String> names = set("Fred", "Bill", "Venkat");

Map<String, Integer> ages = map("Fred", 45, "Bill", 35);
```
_java.io -> jbx.JbxIO_
```
println("This prints on %s with a newline.", "System.out");

printf("This printed on %s without a newline.", "System.out");
```
_java.util.concurrent -> jbx.JbxConcurrent_
```
go(() -> println("This ran in the common fork join pool."));

CompletableFuture<String> f = future();

CompletableFuture<String> f = joinFutures(f1, f2, f3);
```
_java.lang -> jbx.JbxLang_
```
sleep(1000);        // Returns whether interrupted
```
