/*
45. Jump Game II
You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i.
In other words, if you are at nums[i], you can jump to any nums[i + j] where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach nums[n - 1].
The test cases are generated such that you can reach nums[n - 1].

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: nums = [2,3,0,1,4]
Output: 2

 */
public class Solution {
    // Method to find minimum jumps required to reach the last index
    public static int jump(int[] nums) {
        int totalJumps = 0; // Total number of jumps made
        int destination = nums.length - 1; // Destination index
        int coverage = 0; // Maximum reachable index from the current position
        int lastJumpIndex = 0; // Index of the last jump made

        // If there's only one element in the array, no jumps needed
        if (nums.length == 1) {
            return 0;
        }

        // Greedy strategy: extend coverage as long as possible
        for (int i = 0; i < nums.length; i++) {
            coverage = Math.max(coverage, i + nums[i]); // Extend coverage to the maximum reachable index

            if (i == lastJumpIndex) { // If the current index is the last index reached by the last jump
                lastJumpIndex = coverage; // Update the index of the last jump made
                totalJumps++; // Increment the total number of jumps made

                // Check if we've reached the destination already
                if (coverage >= destination)
                    return totalJumps;
            }
        }
        return totalJumps; // Return the total number of jumps made
    }

    // Main method to test the jump function
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4}; // Example input array
        System.out.println(jump(nums)); // Output the minimum jumps required to reach the last index
    }
}
