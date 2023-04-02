package algorithm.arrayandstring;

public class Main {
    public static void main(String[] args) {
        testUniqueness();
    }

    public static void testUniqueness() {
        String test_word = "tesT";
        boolean test_result = new CheckUniqueness().isUnique(test_word);
        System.out.println("String: " + test_word + " | isUnique: " + test_result);
    }
}
