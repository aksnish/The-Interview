package Random;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConnectedCells {
    
    private static int getMaxRegion(int [][] matrix, int row, int column){
        if(row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length){
            return 0;
        }
        
        if(matrix[row][column] == 0){
            return 0;
        }
        matrix[row][column] = 0;
        int size = 1;
        for(int r = row-1; r <= row+1; r++){
            for(int c = column-1; c <= column+1; c++ ){
                if(r != row || c != column){
                    size += getMaxRegion(matrix, r, c);
                    }
            }
        }
        return size;
    }
    
    public static int getBiggestRegion(int[][] matrix) {
        int maxRegion = 0;
       // System.out.println(matrix.length+"  col:  "+matrix[row].length);
        for(int row = 0; row <matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column] == 1){
                    int size = getMaxRegion(matrix, row, column);
                    maxRegion = Math.max(size, maxRegion);
                }
            }
        }
       return maxRegion; 
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}

