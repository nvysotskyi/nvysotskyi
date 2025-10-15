import java.util.Arrays;

public class twoSum {
    // Method to find indices of two numbers in the array that sum up to the target
    public static int[] twoSumMethod(int[] nums, int target) {
        // Outer loop: Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Inner loop: Check each subsequent element after the current one
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the elements at positions i and j equals the target
                if (nums[i] + nums[j] == target) {
                    // If a matching pair is found, return their indices as an array
                    return new int[] {i, j};
                }
            }
        }
        // If no pair is found, return an empty array
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums [] = new int[] {1,3,5,6};
        int [] result = twoSumMethod(nums, 7);
        System.out.println(Arrays.toString(result));

    }

}
