/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci;

/**
 *
 * @author suresh
 */
public class Rotate90 {
    public static void main(String[] args){
        int[][] matrix = new int[][]{
                        {0,1,2,3},
                        {4,5,6,7},
                        {8,9,10,11},
                        {12,13,14,15}
                        };
        int side = matrix[0].length;
        int[][] rotated = rotate90(matrix,side);
        for(int i=0;i<side;i++){
            StringBuilder builder = new StringBuilder();
            for(int j=0;j<side;j++){
                builder.append(rotated[i][j]).append("\t");
            }
            System.out.println(builder);
            builder.setLength(0);
        }
        
    }
    private static int[][] rotate90(int[][] inMatrix, int side ){
        int[][] outMatrix = new int[4][4];
        for(int row=0;row<side;row++){
            for(int col=0;col<side;col++){
                outMatrix[col][side-1-row] = inMatrix[row][col];
            }
        }
        return outMatrix;
    }
}
