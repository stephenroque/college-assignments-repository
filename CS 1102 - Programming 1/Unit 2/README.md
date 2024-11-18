**Explanation:**

I\'ve developed a Java program to manage a simple library system where
users can add books, borrow books, return books, and exit the system.
Here\'s a breakdown of how the program functions:

**1. Initialization:** The program starts by initializing a HashMap
named 'library' to store book information. Each book is represented by a
'Book' object containing attributes such as title, author, quantity, and
borrowed.

**2. Adding Books:** The 'addBook' method allows users to add new books
to the library or update the quantity of existing ones. If a book
already exists, its quantity is updated; otherwise, a new book is added
to the library.

**3. Borrowing Books:** The 'borrowBook' method enables users to borrow
a specified quantity of a book from the library. It checks if the
requested quantity is available and updates the borrowed count
accordingly.

**4. Returning Books:** The 'returnBook' method allows users to return a
specified quantity of a borrowed book to the library. It verifies if the
book belongs to the library system and if the quantity being returned
does not exceed the borrowed count.

**5. Main Menu:** The 'main' method presents a menu to users with
options to add books, borrow books, return books, or exit the program.
It uses a loop to continuously prompt the user for input until the exit
option is chosen.

**6. Input Validation:** The program includes input validation to ensure
that only integer values are accepted for quantity inputs and that only
valid menu options are selected.

**7. User Interaction:** Throughout the program, messages are displayed
to guide users through each step and provide feedback on their actions.

**8. Resource Management:** The program closes the Scanner object used
for input to release system resources properly.

By following this flow, users can interact with the library system to
manage books effectively.