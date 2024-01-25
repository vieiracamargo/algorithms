import java.util.stream.Collectors;

public class ComplementaryDna {
    public static void main(String[] args) {
        var value = "ATTGC";
        System.out.println(makeComplement(value));
    }
    public static String makeComplement(String dna){
        int length = dna.length();
        var response = "";
        for(int i = 0; i < length; i++){
            if(dna.charAt(i) == 'A') response +=  "T";
            if(dna.charAt(i) == 'T') response +=  "A";
            if(dna.charAt(i) == 'C') response +=  "G";
            if(dna.charAt(i) == 'G') response +=  "C";
        }

        return response;
    }
}
