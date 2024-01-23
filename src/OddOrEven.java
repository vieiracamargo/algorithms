import java.util.Arrays;

public class OddOrEven {
    public static void main(String[] args) {
        var numbers = new int[]{};
        System.out.println(oddOrEven(numbers));
    }
    public static String oddOrEven(int[] array){
        return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}
