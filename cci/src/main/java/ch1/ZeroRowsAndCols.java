/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author suresh
 */
public class ZeroRowsAndCols {
    public static void main(String[] args){
        int[][] matrix = new int[][]{
                        {1,0,2,3},
                        {4,5,0,7},
                        {8,0,10,11},
                        {12,13,14,15}
                        };
        int nrows = matrix.length;
        int ncols = matrix[0].length;
        int[][] zeroed = zeroRowsAndCols(matrix,nrows,ncols);
        StringBuilder builder = new StringBuilder();
        for(int row = 0;row<nrows;row++){
            for(int col =0;col<ncols;col++){
                builder.append(zeroed[row][col]).append("\t");
            }
            System.out.println(builder);
            builder.setLength(0);
        }
    }
    static int[][] zeroRowsAndCols(int[][] input, int nrows, int ncols){
        int[][] zeroed = new int[nrows][ncols];
        
        HashSet<Integer> rowsToZero = new HashSet();
        HashSet<Integer> colsToZero = new HashSet();
        for(int row = 0;row<nrows;row++){
            for(int col =0;col<ncols;col++){
                if(input[row][col]==0){
                    rowsToZero.add(row);
                    colsToZero.add(col);
                }
            }
        }
        for(int row=0;row<nrows;row++){
            zeroed[row]=Arrays.copyOf(input[row], ncols);
            if(rowsToZero.contains(row)){
                Arrays.fill(zeroed[row], 0);
            }
        }
        for(int zeroedCol : colsToZero){
            for(int row=0;row<nrows;row++){
                zeroed[row][zeroedCol]=0;
            }
        }
        return zeroed;
    }
}
