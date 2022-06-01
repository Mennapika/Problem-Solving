class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int totalLen = len1 + len2;
        
        int[] mergedNums = new int[totalLen];
        System.arraycopy(nums1, 0, mergedNums, 0, len1);
        System.arraycopy(nums2, 0, mergedNums, len1, len2);
        Arrays.sort(mergedNums);
        
        if (totalLen % 2 == 0) {
            return (double) (mergedNums[totalLen/2 - 1] + mergedNums[totalLen/2]) / 2;
        }
        
        return mergedNums[totalLen/2];
    }
}
