// An algorithm that given an NxN matrix, returns the same matrix with a 90-degree rotation
package algorithm.arrayandstring;

public class RotateMatrix {
  public static int[][] rotateNintyDegree(int[][] matrix){
    // {
    //   {11, 12, 15},  00 01 02 --> 02 12 22
    //   {30, 42, 45},  10 11 12 --> 01 11 21
    //   {19, 50, 79}   20 21 22 --> 00 10 20
    // }
    int l = matrix.length;

    // Handle the case where matrix is a vector
    if(l == 1)
      return matrix;

    int[][] result = new int[l][l];

    for(int row = 0; row < l; row++){
      for(int col = 0; col < l; col++){
        int val = matrix[row][col];
        result[col][l - 1 - row] = val;
      }
    }

    return result;
  }
}
