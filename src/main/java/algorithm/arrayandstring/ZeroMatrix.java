// An Algorithm that if an elements in an M x N matrix is 0, then it sets the entire row and column to 0.
package algorithm.arrayandstring;
import java.util.Hashtable;

public class ZeroMatrix {
  // Runtime: O(M x N)
  public static int[][] transformMatrix(int[][] matrix){
    int rowLength = matrix.length;
    int colLength = matrix[0].length;

    // Handle singular vector
    if(rowLength == 1 && colLength == 1)
      return matrix;

    Hashtable<Integer, Integer> colToZeroLedger = new Hashtable<>();
    Hashtable<Integer, Integer> rowToZeroLedger = new Hashtable<>();

    //scan for Zeros in matrix
    for(int i = 0; i < rowLength; i++){
      for(int j = 0; j < colLength; j++){
        if(matrix[i][j] == 0) {
          if(!colToZeroLedger.containsKey(j))
            colToZeroLedger.put(j, 1);
          if(!rowToZeroLedger.containsKey(i))
            rowToZeroLedger.put(i, 1);
          if(colToZeroLedger.size() == colLength || rowToZeroLedger.size() == rowLength)
            return generateZeroMatrix(rowLength, colLength);
        }
      }
    }


    return generateMatrix(matrix, rowToZeroLedger, colToZeroLedger);
  }

  private static int[][] generateMatrix(int[][] matrix, Hashtable<Integer, Integer> rowToZeroLedger, Hashtable<Integer, Integer> colToZeroLedger){
    int rowLength = matrix.length;
    int colLength = matrix[0].length;

    for(int i = 0; i < rowLength; i++){
      if(rowToZeroLedger.containsKey(i)){
        // Alternative approach => Arrays.fill(matrix[i], 0)
        for(int j = 0; j < colLength; j++){
          matrix[i][j] = 0;
        }
        continue;
      }

      for(int j = 0; j < colLength; j++){
        if(colToZeroLedger.containsKey(j)){
          matrix[i][j] = 0;
        }
      }
    }

    return matrix;
  }

  private static int[][] generateZeroMatrix(int rowLength, int colLength){
    int[][] zeroMatrix = new int[rowLength][colLength];
    for(int i = 0; i < rowLength; i ++){
      // Alternative approach => Arrays.fill(zeroMatrix[i], 0)
      for(int j = 0; j < colLength; j++){
        zeroMatrix[i][j] = 0;
      }
    }
    return zeroMatrix;
  }
}
