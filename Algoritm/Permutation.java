class Solution {

public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    boolean [] visit = new boolean[nums.length];
    dfs(nums, visit, new ArrayList<>(), res);     
    return res;
}
void dfs(int[] nums, boolean [] visit, List<Integer> now, List<List<Integer>> res){
    if(now.size() == nums.length){
        res.add(new ArrayList<>(now));
        return;
    }
    for(int i = 0; i < nums.length; i++){
        if(visit[i] == false){
            visit[i] = true;
            now.add(nums[i]);
            dfs(nums, visit, now, res);
            now.remove(now.size()-1);      
            visit[i] = false;
        }
    } 
}
}
