# Text Analysis Tool

This project is a **Text Analysis Tool** implemented in Java. It performs a variety of operations on user-provided text, such as counting characters and words, determining frequencies of specific characters and words, and identifying unique words. It also highlights the most common character in the input text.

## Features

### 1. **Character Count**
   - Calculates the total number of characters in the provided text, including spaces and punctuation.

### 2. **Word Count**
   - Counts the total number of words in the input text, where words are separated by whitespace.

### 3. **Most Common Character**
   - Determines the character that appears most frequently in the text (ignoring case and excluding non-alphanumeric characters).

### 4. **Character Frequency**
   - Allows the user to input a character and calculates its frequency in the text.

### 5. **Word Frequency**
   - Allows the user to input a word and calculates how many times it appears in the text.

### 6. **Unique Words**
   - Identifies the total number of unique words in the text, case-insensitively.

## How It Works

1. The user is prompted to enter a paragraph or lengthy text.
2. The program analyzes the text and performs the following:
   - Counts the total characters and words.
   - Identifies the most frequently occurring character.
   - Allows the user to query the frequency of a specific character.
   - Allows the user to query the frequency of a specific word.
   - Counts the number of unique words in the text.

## Code Overview

### **Main Class: `TextAnalysisTool`**
- The entry point of the application.  
- Handles user input and performs text analysis by calling helper methods.

### **Key Methods**
1. **`findMostCommonCharacter(String text)`**  
   Identifies and returns the most common alphanumeric character in the given text.

2. **`calculateCharacterFrequency(String text, char target)`**  
   Calculates the number of times a specific character appears in the text.

3. **`calculateWordFrequency(String text, String targetWord)`**  
   Determines how many times a specific word appears in the text.

4. **`calculateUniqueWords(String[] words)`**  
   Uses a `HashSet` to find the number of unique words in the input text.

## Sample Output

Here’s what a sample execution might look like:

```plaintext
Enter a paragraph or lengthy text:
Hello world! This is a simple text analysis tool. Analyze this text thoroughly.

Total number of characters: 78
Total number of words: 12
Most common character: t

Enter a character to find its frequency:
t
Frequency of 't': 8

Enter a word to find its frequency:
text
Frequency of "text": 2

Number of unique words: 10
```

## How to Run

1. **Clone or Copy the Code**

2. **Compile the program using:**
   ```bash
   javac TextAnalysisTool.java
   ```
3. **Run the program:**
   ```bash
   java TextAnalysisTool
   ```

## Dependencies
- **Java Runtime Environment (JRE)** version 8 or later.
- Uses standard libraries from `java.util` for collections and scanner functionality.

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**