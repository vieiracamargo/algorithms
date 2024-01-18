import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountingSheep {
    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        System.out.println(countSheeps(array1));


    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                .filter(sheep -> sheep != null && sheep)
                .count();
    }
}
