package fuctionaliterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FuctionInterfaceSupplier {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Stream.generate(() -> new java.util.Random().nextInt())
                .forEach(System.out::println); // O ForEach é um examplo de Consumer que recebe um valor e faz algo e não retorna nada
                                                // Tem tbm o BigConsumer que recebe dois valor e faz algo com eles
    }

}
