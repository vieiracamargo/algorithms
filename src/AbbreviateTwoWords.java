import java.util.Arrays;
import java.util.stream.Collectors;

public class AbbreviateTwoWords {
    public static void main(String[] args) {
        String name = "Sam Harris";
        System.out.println(abbrevName(name));
    }

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return Arrays.stream(names)
                .map(n -> n.substring(0, 1).toUpperCase())
                .collect(Collectors.joining("."));
    }
}
