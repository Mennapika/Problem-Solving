class Solution {
    public int[] twoSum(int[] numbers, int target) {

         int start = 0;
         int end = numbers.length - 1;
         int n = numbers.length - 1;
         int counter = 0;
         int[] sum = new int[2];
 
         while (counter < n) {
             if (numbers[start] + numbers[end] == target) {
                 sum[0] = start + 1;
                 sum[1] = end + 1;
                 return sum;
             }
             if (numbers[start] + numbers[end] < target) {
                 start++;

             }
                 if (numbers[start] + numbers[end] > target) {
                     end--;
             }
             counter++;
         }
         return sum;
    }
}
