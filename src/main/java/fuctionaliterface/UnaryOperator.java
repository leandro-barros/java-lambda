package fuctionaliterface;

import java.util.Arrays;
import java.util.List;

// O UnaryOperator recebe um valor e retorna um valor do mesmo tipo
public class UnaryOperator {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        list.stream()
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);
    }

}
