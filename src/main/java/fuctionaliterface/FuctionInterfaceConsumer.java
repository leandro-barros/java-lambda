package fuctionaliterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FuctionInterfaceConsumer {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Stream.generate(() -> new java.util.Random().nextInt())
                .limit(5)
                .forEach(e -> System.out.println(e));
    }

}
