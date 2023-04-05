# Java-training
## Content
- [x] Arrays
- [x] Beans
- [x] Collections
  - [x] Iterator
  - [x] List
  - [x] Map
  - [x] Set
  - [x] Deque
  - [x] Array and list sorting

## Concepts
### List
- ```fixed size list:``` No insertion or deletion allowed.
- ```immutable:``` They do not support deletion, modification, insertion of elements, keys or null values.

### Map
- Map and HasMap is not sorted by key but TreeMap is.

> **NOTE:** TreeXXX is an ordered form.

### Array and list sorting

- Immutable list and arrays can not be sorted by sort method.

- In order to apply binarySearch method array must be sorted.

# Google-Java-Format

```
mvn com.coveo:fmt-maven-plugin:format
mvn com.coveo:fmt-maven-plugin:check
```

# Checkstyle

```
mvn checkstyle:checkstyle
```