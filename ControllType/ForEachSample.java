package ControllType;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachSample {
    public static void main(String[] args) {
        String[] numbers = { "one", "two", "three" };
        for (String number : numbers) {
            System.out.println(number);
        }

        ArrayList<String> numbers1 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String number : numbers1) {
            System.out.println(number);
        }
    }
}
