# Projects Unit 5

This Python program demonstrates three string operations on a user-defined name:

1. Displaying a specified number of characters from the left of the name.  
2. Counting the total number of vowels in the name.  
3. Reversing the name.  

---

## Code Breakdown

### 1. Display n Characters from the Left
**Function:** `display_n_chars(name, num)`  
This function extracts the first `n` characters of the string `name` using Python slicing (`name[:num]`).  
The extracted substring is then displayed.  

**Example:**  
Input: `name = "Stephen", num = 4`  
Output: `Step`

---

### 2. Count the Number of Vowels
**Function:** `count_vowels(name)`  
This function calculates the number of vowels (`a, e, i, o, u`, both uppercase and lowercase) in the string `name`.  
It iterates through each character in `name` and checks if it's a vowel, incrementing the count for every match.  

**Example:**  
Input: `name = "Stephen"`  
Output: `2`

---

### 3. Reverse the Name
**Function:** `reverse(name)`  
This function reverses the string `name` using a loop, where each character is added to the front of a new string.  
The reversed string is then displayed.  

**Example:**  
Input: `name = "Stephen"`  
Output: `nehpeteS`

---

## Input and Output Example

### Input:
- **Name:** Stephen (predefined in the script).
- **Number of characters to display:** 4  

### Output:
```plaintext
Stephen
Enter the number of characters to display: 4
1. Display 4 characters from the left: Step
2. Count the number of vowels: 2
3. Reversed name: nehpeteS
```

---

## How to Run
1. **Clone or Copy the Code**
2. **Open the script in a Python environment.**
3. **Set the `name` variable in the script to your desired string.**
4. **Run the script:**
   ```bash
   python Programming\ Assignment\ Unit\ 5.py
   ```
5. **Enter the number of characters you want to display from the left of the name when prompted.**

---

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**