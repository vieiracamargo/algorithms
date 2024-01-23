public class ExesAndOs {
    public static void main(String[] args) {
        var string = "ooxx";
        System.out.println(getXO(string));
    }

    public static boolean getXO(String str){
        int numberOfOs = str.toLowerCase().replace("x", "").length();
        int numberOfExes = str.toLowerCase().replace("o", "").length();
        return numberOfExes == numberOfOs;
    }
}
