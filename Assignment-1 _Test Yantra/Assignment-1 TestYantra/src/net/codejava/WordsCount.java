package net.codejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map < String, Integer > map = new HashMap < > ();

		Scanner sc = new Scanner(System.in); // used to read user input

		System.out.println("Enter a string:");

		String sentence = sc.nextLine();

		String[] tokens = sentence.split(" "); // split based on space

		for (String token: tokens) {

		String word = token.toLowerCase();

		if (map.containsKey(word)) {

		int count = map.get(word); // get word count

		map.put(word, count + 1); // override word count

		} else {

		map.put(word, 1); // initial word count to 1

		}

		}

		
		System.out.println(map);
		
		
		}

		}

		
	


