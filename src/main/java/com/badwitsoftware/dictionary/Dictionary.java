package com.badwitsoftware.dictionary;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Juan Ortiz
 */
public class Dictionary {
	private final List<String> correctWords;

	public Dictionary(Collection<String> words) {
		correctWords = new ArrayList<>(words.size());
		words.forEach(word -> correctWords.add(word.toLowerCase()));
	}

	private int compare(String correctWord, String actualWord) {
		int score = 0;
		int readIndex = 0;

		for (int i = 0; i < correctWord.length(); i++) {
			for (int j = readIndex; j < actualWord.length(); j++) {
				if (correctWord.charAt(i) == actualWord.charAt(j)) {
					readIndex = j;
					break;
				} else {
					score++;
				}
			}
		}

		// account for word lengths.
		score += Math.abs(correctWord.length() - actualWord.length());
		return score;
	}

	private ArrayList<Integer> generateScores(String searchTerm) {
		ArrayList<Integer> scores = new ArrayList<>(correctWords.size());

		correctWords.forEach(w -> {
			scores.add(compare(w, searchTerm));
		});
		return scores;
	}

	/** @return index of the smallest integer. */
	private int findIndexOfSmallest(List<Integer> scores) {
		int min = 0;
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) < scores.get(min)) {
				min = i;
			}
		}
		return min;
	}

	public String findMostSimilar(String word) {
		ArrayList<Integer> scores = generateScores(word);
		int indexOfLeast = findIndexOfSmallest(scores);
		return correctWords.get(indexOfLeast);
	}
}
