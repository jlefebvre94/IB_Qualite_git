package fr.ibformation.quality;

import java.util.Random;

public class ibmaximot {
	public static Random random = new Random();
	public static final int MULTIPLE_LOOP = 4;
	
	public static void main(String[] args) {
		//build dictionary
		String[] dictionary = {"FRAISE","BANANE","ORANGE"};
	
		// Choose word randomly
		int randomIndex = random.nextInt(dictionary.length);
		String chosenWord = dictionary[randomIndex];
		
		// Mix lettrers in the word
		String chosenWordMixed = mixStringRandomly(chosenWord);
		
		//Display result
		System.out.println(chosenWordMixed);
	}
	
	public static String mixStringRandomly(String wordToMix) {
		// Random random = new Random();
		char[] mixedWord = wordToMix.toCharArray();
		int lengthMixedWord = mixedWord.length;

		for (int i = 0; i < lengthMixedWord * MULTIPLE_LOOP; i++) {
			int Char1 = random.nextInt(lengthMixedWord);
			int Char2 = random.nextInt(lengthMixedWord);
			char temp = mixedWord[Char1];
			mixedWord[Char1] = mixedWord[Char2];
			mixedWord[Char2] = temp;
		}
		return new String(mixedWord
				);
	}
}