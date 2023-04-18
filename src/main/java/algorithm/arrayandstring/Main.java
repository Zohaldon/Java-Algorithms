package algorithm.arrayandstring;

public class Main {
  public static void main(String[] args) {
    // TODO: Add unit tests for the algorithms
    testUniqueness();
    testPermutation();
    testURLified();
    testPalindromePermutation();
    testOneAway();
    testStringCompressor();
    testRotateMatrix();
    testZeroMatrix();
  }

  public static void testUniqueness() {
    String test_word = "tesT";
    boolean test_result = CheckUniqueness.isUnique(test_word);
    System.out.format("%-10s %-10s\n", "Input", "IsUnique");
    System.out.format("%-10s %-10s\n", test_word, test_result);
  }

  public static void testPermutation(){
    // A: tester | B: ttrees    (true)
    // A: abcdef | B: dcefba    (true)
    // A: tester | B: tt        (false)
    // A: abcdef | B: dcefbavol (false)
    // A: aab    | B: aaa       (false)
    String[] comparands =    { "tester", "abcdef", "tester",  "abcdef",    "aab"};
    String[] permutations = { "ttrees", "dcefba", "tt",      "dcefbavol", "aaa"};

    System.out.println("O(NlogN) Runtime method");
    System.out.format("%-10s %15s %20s\n", "Target", "Input", "IsPermutation");
    System.out.println("------------------------------------------------");
    for(int i = 0; i < comparands.length; i++) {
      boolean test_result = CheckPermutation.isPermutationUsingSort(comparands[i], permutations[i]);
      System.out.format("%-10s %15s %20s\n", comparands[i], permutations[i], test_result);
    }
    System.out.println("------------------------------------------------\n\n");

    System.out.println("O(N) Runtime method");
    System.out.format("%-10s %15s %20s\n", "Target", "Input", "IsPermutation");
    System.out.println("------------------------------------------------");
    for(int i = 0; i < comparands.length; i++) {
      boolean test_result = CheckPermutation.isPermutation(comparands[i], permutations[i]);
      System.out.format("%-10s %15s %20s\n", comparands[i], permutations[i], test_result);
    }
  }

  public static void testURLified(){
    // Sample input:   "  Mr John Smith  ", 13
    // Sample input:   "Mr John Smith    ", 13
    // Sample output": "Mr%20John%20Smith"
    String[] inputs = {
      "  Mr John Smith  ",
      "Mr John Smith    ",
      "                 ",
      "3a2s1d8q5we34&*@3"
    };

    System.out.format("%-20s %15s\n", "Input", "Output");
    System.out.println("--------------------------------------------");
    for(String testInput: inputs){
      String testOutput = UrLify.URLifyWhitespace(testInput, 13);
      System.out.format("%-20s %20s\n", testInput, testOutput);
    }
    System.out.println("--------------------------------------------");
  }

  public static void testPalindromePermutation(){
    // input: Tact Coa
    // output: True ( taco cat, tact coa)
    String testInput = "AtCo Cta";
    boolean testOutput = PalindromePermutation.isPalindromePermutation(testInput);
    System.out.println("Input: " + testInput + " | Output: " + testOutput );
  }

  public static void testOneAway(){
    String[][] inputs = {
      { "pale", "ple" },
      { "ale", "pale" },
      { "pales", "pale" },
      { "pale", "bale" },
      { "pale", "bake" },
      { "", "a" },
      { "top", "po" },
      { "topper", "opped" },
      { "b", "" },
      { "pap", "pab"}
    };

    System.out.format("%-8s %10s %15s\n", "Target", "Input", "IsOneEditAway");
    System.out.println("--------------------------------------------");
    for(String[] inputSet: inputs){
      String target = inputSet[0];
      String input = inputSet[1];
      boolean result = OneEditAway.isOneAway(target, input);
      System.out.format("%-10s %8s %10s\n", target, input, result);
    }
    System.out.println("--------------------------------------------");
  }

  public static void testStringCompressor(){
    String[] inputs = { "aaa", "C", "DD", "aAz", "mooooooooon", "aabb", "aaaabbb", "ZOOOOOOoOOOooooooMMMMMmm"};

    System.out.format("%-30s %-25s\n", "Input", "CompressedFormat");
    System.out.println("--------------------------------------------");
    for(String input: inputs){
      String result = StringCompression.compress(input);
      System.out.format("%-30s %-30s\n", input, result);
    }
    System.out.println("--------------------------------------------");
  }

  public static void testRotateMatrix(){
    int[][] matrix1 = {
      { 81, 77, 43, 38 },
      { 12, 41, 80, 9 },
      { 21, 16, 17, 10 },
      { 23, 18, 11, 15 }
    };

    int[][] matrix2 ={
       {11, 12, 15},
       {30, 42, 45},
       {19, 50, 79}
     };

    int[][] matrix3 = {
      {1}
    };

    int[][] matrix4 = {
      {3, 5},
      {9, 0}
    };

    int[][][] inputs = { matrix1, matrix2, matrix3, matrix4 };

    for(int[][] matrix: inputs){
      int[][] result = RotateMatrix.rotateNintyDegree(matrix);

      System.out.println("Input Matrix:");
      printMatrix(matrix);

      System.out.println("Output Matrix:");
      printMatrix(result);
    }

  }

  public static void testZeroMatrix(){
    int[][] matrix1 = {
      { 15, 0 , 18 },
      { 13, 11, 12 },
      { 11, 12, 14 },
      { 19, 18, 11 }
    };
    int[][] matrix2 = {
      { 1, 2, 5, 9 },
      { 7, 9, 0, 7 },
      { 9, 6, 2, 1 },
      { 8, 7, 4, 0 }
    };
    int[][] matrix3 = {
      { 1, 3, 4 },
      { 0, 2, 1 }
    };
    int[][] matrix4 = {
      { 1, 2 },
      { 3, 0 },
      { 0, 2 }
    };
    int[][] matrix5 = { { 0 } };
    int[][] matrix6 = { { 1, 0 } };

    int[][][] inputMatrices = { matrix1, matrix2, matrix3, matrix4, matrix5, matrix6 };

    for(int[][] matrix: inputMatrices){
      System.out.println("Input Matrix:");
      printMatrix(matrix);

      int[][] result = ZeroMatrix.transformMatrix(matrix);

      System.out.println("Output Matrix:");
      printMatrix(result);
    }
  }
  private static void printMatrix(int[][] matrix){
    int colLength = matrix[0].length;
    if(colLength == 1){
      System.out.println(matrix[0][0]);
    }
    else {
      for (int[] row : matrix) {
        for (int col = 0; col < colLength; col++) {
          System.out.format("%2s ", row[col]);
        }
        System.out.println();
      }
    }
    System.out.println();
  }
}
