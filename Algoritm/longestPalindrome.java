class Solution {
    public int longestPalindrome(String s) {
      HashMap<Character,Integer> map=new  HashMap<>();
        for(int i=0; i<s.length();i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int result=0;
        boolean b=true;
        for(int value:map.values())
        {
            if(value%2==0){
                result+=value;
            }else{
                if(b){
                     result+=value;
                    b=false;;
                }else{
                      result+=value-1;
                }
            }
        }
        return result;
    }
}
