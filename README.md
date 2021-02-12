# WordTurtle

This library is a replication of the 'did you mean...?' feature on google search.

## Example Usage
```java
import com.wordturtle.dictionary.Dictionary;

// create dictionary
String[] words = new String[] {"cherry", "pineapple", "melon", "strawberry", "raspberry"};
com.wordturtle.dictionary.Dictionary dictionary = new com.wordturtle.dictionary.Dictionary(words);


String mispelledWord = "berry";
String correction = dictionary.findMostSimilar(mispelledWord);
// correction == "cherry"
```
