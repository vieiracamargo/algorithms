public class CenturyFromYear {
    public static void main(String[] args) {
        var year = 2000   ;
        System.out.println(century(year));
    }

    public static int century(int number){
        double value = (double) number / 100;
        return (int)Math.ceil(value);
    }
}
