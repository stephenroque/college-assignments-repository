# Projects - Unit 7

This project contains two Python scripts:. These scripts showcase practical use cases of working with dictionaries, lists, and the `zip()` function in Python.

---

## 1. `Discussion Assignment Unit 7.py`

### Objective:
This script demonstrates:
- Using the `zip()` function to combine two lists into a list of tuples.
- Iterating through a list with `enumerate()` to access both index and value.
- Iterating through a dictionary and printing its key-value pairs.

### Key Operations:
- **Zipping Lists:** The `zip()` function combines two lists (`label` and `user`) into pairs of tuples.
- **Enumerating Lists:** The `enumerate()` function is used to iterate over a list with both index and value.
- **Iterating through a Dictionary:** The `items()` method is used to iterate over key-value pairs in a dictionary.

### Example Output:
```plaintext
[('Name', 'Stephen'), ('Unit', 'DLF'), ('Department', 'NTS')]
Element 0 is Stephen
Element 1 is DLF
Element 2 is NTS
The key is Name and the value is Stephen
The key is Unit and the value is DLF
The key is Department and the value is NTS
```

---

## 2. `Programming Assignment Unit 7.py`

### Objective:
This script demonstrates how to invert a dictionary where:
- The original dictionary has students as keys and a list of courses as values.
- The inverted dictionary maps each course to the students who are taking it.

### Key Operations:
- **Inverting the Dictionary:** The `invert_dict()` function flips the original dictionary so that each course is mapped to a list of students.
- **Nested Iteration:** The function iterates through the original dictionary, and for each course in the student’s list of courses, it adds the student to the inverted dictionary.

### Example Output:
```plaintext
Sample input:
{'Stud1': ['CS1101', 'CS2402', 'CS2001'], 'Stud2': ['CS2402', 'CS2001', 'CS1102']}
Inverted Output:
{'CS1101': ['Stud1'], 'CS2402': ['Stud1', 'Stud2'], 'CS2001': ['Stud1', 'Stud2'], 'CS1102': ['Stud2']}
```

---

## How to Run

### Prerequisites
- Python 3.x installed.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/stephenroque/college-assignments-repository.git
   ```
2. Navigate to the project folder:
   ```bash
   cd college-assignments-repository/CS\ 1101\ -\ Programming\ Fundamentals/Unit\ 7/
   ```
3. Run any script:
   ```bash
   python Programming\ Assignment\ Unit\ 7.py
   python Discussion\ Assignment\ Unit\ 7.py
   ```

--- 

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**

