/**
 * TextAnalysisTool.java
 * 
 * This program provides various text analysis operations based on user input.
 * It calculates character and word counts, determines character and word frequencies,
 * and identifies unique words.
 * 
 * @author Stephen Roque
 */
import java.util.*;

public class TextAnalysisTool {

    /**
     * Main method to run the text analysis tool.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. User Input
        System.out.println("Enter a paragraph or lengthy text:");
        String inputText = scanner.nextLine();
        String lowerCaseText = inputText.toLowerCase();

        // 2. Character Count
        int totalCharacters = inputText.length();
        System.out.println("Total number of characters: " + totalCharacters);

        // 3. Word Count
        String[] words = inputText.split("\\s+");
        int totalWords = words.length;
        System.out.println("Total number of words: " + totalWords);

        // 4. Most Common Character
        char mostCommonChar = findMostCommonCharacter(lowerCaseText);
        System.out.println("Most common character: " + mostCommonChar);

        // 5. Character Frequency
        System.out.println("Enter a character to find its frequency:");
        char targetChar = scanner.next().charAt(0);
        int charFrequency = calculateCharacterFrequency(lowerCaseText, Character.toLowerCase(targetChar));
        System.out.println("Frequency of '" + targetChar + "': " + charFrequency);

        // 6. Word Frequency
        scanner.nextLine(); // Clear the buffer
        System.out.println("Enter a word to find its frequency:");
        String targetWord = scanner.nextLine().toLowerCase();
        int wordFrequency = calculateWordFrequency(lowerCaseText, targetWord);
        System.out.println("Frequency of \"" + targetWord + "\": " + wordFrequency);

        // 7. Unique Words
        int uniqueWordCount = calculateUniqueWords(words);
        System.out.println("Number of unique words: " + uniqueWordCount);

        scanner.close();
    }

    /**
     * Finds the most common character in a string.
     * 
     * @param text The input text.
     * @return The most common character.
     */
    private static char findMostCommonCharacter(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        char mostCommonChar = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostCommonChar;
    }

    /**
     * Calculates the frequency of a character in a string.
     * 
     * @param text The input text.
     * @param target The target character.
     * @return The frequency of the target character.
     */
    private static int calculateCharacterFrequency(String text, char target) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    /**
     * Calculates the frequency of a word in a string.
     * 
     * @param text The input text.
     * @param targetWord The target word.
     * @return The frequency of the target word.
     */
    private static int calculateWordFrequency(String text, String targetWord) {
        String[] words = text.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Calculates the number of unique words in a string array.
     * 
     * @param words The array of words.
     * @return The count of unique words.
     */
    private static int calculateUniqueWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word.toLowerCase());
        }
        return uniqueWords.size();
    }
}