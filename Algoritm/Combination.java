class Solution {
    public static List<List<Integer>> result;
    public static void GetCombine(int left , int n, int start,List<Integer> current){
         if (left == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<n;i++){
            current.add(i+1);
            GetCombine(left-1 , n, i+1, current);
            current.remove(current.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) 
    { 
        result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
         GetCombine(k , n, 0, current);
        return result;
    }
}
