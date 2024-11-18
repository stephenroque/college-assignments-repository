**Stock Analyzer Documentation**

**Overview**

The Stock Analyzer program is a Java application designed to perform
various operations on a set of stock prices. It provides functionality
to calculate the average price, find the maximum price, count
occurrences of a specific price, and compute the cumulative sum of stock
prices. The program supports both arrays and ArrayLists of stock prices.

**Running the Program**

1. **Compile the Code:** Use a Java compiler to compile the
    'StockAnalyzer.java' file. Open a terminal or command prompt and
    navigate to the directory containing the Java file.

> javac StockAnalyzer.java

2. **Run the Program:** Execute the compiled Java file using the 'java'
    command.

> java StockAnalyzer

**Interface**

The Stock Analyzer program provides a simple command-line interface for
interacting with the functionality. Here\'s how to interact with the
administrator interface:

1.  Upon running the program, it will display the calculated results for
    average price, maximum price, occurrences of a specific price, and
    cumulative sum of stock prices.

2.  The results will be displayed for both array-based and
    ArrayList-based data.

3.  You can customize the input stock prices by modifying the
   **pricesArray** and**pricesArrayList** variables in the**main**
    method of the program.

4.  The program will prompt you with the results and exit once the
    execution is complete.

**Method Documentation**

**calculateAveragePrice**

-  **Description**: Calculates the average price of the stock prices.

-  **Parameters**:

    -  **prices**: An array of float representing the stock prices.

    -  **prices**: An ArrayList of Float representing the stock prices.

-  **Return Value**: The average price of the stock prices as a float.

**findMaximumPrice**

-  **Description**: Finds the maximum price among all the stock prices.

-  **Parameters**:

    -  **prices**: An array of float representing the stock prices.

    -  **prices**: An ArrayList of Float representing the stock prices.

-  **Return Value**: The maximum price among all the stock prices as a
    float.

**countOccurrences**

-  **Description**: Determines the occurrence count of a specific price
    in the stock prices.

-  **Parameters**:

    -  **prices**: An array of float representing the stock prices.

    -  **prices**: An ArrayList of Float representing the stock prices.

    -  **targetPrice**: The target price whose occurrences need to be
        counted.

-  **Return Value**: The number of times the target price occurs in the
    stock prices as an integer.

**computeCumulativeSum**

-  **Description**: Computes the cumulative sum of stock prices at each
    position.

-  **Parameters**:

    -  **prices**: An ArrayList of Float representing the stock prices.

-  **Return Value**: An ArrayList of Float containing the cumulative
    sum of prices at each position.
