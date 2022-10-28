package streamcreate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreate {

    public static void main(String[] args) {
        // List
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        asList.stream().forEach(System.out::println);

        // Array
        Integer[] array = new Integer[] {1, 2, 3};
        Arrays.stream(array).forEach(System.out::println);

        Stream.of("Value one", "Value two", "Value three")
                .forEach(System.out::println);

    }

}
