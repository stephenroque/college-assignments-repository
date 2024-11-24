# Stock Analyzer

This Java-based program provides a set of utility methods for analyzing stock price data. It supports both array and `ArrayList` representations of stock prices and includes functions to calculate the average price, find the maximum price, count occurrences of a specific price, and compute the cumulative sum of stock prices.

## Features

1. **Calculate Average Price**:
   - Computes the average price from an array or an `ArrayList` of stock prices.
   
2. **Find Maximum Price**:
   - Finds the maximum stock price from an array or an `ArrayList`.

3. **Count Occurrences of a Specific Price**:
   - Counts how many times a specific price appears in an array or an `ArrayList`.

4. **Compute Cumulative Sum**:
   - Computes the cumulative sum of stock prices, giving the total sum up to each index.

## Methods

1. **`calculateAveragePrice(float[] prices)`**:
   - Calculates the average stock price for an array of prices.
   - Returns the average price as a float.

2. **`calculateAveragePrice(ArrayList<Float> prices)`**:
   - Calculates the average stock price for an `ArrayList` of prices.
   - Returns the average price as a float.

3. **`findMaximumPrice(float[] prices)`**:
   - Finds the maximum stock price in an array.
   - Returns the maximum price as a float.

4. **`findMaximumPrice(ArrayList<Float> prices)`**:
   - Finds the maximum stock price in an `ArrayList`.
   - Returns the maximum price as a float.

5. **`countOccurrences(float[] prices, float targetPrice)`**:
   - Counts how many times the target price appears in the array of stock prices.
   - Returns the count as an integer.

6. **`countOccurrences(ArrayList<Float> prices, float targetPrice)`**:
   - Counts how many times the target price appears in the `ArrayList` of stock prices.
   - Returns the count as an integer.

7. **`computeCumulativeSum(ArrayList<Float> prices)`**:
   - Computes and returns an `ArrayList` of the cumulative sum of stock prices.
   - The new list contains the running sum of prices.

## Output Example

```plaintext
Average price (array): 31.7
Average price (ArrayList): 31.7
Maximum price (array): 42.0
Maximum price (ArrayList): 42.0
Occurrences of 30.0 (array): 2
Occurrences of 30.0 (ArrayList): 2
Cumulative sum (ArrayList): [10.0, 30.0, 60.0, 100.0, 130.0, 155.0, 190.0, 232.0, 270.0, 297.0]
```

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed.

### Steps
1. **Clone or Copy the Code**

2. **Compile the Java Program**:
   ```bash
   javac StockAnalyzer.java
   ```

3. **Run the Program**: After compiling, run the program with the following command:
   ```bash
   java StockAnalyzer
   ```

4. **Test with Your Own Data**: You can modify the `pricesArray` or `pricesArrayList` with your own stock prices and experiment with the different methods.

## Technologies Used

- **Java**: The program is written in Java and uses basic control structures like loops and conditionals to process the stock price data.

---

## ⚠️ Disclaimer

- This repository is for **educational purposes only**. 
- Please do not use the content here to submit assignments as your own. Always adhere to your institution’s academic integrity policies. 

## 💡 About Me

Hi, I'm **Stephen Roque**, a passionate Computer Science student at the University of the People. I'm always looking to learn and collaborate on new projects. Check out my [GitHub profile](https://github.com/stephenroque) to see more of my projects and contributions. **Connect with me on my [LinkedIn profile](https://www.linkedin.com/in/stephenroque/)!**