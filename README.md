# Dictionary

This library is a replication of the 'did you mean...?' feature on google search.

## Example Usage
```java
// create dictionary
String[] words = new String[] {"cherry", "pineapple", "melon", "strawberry", "raspberry"};
Dictionary dictionary = new Dictionary(words);


String mispelledWord = "berry";
String correction = dictionary.findMostSimilar(mispelledWord);
// should return 'cherry'
```
