public class KeepHydrated {
    public static void main(String[] args) {
        System.out.println(liters(11.8));
    }

    public static int liters(double time)  {
        double waterPerHoursInLitters = 0.5;
        return (int) (time * waterPerHoursInLitters);
    }
}
