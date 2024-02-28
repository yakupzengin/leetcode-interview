import java.lang.reflect.Array;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int constantIndex = m+n+-1;
        int index = m + n - 1; // Index to place merged elements in nums1 2

        // Merge nums1 and nums2 from the end
        int i = m - 1; // Pointer for nums1 1
        int j = n - 1; // Pointer for nums2 0

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i];
                // 1 2 2 0 8
                i--;
            } else {
                nums1[index] = nums2[j];
                // 1 1 2 0 8
                j--;
            }
            index--;
        }

        // If elements are left in nums2
        while (j >= 0) {
            nums1[index] = nums2[j];
            j--;
            index--;
        }

        for (int l = 0 ; l <= constantIndex ; l++) {
            System.out.print(Array.get(nums1,l));
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,8};
        int[] nums2 = {1,2,3,0,9,10};
        int m = 2;
        int n = 1;

        merge(nums1,m,nums2,n);

    }
}