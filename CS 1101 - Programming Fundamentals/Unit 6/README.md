# Projects - Unit 6

This project contains three Python scripts. Each script demonstrates common Python operations such as list manipulation, string processing, and object referencing.

---
## File Descriptions

### 1. `employee_list.py`

- Objective:
The script simulates employee management by:
    - Splitting an employee list into two sub-lists.
    - Modifying the sub-lists by adding/removing elements.
    - Merging the sub-lists back together.
    - Giving a 4% salary raise to each employee and displaying the updated salary list.
    - Sorting the salary list and displaying the top 3 highest salaries.

- Key Operations:
    - **Splitting Lists:** The employee list is split into two sub-lists (`subList1` and `subList2`).
    - **Modifying Lists:** A new employee is added to `subList2`, and an employee is removed from `subList1`.
    - **Merging Lists:** The two sub-lists are merged to form a single, updated employee list.
    - **Salary Update:** A 4% raise is applied to each employee's salary, and the salary list is updated accordingly.
    - **Sorting:** The salary list is sorted, and the top 3 salaries are displayed.


- Example Output:
```plaintext
Merged Employee List: ['John Doe', 'Jane Smith', 'Robert Johnson', 'Michael Williams', 'Sarah Brown', 'James Davis', 'Patricia Miller', 'Linda Wilson', 'Charles Moore', 'Jessica Taylor', 'Kriti Brown']
Updated Salary List: [52000.0, 62400.0, 72800.0, 83200.0, 93600.0, 104000.0, 114400.0, 124800.0, 135200.0, 146400.0]
Top 3 Salaries: [124800.0, 135200.0, 146400.0]
```

---

### 2. `sentence.py`

- Objective:
This script works with a sentence to:
    - Split it into individual words.
    - Reverse the word order.

- Key Operations:
    - **Splitting Sentence:** The sentence is split into a list of words using Python's `split()` method.
    - **Reversing Word List:** The word list is reversed using Python slicing (`[::-1]`).

- Example Output:
```plaintext
Word List: ['All', 'men', 'are', 'created', 'equal,', 'then', 'a', 'few', 'become', 'firemen.']
Reversed Word List: ['firemen.', 'become', 'few', 'a', 'then', 'equal,', 'created', 'are', 'men', 'All']
```

---

### 3. `Test.py`

- Objective:
This script demonstrates the concept of object referencing in Python.

- Key Operations:
    - **List Reference:** It shows how assigning a list to another variable creates a reference, meaning changes to one list will affect the other.
    - **Appending to a List:** An element is added to the list, affecting both `price` and `cost` since they refer to the same list.

- Example Output:
```plaintext
[520, 240, 87, 432]
[520, 240, 87, 432]
```

**Explanation:** Both `price` and `cost` reference the same list. When we append `432` to `cost`, it is also reflected in `price` since they are referencing the same list in memory.

---

## How to Run

### Prerequisites
- Python 3.x installed.

### Steps
1. **Clone or Copy the Code**
2. **Run any script:**
   ```bash
   python employee_list.py
   python sentence.py
   python Test.py
   ```

--- 

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**

