import java.util.Arrays;

public class smallerNumbersThanCurrent {
    public static int[] smallerNumbersThanCurrentMethod(int[] nums) {
        int[] result = new int[nums.length];

        // Loop over each element in nums
        for (int i = 0; i < nums.length; i++) {
            int count = 0; // Reset count for each i

            // Compare nums[i] to every other number in the array
            for (int j = 0; j < nums.length; j++) {
                // Do not compare the number to itself
                if (i != j && nums[j] < nums[i]) {
                    count++; // Count nums[j] if it is smaller than nums[i]
                }
            }

            result[i] = count; // Store the count for this element
        }

        return result;
    }

    public static void main(String[] args) {
        int nums [] = new int[] {8,1,2,2,3};
        int [] result = smallerNumbersThanCurrentMethod(nums);
        System.out.println(Arrays.toString(result));
    }
}
