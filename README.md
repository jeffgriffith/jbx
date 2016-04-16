# jbx

A library to simplify Java readability by moving many common actions into static functions. As an example, rather than repeated references to ArrayList construction like:
```
List<String> l = new ArrayList<>();
List<String> l = Arrays.asList("a", "b", "c");
```
we can simply do:
```
List<String> l = list();
List<String> l = list("a", "b", "c")
```
