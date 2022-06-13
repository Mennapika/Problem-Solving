
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i =1; i<triangle.size();i++){
            for (int j =0; j<triangle.get(i).size();j++){
                List<Integer>temp = triangle.get(i);
                if(j==0){
                    temp.set(j,triangle.get(i-1).get(j)+temp.get(j));
                }else if(j==triangle.get(i).size()-1){
                    temp.set(j,triangle.get(i-1).get(j-1)+temp.get(j));
                }else{
                    int min_p = Math.min(triangle.get(i-1).get(j),triangle.get(i-1).get(j-1))+ temp.get(j);
                    temp.set(j,min_p);
                }
            }
        }
        
        int min = triangle.get(triangle.size()-1).get(0);
        
        for (int i =0; i<triangle.get(triangle.size()-1).size();i++){
            min = Math.min(min,triangle.get(triangle.size()-1).get(i));
        }
        
        return min;
    }
}
