# Projects - Unit 2

This project contains three Python scripts with various examples and tasks to practice programming concepts such as functions, scope, parameters, and code reuse.

## File Descriptions

### 1. `Discussion Assignment Unit 2.py`
This script demonstrates key programming concepts through examples:

- **Example 1:** Difference between parameters and arguments.  
- **Example 2:** Types of inputs for functions: values, variables, and expressions.  
- **Example 3:** Demonstrating variable scope and encountering `NameError` when accessing local variables outside their function.  
- **Example 4:** Using parameters and related scope errors.  
- **Example 5:** Difference between global and local variables with the same name.

### 2. `Programming Assignment Unit 2.py`
This script contains two practical tasks:

- **Part 1:** A function to calculate the circumference of a circle based on its radius.  
- **Part 2:** A function to create a product catalog for an online store, including discounted combo prices.

### 3. `ScriptMode.py`
This script generates a grid of rows and columns using functions, demonstrating:

- Nested functions for code reuse.  
- Creation of repetitive patterns like grids.  
- Helper functions such as `do_twice` and `do_four` to repeat other functions multiple times.

## How to Run

### Prerequisites
- Python 3.x installed.

### Steps
1. **Clone or Copy the Code**

2. **Run any script:**
   ```bash
   python Discussion_Assignment_Unit_2.py
   python Programming_Assignment_Unit_2.py
   python ScriptMode.py
   ```

## Examples of Output

### Example Output - `print_circum`
Input:
```python
print_circum(10)
```
Output:
```
Circumference = 62.8318
```

### Example Output - `print_catalog`
Input:
```python
price_item1=200.0
price_item2=400.0
price_item3=600.0
print_catalog(price_item1,price_item2,price_item3)
```
Output:
```
Online Store
----------------------
Product(S)                  Price
Item 1                      $200.0
Item 2                      $400.0
Item 3                      $600.0
Combo 1(Item 1 + 2)         $540.0
Combo 2(Item 2 + 3)         $900.0
Combo 3(Item 1 + 3)         $720.0
Combo 4(Item 1 + 2 + 3)     $900.0
______________________
For delivery Contact:98764678899
```

### Example Output - `print_grid`
Output:
```
+ - - - - + - - - - +
|         |         |
|         |         |
|         |         |
|         |         |
+ - - - - + - - - - +
|         |         |
|         |         |
|         |         |
|         |         |
+ - - - - + - - - - +
```

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**