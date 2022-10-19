package methodreference;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {

        List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);

        asList.stream()
                .forEach(System.out::println);

        System.out.println("\n");

        asList.stream()
                .map(MethodReference::multplicForTwo) // Method reference with static
                .forEach(System.out::println);
        System.out.println("\n- constructors");

        asList.stream()
                .map(BigDecimal::new) // Method reference with constructors
                .forEach(System.out::println);
    }

    public static Integer multplicForTwo(Integer i) {
        return i * 2;
    }

}
