package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaLambdaStream {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 9);

//        numbers.stream().forEach(i -> System.out.println(i));

        // Strem: Fluxo de dados (Operações intermediárias)
        numbers.stream()
                .skip(2) // Operação intermediária
                .limit(3) // Operação intermediária
                .distinct() // Operação intermediária
                .map(e -> e * 2) // Operação intermediária
//                .filter(i -> i % 2 == 0)
                .forEach(e -> System.out.println(e)); // Operação final

        // Métodos com operações finais

        // Count
        long count = numbers.stream()
                .limit(3)
                .count();

        System.out.println("\n" + count);

        // Min
        Optional<Integer> min = numbers.stream()
                .filter(e -> e % 2 == 0)
                .min(Comparator.naturalOrder());

        System.out.println("\n" + min.get());

        // Max
        Optional<Integer> max = numbers.stream()
                .filter(e -> e % 2 == 0)
                .max(Comparator.naturalOrder());

        System.out.println("\n" + max.get());

        // ************** Collect **************

        List<Integer> newList = numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 3)
                .collect(Collectors.toList());

        System.out.println("\n" + newList);
    }



}
