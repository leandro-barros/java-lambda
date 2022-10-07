package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class JavaLambdaStream {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 5 , 8, 2, 9, 4, 1, 6, 6, 7, 9, 9);

        numbers.stream().forEach(i -> System.out.print(i));

        System.out.println("\n\n");

        // Strem: Fluxo de dados (Operações intermediárias)
        numbers.stream()
                .skip(2) // Operação intermediária
                .limit(3) // Operação intermediária
                .distinct() // Operação intermediária
                .map(e -> e * 2) // Operação intermediária
//                .filter(i -> i % 2 == 0)
                .forEach(e -> System.out.println(e)); // Operação final

        // -------------------- Métodos com operações finais --------------------

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

        System.out.println("\n" + newList + "\n");

        Map<Boolean, List<Integer>> group = numbers.stream()
                .collect(Collectors.groupingBy(e -> e % 2 == 0));

        System.out.println("Agrupamento por números pares e ímpars: " + group);

        Map<Integer, List<Integer>> groupDivisionBy3 = numbers.stream()
                .collect(Collectors.groupingBy(e -> e % 3));

        System.out.print("\nAgrupamento pelo resto divisão por 3: " + groupDivisionBy3);

        String join = numbers.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining(";"));

        System.out.print("\n\nString concatenada: " + join);

    }



}
