package streamcreate;

import java.util.Arrays;
import java.util.List;

public class StreamCreate {

    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        asList.stream().forEach(System.out::println);

        Integer[] array = new Integer[] {1, 2, 3};
        Arrays.stream(array).forEach(System.out::println);

    }

}
