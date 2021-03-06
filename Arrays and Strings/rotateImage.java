//You are given an n x n 2D matrix representing an image.

//Rotate the image by 90 degrees (clockwise).

class Solution {
    public void rotate(int[][] matrix) {
        int size = matrix[0].length;
        
	//first transpose
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        
	//then mirror
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][size-1-j];
                matrix[i][size-1-j] = tmp;
            }
        }
    }
}