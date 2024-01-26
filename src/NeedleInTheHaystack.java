public class NeedleInTheHaystack {
    public static void main(String[] args) {
        Object[] objects = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(objects));
    }

    public static String findNeedle(Object[] haystack){
        var response = "";
        for(int i = 0 ; i < haystack.length; i++){
            if("needle".equals(haystack[i])){
                response =  String.format("found the needle at position %d", i);
                break;
            }
        }
        return response;
    }
}
