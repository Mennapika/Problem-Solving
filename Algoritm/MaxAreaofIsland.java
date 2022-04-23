class Solution {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        boolean [][]vis=new boolean[n][m];
        int i,j;
        int max=0;            
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(grid[i][j]==1 && vis[i][j]==false)
                {
                    helper(i,j,grid,vis);
                    max=Math.max(max,count);
                    count=0;
                }
            }
        }
        return max;
    }
    public void helper(int i,int j,int[][]grid,boolean[][]vis)
    {
        int n=grid.length,m=grid[0].length;
        if(i<0 || j<0 ||i>=n||j>=m|| grid[i][j]==0|| vis[i][j]==true)
        {
            return;
        }
        vis[i][j]=true;
        if(grid[i][j]==1 && vis[i][j]==true)
        {
            count+=1;    
        }
        helper(i-1,j,grid,vis);//n
        helper(i,j-1,grid,vis);//w
        helper(i,j+1,grid,vis);//e
        helper(i+1,j,grid,vis);//s
    }
}
