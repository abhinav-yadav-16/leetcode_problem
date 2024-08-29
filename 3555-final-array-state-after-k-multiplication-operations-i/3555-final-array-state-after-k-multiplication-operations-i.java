public class Solution {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;

        Solution solution = new Solution();
        int[] result = solution.getFinalState(nums, k, multiplier);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;

        // Perform k operations
        for (int operation = 0; operation < k; operation++) {
            // Find the index of the minimum value
            int minIndex = 0;
            for (int i = 1; i < n; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }

            // Replace the minimum value with its multiplied value
            nums[minIndex] *= multiplier;
        }
        
        return nums;
    }
}