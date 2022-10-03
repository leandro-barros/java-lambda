package lambda;

import java.util.Arrays;
import java.util.List;

public class JavaLambdaStream {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//        numbers.stream().forEach(i -> System.out.println(i));

        // Strem: Fluxo de dados
        numbers.stream()
                .skip(2)
                .filter(i -> i % 2 == 0)
                .forEach(e -> System.out.println(e));
    }


}
