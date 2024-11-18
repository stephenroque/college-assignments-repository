# Formula 1 Quiz

This Java program is a simple console-based quiz game where users answer five Formula 1 related questions. Each question is multiple-choice, and the user can input answers from the options provided. The program calculates the user's score based on correct answers and provides feedback after each question.

## Features

- **5 Multiple Choice Questions**: The quiz contains questions related to Formula 1 history, teams, drivers, and terminology.
- **Input Validation**: Users can only enter valid answers (A, B, C, D).
- **Score Calculation**: After all questions, the program calculates and displays the final score and percentage.

## Questions

1. Which team has won the most Formula 1 constructors' championships?
2. Which driver has won the most Grand Prix races?
3. What is the name of the first ever Formula 1 race track?
4. Which team won the Constructors' Championship in 2023?
5. What does DRS stand for in Formula 1?

## How It Works

1. **Question Display**: The program displays each question with four options (A, B, C, D).
2. **User Input**: The program waits for the user to enter one of the options (A, B, C, or D). It ensures that the user enters a valid choice before proceeding.
3. **Answer Validation**: After the user inputs an answer, the program checks if the answer is correct and updates the score accordingly.
4. **Final Score**: At the end of the quiz, the program displays the total score out of 5 and the percentage of correct answers.

## Example Output

```plaintext
Welcome to the Formula 1 Quiz!

Q1. Which team has won the most Formula 1 constructors' championships?
A. Mercedes
B. McLaren
C. Ferrari
D. Red Bull
Answer: C
Correct!

Q2. Which driver has won the most Grand Prix races?
A. Ayrton Senna
B. Michael Schumacher
C. Sebastian Vettel
D. Lewis Hamilton
Answer: D
Correct!

...

Your final score is 4 out of 5 (80%)
Thank you for playing the Formula 1 Quiz!
```

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/stephenroque/college-assignments-repository.git
   ```
2. Navigate to the project folder:
   ```bash
   cd college-assignments-repository/CS\ 1102\ -\ Programming\ 1/Unit\ 1/
   ```
3. **Compile the Java Program**:
   ```bash
   javac F1Quiz.java
   ```

4. **Run the Program**: After compiling, run the program with the following command:
   ```bash
   java F1Quiz
   ```

5. **Answer the Questions**: The program will prompt you with a question and available options. Input your answer as a single character (A, B, C, or D), and it will proceed to the next question.

---

## Technologies Used

- **Java**: The program is written in Java and uses the basic Java library for input handling (`Scanner`).
- **Console-Based**: This program is designed to run in a terminal or command-line interface.

--- 

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**