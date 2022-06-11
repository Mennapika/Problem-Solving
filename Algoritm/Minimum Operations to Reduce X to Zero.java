class Solution {
    public int minOperations(int[] nums, int x) {
        int result=-1;
        int target=-x;
        for(int num:nums){target+=num;}
        int n=nums.length;
        if(target==0){return n;}
        else if(target<0){return -1;}
        int left=0,sum=0;
        for(int right=0;right<n;right++)
        {
            sum+=nums[right];
            if(sum==target){
                result=Math.max(result,right-left+1);
            }
            else if(sum>target){
                sum-=nums[left];
                left++;
                sum-=nums[right]; 
                right--; 
            }
        }
        return (result==-1)?-1:n-result;
    }
}


