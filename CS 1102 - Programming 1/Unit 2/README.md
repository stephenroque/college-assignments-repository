# Library Management System

This Java-based program is a simple Library Management System that allows users to add, borrow, and return books. It utilizes a `HashMap` to store books by their titles and keeps track of book quantities, borrowed books, and their availability.

## Features

- **Add Books**: Users can add new books to the library or update the quantity of existing books.
- **Borrow Books**: Users can borrow a specified quantity of a book, provided there are enough copies available.
- **Return Books**: Users can return borrowed books, and the system will update the borrowed quantity accordingly.
- **Input Validation**: The program ensures that users input valid data for book quantities and menu options.

## How It Works

1. **Book Class**: Represents individual books, including the title, author, total quantity, and the number of borrowed copies.
2. **LibrarySystem Class**: Manages the library by adding, borrowing, and returning books, and maintains the list of books in a `HashMap` using their titles as keys.
3. **Main Menu**: The program offers a simple text-based menu where users can:
    - Add a book
    - Borrow a book
    - Return a book
    - Exit the system
4. **Exception Handling**: The program handles invalid user inputs, such as non-integer values for quantities and menu options.

## Example Output

```plaintext
Library System Menu:
1. Add Book
2. Borrow Book
3. Return Book
4. Exit
Select an option: 1
Enter book title: The Great Gatsby
Enter author name: F. Scott Fitzgerald
Enter quantity: 5
Book "The Great Gatsby" added to the library.

Library System Menu:
1. Add Book
2. Borrow Book
3. Return Book
4. Exit
Select an option: 2
Enter book title: The Great Gatsby
Enter quantity to borrow: 2
You have borrowed 2 copies of "The Great Gatsby".
```

## Menu Options

1. **Add Book**: Adds a new book to the library or updates the quantity of an existing book.
2. **Borrow Book**: Allows a user to borrow a specified quantity of a book, if available.
3. **Return Book**: Allows a user to return a borrowed quantity of a book.
4. **Exit**: Exits the program.

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
   cd college-assignments-repository/CS\ 1102\ -\ Programming\ 1/Unit\ 2/
   ```

3. **Compile the Java Program**:
   ```bash
   javac LibrarySystem.java
   ```

4. **Run the Program**: After compiling, run the program with the following command:
   ```bash
   java LibrarySystem
   ```

5. **Interact with the System**: Follow the menu options to add, borrow, return, or exit from the library system.

---

## Technologies Used

- **Java**: The program is written in Java, utilizing basic Java features such as `Scanner`, `HashMap`, and `InputMismatchException` for input handling and exception management.

--- 

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**