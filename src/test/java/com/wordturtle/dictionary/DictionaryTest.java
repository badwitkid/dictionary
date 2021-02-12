package com.wordturtle.dictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DictionaryTest {

	@Test
	void testBerries() {
		Dictionary dictionary = new Dictionary(
				Arrays.asList("cherry", "pineapple", "melon", "strawberry", "raspberry"));
		assertEquals("strawberry", dictionary.findMostSimilar("strawbery"));
		assertEquals("cherry", dictionary.findMostSimilar("berry"));
	}

	@Test
	void testLanguages() {
		Dictionary dictionary = new Dictionary(
				Arrays.asList("javascript", "java", "ruby", "php", "python", "coffeescript"));
		assertEquals("java", dictionary.findMostSimilar("heaven"));
		assertEquals("javascript", dictionary.findMostSimilar("javascript"));
	}

	@Test
	void testCities() {
		Dictionary dictionary = new Dictionary(Arrays.asList("dubai", "dublin", "new york", "new jersey"));
		assertEquals("dubai", dictionary.findMostSimilar("dublai"));
		assertEquals("new york", dictionary.findMostSimilar("new yarks"));
	}
}
