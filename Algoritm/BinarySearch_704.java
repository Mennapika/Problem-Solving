
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

//You must write an algorithm with O(log n) runtime complexity.
//ex1:
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//ex2:
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
//constrains
//1 <= nums.length <= 104
//-104 < nums[i], target < 104
//All the integers in nums are unique.
//nums is sorted in ascending order.
//***************Solution**************** */
class Solution {
    // binary search: O(LgN ) : N -> array length
    // space complexity O(1) : don't use another space to store
    public int search(int[] nums, int target) {
        //base case
        if(nums.length == 0) return -1;
        // use two pointer 
        int left = 0, right = nums.length - 1;
        while(left <= right){
            // avoid overflow
            int mid = (left + (right - left))/2;
            // find target;
            if(nums[mid] == target) return mid;
            // smaller than target
            else if(nums[mid] < target){
                //shrink left boundary
                left = mid + 1;
            // larger than target
            } else{
                // shrink right boudary
                right = mid - 1;
            }
        }
        return -1;
        
    }
}