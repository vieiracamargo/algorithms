public class FakeBinary {
    public static void main(String[] args) {
        String numbers = "012345";
        System.out.println(fakeBinary(numbers));
    }

    public static String fakeBinary(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]","1");
    }
}
