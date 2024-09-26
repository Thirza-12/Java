# Strings in Java

Strings are immutable in Java. They cannot be modified once created. When you try to change a string, Java will find that particular string in the string constant pool. If it is not found, Java will create a new object, and the string reference will point to that new object. The previous object will be deleted by the garbage collector.

`StringBuffer` and `StringBuilder` are mutable, meaning they can be modified or changed.

## 1. String Methods

Java's `String` class comes with a variety of methods for manipulating and analyzing strings. Since strings are immutable, methods that appear to modify a string return a new string rather than altering the original.

### 1.1. `length()`
- Returns the number of characters in the string.
    - `String str = "Hello";`
    - `int len = str.length();`  // Output: 5

### 1.2. `charAt()`
- Returns the character at the specified index.
    - `String str = "Hello";`
    - `char ch = str.charAt(1);`  // Output: 'e'

### 1.3. `substring()`
- Extracts a substring from the string starting from a specific index or between two indices.
    - `String str = "Hello World";`
    - `String sub = str.substring(6);`  // Output: "World"
    - `String sub2 = str.substring(0, 5);`  // Output: "Hello"

### 1.4. `contains()`
- Checks if the string contains a specified sequence of characters.
    - `String str = "Hello World";`
    - `boolean result = str.contains("World");`  // Output: true

### 1.5. `indexOf()`
- Returns the index of the first occurrence of a character or substring.
    - `String str = "Hello World";`
    - `int index = str.indexOf('o');`  // Output: 4
    - `int index2 = str.indexOf("World");`  // Output: 6

### 1.6. `lastIndexOf()`
- Returns the index of the last occurrence of a character or substring.
    - `String str = "Hello World";`
    - `int lastIndex = str.lastIndexOf('o');`  // Output: 7

### 1.7. `startsWith()` and `endsWith()`
- Checks whether the string starts or ends with a specified prefix or suffix.
    - `String str = "Hello World";`
    - `boolean starts = str.startsWith("Hello");`  // Output: true
    - `boolean ends = str.endsWith("World");`  // Output: true

### 1.8. `toUpperCase()` and `toLowerCase()`
- Converts all characters of the string to uppercase or lowercase.
    - `String str = "Hello World";`
    - `String upper = str.toUpperCase();`  // Output: "HELLO WORLD"
    - `String lower = str.toLowerCase();`  // Output: "hello world"

### 1.9. `trim()`
- Removes leading and trailing whitespace from the string.
    - `String str = "  Hello World  ";`
    - `String trimmed = str.trim();`  // Output: "Hello World"

### 1.10. `replace()`
- Replaces all occurrences of a specified character or substring with another character or substring.
    - `String str = "Hello World";`
    - `String newStr = str.replace('o', 'x');`  // Output: "Hellx Wxrld"
    - `String newStr2 = str.replace("World", "Java");`  // Output: "Hello Java"

### 1.11. `replaceAll()` and `replaceFirst()`
- Replaces all or the first occurrence of a regex pattern in the string with a replacement string.
    - `String str = "one two one";`
    - `String replacedAll = str.replaceAll("one", "1");`  // Output: "1 two 1"
    - `String replacedFirst = str.replaceFirst("one", "1");`  // Output: "1 two one"

### 1.12. `split()`
- Splits the string into an array of substrings based on a regex or a delimiter.
    - `String str = "apple,banana,orange";`
    - `String[] fruits = str.split(",");`
    - `// fruits = {"apple", "banana", "orange"}`

### 1.13. `equals()` and `equalsIgnoreCase()`
- Compares two strings for equality, with `equalsIgnoreCase()` ignoring case.
    - `String str1 = "Hello";`
    - `String str2 = "hello";`
    - `boolean isEqual = str1.equals(str2);`  // Output: false
    - `boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);`  // Output: true

### 1.14. `compareTo()` and `compareToIgnoreCase()`
- Compares two strings lexicographically.
    - `0` if both strings are equal
    - A positive value if the current string is lexicographically greater
    - A negative value if the current string is lexicographically smaller
    - `String str1 = "Hello";`
    - `String str2 = "World";`
    - `int result = str1.compareTo(str2);`  // Output: -15 (because "Hello" is less than "World")

### 1.15. `isEmpty()` and `isBlank()`
- `isEmpty()` checks if the string has a length of 0.
- `isBlank()` checks if the string is empty or contains only whitespace.
    - `String str = "";`
    - `boolean empty = str.isEmpty();`  // Output: true
    - `boolean blank = str.isBlank();`  // Output: true

