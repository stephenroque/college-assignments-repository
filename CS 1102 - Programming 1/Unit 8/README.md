# Employee Management System

This project demonstrates a simple **Employee Management System** implemented in Java, where you can manage and analyze employee data using basic object-oriented principles and Java Stream API.

The system allows you to perform several tasks with employee records, such as concatenating employee name and department, calculating average salaries, and filtering employees based on their age. It showcases the power of functional programming with Java Streams.

## Project Structure

### **Classes**

- **Employee**  
  This class represents an employee with attributes like `name`, `age`, `department`, and `salary`. It also provides getter methods for these attributes.

- **EmployeeManagement**  
  The main class that demonstrates different operations on employee data using Java's `Stream` API. It includes:
  - Concatenating employee names and departments into a list of strings.
  - Calculating the average salary of all employees.
  - Filtering employees based on a certain age threshold.

## Features

1. **Concatenate Name and Department**  
   The program uses a Java `Function` to concatenate each employee's name with their department. The result is displayed as a list of strings, such as `"Alice (Engineering)"`.

2. **Calculate Average Salary**  
   It calculates the average salary of all employees by mapping their salaries to a `DoubleStream` and applying the `average()` method.

3. **Filter Employees by Age**  
   Employees who are older than a given threshold (e.g., 30 years) are filtered from the employee list using the `filter()` method of `Stream`. The filtered employees are then printed with their name, age, department, and salary.

## Code Overview

### **Employee Class**

This class represents an individual employee with the following fields:
- `name`: The name of the employee.
- `age`: The age of the employee.
- `department`: The department the employee works in.
- `salary`: The employee's salary.

It provides the following getter methods:
- `getName()`
- `getAge()`
- `getDepartment()`
- `getSalary()`

### **EmployeeManagement Class**

This class demonstrates the use of Java's Stream API on a list of `Employee` objects. The class performs the following tasks:

1. **Concatenation**  
   A `Function<Employee, String>` is used to concatenate the employee's name and department. The concatenated values are stored in a list and printed out.

2. **Average Salary Calculation**  
   Using the `mapToDouble()` method, the program calculates the average salary of all employees. The result is printed to the console.

3. **Age Filtering**  
   Employees older than a specific age threshold (30 in this case) are filtered and their details are printed.

## Sample Output

```plaintext
Concatenated Name and Department:
Alice (Engineering)
Bob (Marketing)
Charlie (Engineering)
David (HR)
Eve (Finance)

Average Salary: 83000.0

Employees older than 30 years:
Alice, 35, Engineering, 90000.0
Charlie, 40, Engineering, 110000.0
David, 32, HR, 70000.0
Eve, 45, Finance, 120000.0
```

## How to Run

### Prerequisites
- JDK 8 or higher.

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/stephenroque/college-assignments-repository.git
   ```
2. Navigate to the project folder:
   ```bash
   cd college-assignments-repository/CS\ 1102\ -\ Programming\ 1/Unit\ 8/EmployeeManagement/src/
   ```

### **Setup**
1. Compile the Java files:
   ```bash
   javac *.java
   ```
2. Run the `EmployeeManagement` class:
   ```bash
   java EmployeeManagement
   ```

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**
