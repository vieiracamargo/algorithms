import java.util.Arrays;

public class CountOfPositivesSumOfNegatives {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(numbers)));
    }

    public static int[] countPositivesSumNegatives(int[] input) {
        if(input == null || input.length == 0){
            return new int[]{};
        }
        var numberOfPositives = Arrays.stream(input).filter(n -> n > 0).count();
        var sumOfNegatives = Arrays.stream(input).filter(n -> n < 0).sum();
        return new int[]{(int) numberOfPositives, sumOfNegatives};
    }
}
