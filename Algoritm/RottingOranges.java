class Solution {
    public class pair{
        int i;
        int j;
        
        pair(){};
        pair(int row, int col){
            i = row;
            j = col;
        }
    }
    
    //graph bfs ( remove mark work add)
    public int init(Queue<pair> qu, int [][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int freshOranges = 0;
       
        for(int i =0; i<m; ++i){
            for(int j=0; j<n; ++j){
                if(grid[i][j] == 2){
                    qu.add(new pair(i,j));
                }
                else if( grid[i][j] == 1){
                    freshOranges++;
                }
                
            }
        }
        return freshOranges;
    }
    
    int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<pair> qu = new LinkedList<>();

        int freshOranges = init(qu, grid);
        int time = 0;
        if(freshOranges == 0){
            return 0;
        }
        
        while(qu.size() != 0){
            int size = qu.size();
            
            while(size-- > 0){
                pair rem = qu.remove();
                for(int[] d : dir){
                    int row = rem.i + d[0];
                    int col = rem.j + d[1];
                    if(  row >= 0 && row < m && col >=0 && col < n && grid[row][col] == 1 ){
                        freshOranges--;
                        grid[row][col] = 2;
                        qu.add(new pair(row, col));
                    }
                    if(freshOranges == 0){
                        return time+1;  //since we  are increasing time at the last so we do +1 here before returning
                    }
                }
            }
           time++; 
        }
        return freshOranges != 0 ? -1 : time;
    }
}
