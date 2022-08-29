class Solution {
    public boolean isSubsequence(String s1, String s2) {
        int n = s1.length(), m = s2.length();
    int i = 0, j = 0;
    while (i < n && j < m) {
        if (s1.charAt(i) == s2.charAt(j))
            i++;
        j++;
    }
    /*If i reaches end of s1,that mean we found all
    characters of s1 in s2,
    so s1 is subsequence of s2, else not*/
    return i == n;
    }
}
