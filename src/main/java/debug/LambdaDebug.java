package debug;

import java.util.Arrays;
import java.util.List;

public class LambdaDebug {

    public static void main(String[] args) {
        List<Integer> asList = Arrays.asList(1, 2, 5, 8, 9);

        asList.stream()
                .map(n -> new StringBuilder().append(n).append("s").append("a"))
                .forEach(System.out::println);

        System.out.println("\nDebug por bloco");

        asList.stream()
                .map(n -> {
                     StringBuilder builder = new StringBuilder();
                     builder.append(n);
                     builder.append("s");
                     builder.append("a");
                     return builder;
                })
                .forEach(System.out::println);

    }

}
