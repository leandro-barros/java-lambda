package fuctionaliterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FuctionInterfacePredicate {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Stream.generate(() -> new java.util.Random().nextInt())
                .filter(e -> e % 2 == 0) // Example de Predicate que retorna o resultado de alguma comparação sendo um boolean
                .forEach(e -> System.out.println(e));
    }

}
