public class RemoveChars {
    public static void main(String[] args) {
        var word = "eloquent";
        System.out.println(remove(word));
    }

    public static String remove(String str) {
       return str.substring(1, str.length()-1);
    }

}
