# jbx

A library to improve Java readability by moving many common actions into static functions. For example:

Collections
```
List<String> rainbow = list("red", "orange", "yellow", "indigo", "violet");

Set<String> names = set("Fred", "Bill", "Venkat");

Map<String, Integer> ages = map("Fred", 45, "Bill", 35);
```
IO
```
println("This prints on %s with a newline.", "System.out");

printf("This printed on %s without a newline.", "System.out");
```
Concurrency
```
go(() -> println("This ran in the common fork join pool."));

sleep(1000);        // Returns whether interrupted
```
Futures
```
CompletableFuture<String> f = future();

CompletableFuture<String> f = joinFutures(f1, f2, f3);
```
