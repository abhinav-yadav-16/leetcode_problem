class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if((nums[i] + nums[i+1]) %2==0){
                return false;
            }
        }
        return true;
    }
}


// for(int i=0; i<n-1; i++){
//             if(nums[i] % 2==0 && nums[i+1]%2==0){
//                 return false;
//             }
//             else if(nums[i] %2 != 0 && nums[i+1] %2 != 0){
//                 return false;
//             }
//             else{
//                 return true;
//             }
//         }
//         return true;