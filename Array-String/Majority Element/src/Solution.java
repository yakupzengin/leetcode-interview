class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate  = nums[0];

        // Iterate through the array
        for (int num : nums){
            // if count is zero, update the candidate element
            if (count ==0 ){
                candidate = num;
                count++;

            }
            // If current element is the same as candidate, increment count
            else if (num == candidate){
                count++;
            }
            // If current element is different from candidate, decrement count
            else {
                count--;
            }
        }
        return candidate;
    }
}