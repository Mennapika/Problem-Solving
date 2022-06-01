class Solution {
    public int[] runningSum(int[] nums) {
        int sumIncrement=0;
        for(int i=0;i<nums.length;i++)
        {
            
            nums[i]=nums[i]+sumIncrement;
            sumIncrement=nums[i];
        }
        return nums;
    }
}
