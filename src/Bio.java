public class Bio {
    public static void main(String[] args) {
        System.out.println(dnaToRna("GCAT"));
    }

    public static String dnaToRna(String dna){
        return dna.replace("T", "U");
    }
}
