import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        var word = "Robin Singh";
        System.out.println(Arrays.toString(stringToArray(word)));
    }

    public static String[] stringToArray(String s) {
        return s.split(" ");
    }
}
