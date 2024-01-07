import java.util.Arrays;

public class Sequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

    public static int[] reverse(int n) {
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = n-i;
        }

        return numbers;
    }
}
