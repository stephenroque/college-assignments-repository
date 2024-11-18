# Turtle Graphics Projects - Think Python Exercises / Projects - Unit 3

This project contains Python scripts inspired by *Think Python, 2nd Edition* by Allen Downey. The scripts showcase various techniques for using the `turtle` module, including drawing patterns, shapes, letters, and interactive features. 

## File Descriptions

### 1. **`flower.py`**
This script draws beautiful flowers using turtle graphics.  

- **Key Features**:
  - Draws flowers with customizable petal count, radius, and angles.
  - Includes functions to move the turtle without drawing.

- **Functions**:
  - `petal(t, r, angle)`: Draws a single petal using two arcs.
  - `flower(t, n, r, angle)`: Creates a flower with `n` petals.
  - `move(t, length)`: Moves the turtle forward without drawing.

---

### 2. **`letters.py`**
This script draws uppercase letters A-Z using geometric primitives.  

- **Key Features**:
  - Letters are drawn using lines, arcs, and diagonal strokes.
  - Each letter is defined as a function (`draw_a`, `draw_b`, etc.).
  - Supports customization of letter size.

- **Functions**:
  - Primitives like `post`, `beam`, and `diagonal` to build letter parts.
  - Example usage: spells the word "HELLO" using the defined letter functions.

---

### 3. **`pie.py`**
This script draws pies divided into equal radial segments.  

- **Key Features**:
  - Creates pies with a configurable number of segments.
  - Demonstrates geometric transformations with turtle.

- **Functions**:
  - `draw_pie(t, n, r)`: Draws a pie with `n` segments and radius `r`.
  - `polypie(t, n, r)`: Handles the pie division logic.
  - `isosceles(t, r, angle)`: Draws an isosceles triangle for each segment.

---

### 4. **`polygon.py`**
This utility script provides essential drawing functions for polygons and curves.

- **Key Features**:
  - Draws basic shapes like polygons, arcs, and circles.
  - Used as a dependency in other scripts like `flower.py`.

- **Functions**:
  - `polygon(t, n, length)`: Draws an `n`-sided polygon.
  - `arc(t, r, angle)`: Draws an arc with radius `r` and angle in degrees.
  - `circle(t, r)`: Draws a full circle.

---

### 5. **`Programming Assignment Unit 3 - Q1.py`**
This script demonstrates recursion through counting functions.

- **Key Features**:
  - Recursively counts up or down to zero.
  - Handles both positive and negative integers.

- **Functions**:
  - `countdown(n)`: Counts down from `n` to zero.
  - `countup(n)`: Counts up from `n` to zero.
  - `count(n)`: Decides whether to count up or down based on the input.

---

### 6. **`Programming Assignment Unit 3 - Q2.py`**
This script demonstrates exception handling in Python.

- **Key Features**:
  - Divides two numbers entered by the user.
  - Handles division by zero gracefully.

- **Function**:
  - `divide_numbers()`: Prompts for two numbers and prints the division result.

---

### 7. **`spiral.py`**
This script draws an Archimedean spiral using turtle graphics.

- **Key Features**:
  - Customizable spiral density and looseness.
  - Combines mathematical concepts with turtle graphics.

- **Function**:
  - `draw_spiral(t, n, length, a, b)`: Draws the spiral with specified parameters.

---

### 8. **`typewriter.py`**
An interactive script that maps keyboard input to turtle graphics, drawing letters on the screen.

- **Key Features**:
  - Uses the `letters.py` module to draw letters.
  - Interactive: Draw letters by pressing keys on the keyboard.
  - Supports carriage returns for multiline text.

- **Functions**:
  - `keypress(char)`: Draws the corresponding letter for the key pressed.
  - `carriage_return()`: Moves the turtle to the next line.
  - `presser(char)`: Binds keys to letter-drawing functions.

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
   cd college-assignments-repository/CS\ 1101\ -\ Programming\ Fundamentals/Unit\ 3/
   ```
3. Run any script:
   ```bash
   python flower.py
   python letters.py
   python pie.py
   python polygon.py
   python Programming\ Assignment\ Unit\ 3\ -\ Q1.py
   python Programming\ Assignment\ Unit\ 3\ -\ Q2.py
   python spiral.py
   python typewriter.py
   ```

---

## Examples of Output

### Example Output - `flower.py`
Three flowers are drawn with varying petal counts, sizes, and angles.

---

### Example Output - `letters.py`
Draws the word "HELLO" using predefined letter functions.

---

### Example Output - `pie.py`
Creates pies with 5, 6, 7, and 8 segments side by side.

---

### Example Output - `typewriter.py`
Interactive tool that types letters drawn by turtle graphics as you press keys.


--- 

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**