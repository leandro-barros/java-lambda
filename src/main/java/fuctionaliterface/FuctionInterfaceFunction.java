package fuctionaliterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// É a mais genérica de todas, recebe um valor e retorna este valor
public class FuctionInterfaceFunction {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Stream.generate(() -> new java.util.Random().nextInt())
                .filter(e -> e % 2 == 0)
                .map(e -> e.doubleValue()) // Map é um exemplo de Function
                .forEach(e -> System.out.println(e));
    }

}
