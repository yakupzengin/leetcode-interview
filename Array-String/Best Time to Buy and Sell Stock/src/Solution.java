/*
121. Best Time to Buy and Sell Stock
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.



 */
public class Solution {

    // Function to find the maximum profit
    public static int maxProfit(int[] prices) {
        // If the prices array is null or contains less than 2 elements, return 0
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0]; // Initialize the minimum buying price
        int maxProfit = 0; // Initialize the maximum profit

        // Iterate through the prices array starting from the second element
        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]); // Update the minimum buying price
            maxProfit = Math.max(maxProfit, prices[i] - minPrice); // Update the maximum profit
        }

        return maxProfit; // Return the maximum profit
    }

    // Main method to test the maxProfit function
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example input prices
        int result = maxProfit(prices); // Calculate the maximum profit
        System.out.println(result); // Print the result
    }
}
