import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        var number = 35231;
        System.out.println(Arrays.toString(digitize(number)));
    }

    public static int[] digitize(long n){
        String s = String.valueOf(n);
        String[] split = s.split("");
        int[] response = new int[split.length];
        var factor = 0;
        for(int i = split.length-1; i >= 0 ; i--){
            response[factor] = Integer.parseInt(split[i]);
            factor++;
        }

        return response;
    }
}
