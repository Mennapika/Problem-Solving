class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length(),sum=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0,j=0;i<n;i++){
            if(map.containsKey(s.charAt(i))){
                j=Math.max(map.get(s.charAt(i)),j);
            }
            sum=Math.max(sum,i-j+1);
            map.put(s.charAt(i),i+1);
        }
          return sum;
    }
}
