package methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);

        asList.stream()
                .forEach(System.out::println);

    }

}
