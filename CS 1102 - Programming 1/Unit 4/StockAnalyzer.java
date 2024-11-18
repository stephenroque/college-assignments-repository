import java.util.ArrayList;

public class StockAnalyzer {
    
    /**
     * Calculates the average price for an array of stock prices.
     * @param prices The array of stock prices.
     * @return The average price of the stock prices.
     */
    public static float calculateAveragePrice(float[] prices) {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }
    
    /**
     * Calculates the average price for an ArrayList of stock prices.
     * @param prices The ArrayList of stock prices.
     * @return The average price of the stock prices.
     */
    public static float calculateAveragePrice(ArrayList<Float> prices) {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.size();
    }
    
    /**
     * Finds the maximum stock price in an array.
     * @param prices The array of stock prices.
     * @return The maximum price among all the stock prices.
     */
    public static float findMaximumPrice(float[] prices) {
        float maxPrice = Float.MIN_VALUE;
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }
    
    /**
     * Finds the maximum stock price in an ArrayList.
     * @param prices The ArrayList of stock prices.
     * @return The maximum price among all the stock prices.
     */
    public static float findMaximumPrice(ArrayList<Float> prices) {
        float maxPrice = Float.MIN_VALUE;
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }
    
    /**
     * Counts occurrences of a specific price in an array.
     * @param prices The array of stock prices.
     * @param targetPrice The target price to count occurrences.
     * @return The number of times the target price occurs in the array.
     */
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Counts occurrences of a specific price in an ArrayList.
     * @param prices The ArrayList of stock prices.
     * @param targetPrice The target price to count occurrences.
     * @return The number of times the target price occurs in the ArrayList.
     */
    public static int countOccurrences(ArrayList<Float> prices, float targetPrice) {
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Computes the cumulative sum of stock prices in an ArrayList.
     * @param prices The ArrayList of stock prices.
     * @return A new ArrayList containing the cumulative sum of prices at each position.
     */
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : prices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    public static void main(String[] args) {
        // Example usage
        float[] pricesArray = {10, 20, 30, 40, 30, 25, 35, 42, 38, 27};
        ArrayList<Float> pricesArrayList = new ArrayList<>();
        for (float price : pricesArray) {
            pricesArrayList.add(price);
        }
        
        System.out.println("Average price (array): " + calculateAveragePrice(pricesArray));
        System.out.println("Average price (ArrayList): " + calculateAveragePrice(pricesArrayList));
        
        System.out.println("Maximum price (array): " + findMaximumPrice(pricesArray));
        System.out.println("Maximum price (ArrayList): " + findMaximumPrice(pricesArrayList));
        
        float targetPrice = 30.0f;
        System.out.println("Occurrences of " + targetPrice + " (array): " + countOccurrences(pricesArray, targetPrice));
        System.out.println("Occurrences of " + targetPrice + " (ArrayList): " + countOccurrences(pricesArrayList, targetPrice));
        
        System.out.println("Cumulative sum (ArrayList): " + computeCumulativeSum(pricesArrayList));
    }
}
