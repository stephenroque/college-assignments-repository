# Projects Unit 8

This repository contains two Python scripts. These scripts focus on file handling and error handling in Python, along with working with dictionaries and file-based operations.

---

## 1. `Discussion Assignment Unit 8.py`

### Objective:
This script demonstrates:
- Handling file operations with error checking.
- Using `try` and `except` blocks to catch specific and general exceptions.

### Key Operations:
- **Reading a File:** The script attempts to open a file (`test.txt`) and read its contents.
- **Error Handling:** The script handles the `FileNotFoundError` exception in case the file doesn't exist, as well as any other potential errors with a general exception handler.

### Example Output:
```plaintext
Sorry, the file you are looking for does not exist.
```
If `test.txt` exists, it would print its contents. Otherwise, it prints an error message.

---

## 2. `Programming Assignment Unit 8.py`

### Objective:
This script demonstrates working with dictionary data, file input/output, and dictionary inversion:
- **Reading and Writing Files:** It reads from a file (`dict.txt`) that contains a dictionary of countries and their associated colors, and writes an inverted dictionary to a new file.
- **Inverting the Dictionary:** It flips the dictionary, so that each color is associated with the countries that have that color.

### Key Operations:
- **`read_dict_file(filename)`:** Reads a file containing a dictionary of countries and their colors and loads it into a Python dictionary.
- **`write_dict_file(filename, dict)`:** Writes a dictionary to a file in the same format.
- **`invert_dict(dict)`:** Inverts the dictionary, so that each color is mapped to the countries that have that color.
- **`invert_dict_file(filename)`:** Reads, inverts, and writes the result to a new file (`inverted_dict.txt`).

### Example Output:
If the input file (`dict.txt`) contains the following data:

```plaintext
{
argentina: blue, white, yellow
bolivia: red, yellow, green
brazil: green, yellow, blue, white
chile: red, white, blue
colombia: yellow, blue, red
ecuador: yellow, blue, red
falkland_islands: blue, white, red
french_guiana: yellow, green, red
guyana: green, yellow, black, white
paraguay: red, white, blue
peru: red, white, red
suriname: green, white, red, yellow
trinidad_and_tobago: red, white, black
uruguay: blue, white, yellow
venezuela: yellow, blue, red
}
```

The output file (`inverted_dict.txt`) would contain:

```plaintext
{
blue: argentina, brazil, chile, ecuador, falkland_islands, guyana, uruguay
white: argentina, brazil, chile, falkland_islands, guyana, paraguay, peru, suriname, trinidad_and_tobago, uruguay
yellow: argentina, bolivia, brazil, colombia, ecuador, falkland_islands, french_guiana, guyana, paraguay, suriname, uruguay, venezuela
green: bolivia, brazil, french_guiana, guyana, suriname
red: bolivia, brazil, chile, colombia, ecuador, falkland_islands, french_guiana, guyana, paraguay, peru, suriname, trinidad_and_tobago, venezuela
black: guyana, trinidad_and_tobago
}
```

---

## How to Run

### Prerequisites
- Python 3.x installed.

### Steps
1. **Clone or Copy the Code**

2. **Run any script:**
   ```bash
   python Programming\ Assignment\ Unit\ 8.py
   python Discussion\ Assignment\ Unit\ 8.py
   ```

--- 

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**

