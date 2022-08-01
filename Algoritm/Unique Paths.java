class Solution {
    public int uniquePaths(int m, int n) {
        int [][] field= new int[m][n];
        return uniquePaths(field,m-1, n-1);

        
    }
    public int uniquePaths(int[][] field,int x, int y)
    {
        if(x<0 || y<0){
            return 0;
        }
        if(x==0 && y==0){
            return 1;
        }
        if(field[x][y]==0){
            field[x][y]+=uniquePaths(field,x-1, y);
            field[x][y]+=uniquePaths(field,x, y-1);
        }
        return field[x][y];
    }
}
