package LabExer6A;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

	public class LabExer6A {
    private static ArrayList<String> wordsList;
    private static String selectedWord;
    private static StringBuilder guessedWord;
    private static int attempts;

    public static void main(String[] args) {
        boolean continuePlaying = true;
        try (Scanner scanner = new Scanner(System.in)) {
			while (continuePlaying) {
			    loadWordsFromFile("C:\\Users\\Ichiro Yamazaki\\Documents\\word.txt");
			    if (wordsList.isEmpty()) {
			        System.out.println("No words found in the words.txt. Please check the File and Try Aga");
			        return;
			    }
			    selectedWord = getRandomWord();
			    guessedWord = new StringBuilder(selectedWord.replaceAll(".", "?"));
			    attempts = 0;

			    System.out.println("Welcome to the Guessing Game!");
			    System.out.println("Try to guess the word: " + guessedWord);
			    System.out.println("Enter a letter or guess the whole word:");

			    while (!selectedWord.equals(guessedWord.toString())) {
			        String input = scanner.nextLine();
			        if (input.length() == 1) {
			            char letter = input.charAt(0);
			            if (selectedWord.contains(String.valueOf(letter))) {
			                for (int i = 0; i < selectedWord.length(); i++) {
			                    if (selectedWord.charAt(i) == letter) {
			                        guessedWord.setCharAt(i, letter);
			                    }
			                }
			                System.out.println("Correct! Guessed word so far: " + guessedWord);
			            } else {
			                attempts++;
			                System.out.println("Incorrect Answer! - Incorrect Attempt(s): " + attempts);
			            }
			        } else if (input.length() > 1) {
			            if (input.equals(selectedWord)) {
			                guessedWord = new StringBuilder(selectedWord);
			                System.out.println("Congratulations! You guessed the word: " + selectedWord);
			                break;
			            } else {
			                attempts++;
			                System.out.println("Incorrect! Attempts: " + attempts);
			            }
			        } else {
			            System.out.println("Invalid input. Please enter a letter or guess the whole word.");
			        }
			    }
			    System.out.println("Do you want to play again? (Y/N)");
			    String playAgain = scanner.nextLine();
			    continuePlaying = playAgain.equalsIgnoreCase("Y");
			}
			scanner.close();
		}
    }
    private static void loadWordsFromFile(String fileName) {
        wordsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordsList.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Error loading words from file: " + e.getMessage());
        }
    }
    private static String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(wordsList.size());
        return wordsList.get(index);
    }
}
