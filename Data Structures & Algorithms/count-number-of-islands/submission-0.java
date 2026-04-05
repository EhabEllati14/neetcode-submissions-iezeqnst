class Solution {
    public int numIslands(char[][] grid) {
       int row = grid.length;
       int col = grid[0].length;
       int numOfIslands=0;
       for(int i=0; i<row;i++){
        for(int j=0;j<col;j++){
            if(grid[i][j] == '1'){
                numOfIslands++;
            }
            dfs(grid, i,j);
        }
       }
       return numOfIslands;
    }
    public void  dfs(char[][] grid, int row, int col){
        if(row < 0 || col < 0 || row>=grid.length || col >= grid[0].length || grid[row][col]=='0'){
            return;
        }
        grid[row][col] ='0';

        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
       dfs(grid,row,col-1);

    }
}
