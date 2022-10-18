package lambidaFormas;

import java.util.stream.IntStream;

public class JavaLambda {

    public static void main(String[] args) {
        IntStream.range(0, 5)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        IntStream.range(0, 5)
                .filter((int n) -> n % 2 == 0)
                .reduce((int n1, int n2) -> n1 + n2)
                .ifPresent(System.out::println);

        Runnable runnable = () -> System.out.println("My Runnable");
    }

}
