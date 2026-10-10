public class NumberProgram {

    public static void main(String[] args) {
        int[] values = {3, 7, 2, 9, 4};

        int result = findResult(values);

        System.out.println("Result: " + result);
    }
// Iteration 2: Find the largest values in the array
    public static int findResult(int[] values) {
        int largest = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > largest) { largest = value; }
        }
        return largest;
    }
}
