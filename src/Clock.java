public class Clock {
    public static void main(String[] args) {
        var hour = 1;
        var minutes = 1;
        var seconds = 10;
        System.out.println(Past(hour,minutes,seconds));
    }

    public static int Past(int h, int m, int s){
        return ((h * 3600) + (m * 60) + s ) * 1000;
    }
}
