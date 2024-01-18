public class StringToNumber {
    public static void main(String[] args) {
        var number = "1234";
        System.out.println(stringToNumber(number));
    }

    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }
}
