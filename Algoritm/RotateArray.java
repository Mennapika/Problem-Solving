class Solution {
    public static void reverse(int start , int end , int[]arr){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        if (nums == null || nums.length<2){
            return;
        }
        reverse(0,nums.length-1,nums );
        reverse(0,k-1,nums );
        reverse(k,nums.length-1,nums );
    }
}
