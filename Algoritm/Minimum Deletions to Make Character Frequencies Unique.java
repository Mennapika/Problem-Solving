class Solution {
    public int minDeletions(String s) {
        int[] alph=new int[26];
        for(int i=0; i<s.length();i++){
            ++alph[s.charAt(i)-'a'];
        }
        Arrays.sort(alph);
        int res=alph[25];
        int count=0;
        for(int i=24;i>=0&&alph[i]!=0;i--){
            while(alph[i]>=res && alph[i]>0){
                --alph[i];
                ++count;
            }
            res=alph[i];
        }
        return count;
    }
}
