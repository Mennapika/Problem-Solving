class Solution {
    public boolean isPalindrome(int x) {
       int remeber =0;
        int num=x;
        int tempn=x;
        int reverse=0;
        while(num>0)
        {
            remeber=num%10;
            reverse=(reverse*10)+remeber;
            num=num/10;
            
        }
        if(reverse==tempn){
            return true;
        }
        return false;        
        
    
    }
}
