class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int maxLength = 0;
        for(int i=0; i<n; i++){
            int currLength=1;
            for(int j=i+1; j<n; j++){
                if(nums[j]>nums[j-1]){
                    currLength++;
                }
                else{
                    break;
                }
            }
            maxLength=Math.max(maxLength, currLength);
        }
        for(int i=0; i<n; i++){
            int currLength=1;
            for(int j=i+1; j<n; j++){
                if(nums[j] < nums[j-1]){
                    currLength++;
                }
                else{
                    break;
                }
            }
            maxLength = Math.max(maxLength,currLength);
        }
        return maxLength;
    }
}