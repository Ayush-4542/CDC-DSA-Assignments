class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c==mat.length*mat[0].length){
            int [][] Reshape = new int[r][c];
            int row=0;
            int col=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                    Reshape[i][j] = mat[row][col];
                        col++;
                    if(col==mat[0].length){
                        row++;
                        col=0;
                    }
                   

                }
            }
            return Reshape;
        }
        else{
            return mat;
        }
        
    }
}
