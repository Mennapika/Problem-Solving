class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int i = right;
        int[] Squared = new int[right+1];
        while( left <= right ){
            if( Math.abs(nums[left]) > Math.abs(nums[right]) ){
                Squared[i] = nums[left] * nums[left];
                left++;
                i--;
            }else{
                Squared[i] = nums[right] * nums[right];
                i--;
                right--;
            }
        } 
        return Squared;    
    }
}