### 1.16. `join()`
- Joins elements of a string array or collection with a delimiter.
    - `String result = String.join(", ", "apple", "banana", "orange");`
    - `// Output: "apple, banana, orange"`

### 1.17. `toCharArray()`
- Converts the string into a character array.
    - `String str = "Hello";`
    - `char[] chars = str.toCharArray();`
    - `// chars = {'H', 'e', 'l', 'l', 'o'}`

### 1.18. `format()`
- Returns a formatted string using the specified format string and arguments.
    - `String formatted = String.format("Hello, %s!", "World");`
    - `// Output: "Hello, World!"`

### 1.19. `matches()`
- Checks if the string matches a regular expression.
    - `String str = "hello";`
    - `boolean matches = str.matches("[a-z]+");`  // Output: true

### 1.20. `intern()`
- Ensures that a string is added to the string pool, returning a reference to the string from the pool.
    - `String str = new String("Hello");`
    - `String internedStr = str.intern();`

## 2. StringBuilder Methods

`StringBuilder` in Java is a mutable sequence of characters, which provides various methods for modifying strings without creating new string objects (as opposed to `String`, which is immutable).

### 2.1. `append()`
- Appends the string representation of various data types to the `StringBuilder` object.
    - `StringBuilder sb = new StringBuilder("Hello");`
    - `sb.append(" World");`
    - `System.out.println(sb);`  // Output: Hello World

### 2.2. `insert()`
- Inserts the string representation of a given value into the `StringBuilder` at the specified index.
    - `StringBuilder sb = new StringBuilder("Hello");`
    - `sb.insert(5, " World");`
    - `System.out.println(sb);`  // Output: Hello World

### 2.3. `delete()`
- Deletes characters from the `StringBuilder` between the specified `start` and `end` index.
    - `StringBuilder sb = new StringBuilder("Hello World");`
    - `sb.delete(5, 11);`
    - `System.out.println(sb);`  // Output: Hello

### 2.4. `deleteCharAt()`
- Deletes the character at the specified index.
    - `StringBuilder sb = new StringBuilder("Hello");`
    - `sb.deleteCharAt(4);`
    - `System.out.println(sb);`  // Output: Hell

### 2.5. `replace()`
- Replaces characters between the specified `start` and `end` index with the given string.
    - `StringBuilder sb = new StringBuilder("Hello World");`
    - `sb.replace(6, 11, "Java");`
    - `System.out.println(sb);`  // Output: Hello Java

### 2.6. `reverse()`
- Reverses the character sequence of the `StringBuilder`.
    - `StringBuilder sb = new StringBuilder("Hello");`
    - `sb.reverse();`
    - `System.out.println(sb);`  // Output: olleH
### 2.7. `substring()`
- Returns a substring from the `StringBuilder` starting at the specified index or between `start` and `end`.
  - `StringBuilder sb = new StringBuilder("Hello World");`
  - `String sub = sb.substring(6, 11);`
  - `System.out.println(sub);`  // Output: World

### 2.8. `length()`
- Returns the length (number of characters) in the `StringBuilder`.
  - `StringBuilder sb = new StringBuilder("Hello");`
  - `int len = sb.length();`
  - `System.out.println(len);`  // Output: 5

### 2.9. `capacity()`
- Returns the current capacity of the `StringBuilder`. The capacity grows automatically as needed.
  - `StringBuilder sb = new StringBuilder("Hello");`
  - `System.out.println(sb.capacity());`  // Output: Depends on implementation (default is often 16 + length)

### 2.10. `setLength()`
- Sets the length of the `StringBuilder`. If the new length is greater than the current length, null characters (`\0`) are appended.
  - `StringBuilder sb = new StringBuilder("Hello");`
  - `sb.setLength(3);`
  - `System.out.println(sb);`  // Output: Hel

### 2.11. `charAt()`
- Returns the character at the specified index.
  - `StringBuilder sb = new StringBuilder("Hello");`
  - `char ch = sb.charAt(1);`
  - `System.out.println(ch);`  // Output: e

### 2.12. `setCharAt()`
- Sets the character at the specified index.
  - `StringBuilder sb = new StringBuilder("Hello");`
  - `sb.setCharAt(1, 'a');`
  - `System.out.println(sb);`  // Output: Hallo

### 2.13. `toString()`
- Converts the `StringBuilder` to a string.
  - `StringBuilder sb = new StringBuilder("Hello");`
  - `String str = sb.toString();`
  - `System.out.println(str);`  // Output: Hello


