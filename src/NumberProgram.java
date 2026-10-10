public class NumberProgram {

    public static void main(String[] args) {
        int[] values = {3, 7, 2, 9, 4};

        int result = findResult(values);

        System.out.println("Result: " + result);
    }
// Iteration 3: Return the largest value, or Integer.MIN_VALUE if empty
    public static int findResult(int[] values) {
        int largest = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > largest) { largest = value; }
        }
        return largest;
    }
}
