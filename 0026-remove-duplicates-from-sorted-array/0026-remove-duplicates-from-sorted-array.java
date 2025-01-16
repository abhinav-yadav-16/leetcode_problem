class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueIndex = 0; // Points to the last unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;       // Move the pointer forward
                nums[uniqueIndex] = nums[i]; // Update the position with the next unique element
            }
        }
        return uniqueIndex + 1; // Return the length of the unique elements
    }
}
