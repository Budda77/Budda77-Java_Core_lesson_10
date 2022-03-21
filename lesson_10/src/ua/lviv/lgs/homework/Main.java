/*
 * LOGOS It Academy test file
 * 
 * */

package ua.lviv.lgs.homework;

import java.util.Arrays;

/**
 * @since java 1.8
 * @author Oleksandr
 * @version 1.1
 * */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws WrongInputWord {
		
		/**
		 * @param input parameters is String
		 * @exception MyException
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toLowerCase();
		
		/** Method that check if string is palindrome */
		isPalindrome(str);
		sc.close();
		
		System.out.println("");
		
		
		/** Method to substitute vowels for dashes */
		
		//Example of sentence
		String sentence = "Хвіст трубою, спритні ніжки, плиг із гілки на сучок! Носить білочка горішки в золотий свій сундучок.";
		
		System.out.println("Use 3 methods for substituting vowels for dashes in the following sentence:");

		System.out.println(sentence);
		
	
		// First option
		
		System.out.println("");
		substitutingVowels(sentence);
		
		// Second option
		
		System.out.println("");
		substitutingVowelsII(sentence);
		
		
		// Third option
		
		System.out.println("");
		
		System.out.println("To substitute vowels - using String method replace:");
			
		sentence = substitutingVowelsIII(sentence);
		System.out.println(sentence);
		


		/** Methods to count words in a sentence */
		
		/* The first way to count words in a sentence*/
		
		System.out.println("");
		
		countWords(sentence);
		
			
		/* The second way to count words in a sentence*/
		
		System.out.println("");
		
		countWordsII(sentence);
		
		
		/*Find the word that occurs most often in the sentence.*/
		
		System.out.println("");
		
		String s = "Anna Dyma Anna Alex Yann Vanya Dyma Anna Vadym Anna Yann";
		
		countFrequentlyEncounteredWord(s);
	}

	
	
	
	private static void substitutingVowels(String str) {
		
		char chars[] = {'а', 'о', 'у', 'и', 'і', 'е'};
		
		char newSentence[] = str.toCharArray();
		
		for(int i = 0; i < newSentence.length; i++) {
			
			for(int y = 0; y < chars.length; y++) {
				
				if(newSentence[i] == chars[y]) {
					
					newSentence[i] = '-';
				
				}				
			}	
		}
		
		System.out.println("To substitute vowels - using array of char:");
		System.out.println(String.copyValueOf(newSentence)); 		
	}
	
	
	private static void substitutingVowelsII(String str) {
		
		StringBuilder newStr = new StringBuilder(str);	
		
		char chars[] = {'а', 'о', 'у', 'и', 'і', 'е'};
		
		char newSentence[] = str.toCharArray();
		
		for(int i = 0; i < newSentence.length; i++) {
			
			for(int y = 0; y < chars.length; y++) {
				
				if(newSentence[i] == chars[y]) {
					
					newStr.replace(i, i+1, "-");
				
				}				
			}	
		}
		
		System.out.println("To substitute vowels - using StringBuilder method replace");
		System.out.println(newStr);
	}
	
	
	
	private static String substitutingVowelsIII(String str) {
		
		char chars[] = {'а', 'о', 'у', 'и', 'і', 'е'};
		
		for(int y = 0; y < chars.length; y++) {
			
			char tmp = chars[y];

			str = str.replace(tmp, '-');
		}
		
		
		return str;
	}
	
	
	
	private static void countWords(String str) {
		
		System.out.println("Option I to count the words:  ");	
		
		String [] arrayOfWords = str.split(" ");
		
		int numberOfWords = arrayOfWords.length;
		
		System.out.println("The number of words in a sentence is: " + numberOfWords);	
	}
	
	private static void countWordsII(String str) {
		
		System.out.println("Option II to count the words:  ");	
		
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		
		System.out.println("The number of words in a sentence is: " + count);
		
	}
	
	
	private static void countFrequentlyEncounteredWord(String str) {
		
		String [] arr = str.split(" ");
		Arrays.sort(arr);
		int cnt = 1;
		int max = 0;
		String maxValue = "";
		String tmp = " ";
		for(int i = 0; i < arr.length; i++) {
						
			if(arr[i].equals(tmp)) {
				cnt++;
				
			}else {
				cnt = 1;
			}
			
			if(max < cnt) {
				max = cnt;
				maxValue = arr[i];
			}
			tmp = arr[i];
			
		}
		System.out.println("Frequently encountered word is - " + maxValue + " - used " + max + " times.");
		
	}
	
	
	
	
	
	private static void isPalindrome(String str) throws WrongInputWord {
		
		StringBuilder reverse = new StringBuilder();
		
		boolean flag = true;
		
		char chars[] = str.toCharArray();
		
		for(int i = chars.length-1; i >= 0 ; i--) {
			
			if(chars.length == 5) {
				
				reverse.append(chars[i]);
					
			}else {				
				flag = false;
			}			
		}
		
		if(!flag) {
			throw new WrongInputWord("The incorrect word was entered"); 
		}
		
		if(reverse.toString().equals(str)) {
				
			System.out.println("The word - " + str + " - is palindrome.");
			
		} else {
			System.out.println("Try againg");
		}
		
		
	}
	
	
	

}
