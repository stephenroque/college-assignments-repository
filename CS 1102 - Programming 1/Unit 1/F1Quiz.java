import java.util.Scanner;

public class F1Quiz {

    public static void main(String[] args) {
        // Initialize variables
        int score = 0;
        int totalQuestions = 5;

        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display welcome message
        System.out.println("Welcome to the Formula 1 Quiz!");

        // Define questions and answers
        String[] questions = {
                "Q1. Which team has won the most Formula 1 constructors' championships?",
                "Q2. Which driver has won the most Grand Prix races?",
                "Q3. What is the name of the first ever Formula 1 race track?",
                "Q4. Which team won the Constructors' Championship in 2023?",
                "Q5. What does DRS stand for in Formula 1?"
        };

        String[][] options = {
                {"A. Mercedes", "B. McLaren", "C. Ferrari", "D. Red Bull"},
                {"A. Ayrton Senna", "B. Michael Schumacher", "C. Sebastian Vettel", "D. Lewis Hamilton"},
                {"A. Silverstone Circuit", "B. Monza Circuit", "C. Indianapolis Motor Speedway", "D. Brooklands"},
                {"A. Mercedes", "B. Red Bull", "C. Ferrari", "D. McLaren"},
                {"A. Drag Reduction System", "B. Double Racing Speed", "C. Driver Ranking System", "D. DRS Zone"}
        };

        char[][] answers = {{'C'}, {'D'}, {'A'}, {'B'}, {'A'}};

        // Loop through each question
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }

            // Get user input and validate
            char userInput = ' '; // Initialize outside the loop
            boolean isValidInput = false;
            do {
                System.out.print("Answer: ");
                String input = scanner.next();
                if (input.length() == 1) {
                    userInput = Character.toUpperCase(input.charAt(0));
                    switch (userInput) {
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                            isValidInput = true;
                            break;
                        default:
                            System.out.println("Invalid option. Please choose A, B, C, or D.");
                    }
                } else {
                    System.out.println("Invalid option. Please choose A, B, C, or D.");
                }
            } while (!isValidInput);

            // Check user input and update score
            if (userInput == answers[i][0]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. The correct answer is " + answers[i][0]);
            }
            System.out.println();
        }

        // Calculate and display final score
        double percentageScore = (double) score / totalQuestions * 100;
        System.out.println("Your final score is " + score + " out of " + totalQuestions + " (" + percentageScore + "%)");

        // Close scanner object
        scanner.close();

        System.out.println("Thank you for playing the Formula 1 Quiz!");
    }
}
