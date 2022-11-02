package streamcreate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {

    public static void main(String[] args) throws Exception {
        // List
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);
        asList.stream().forEach(System.out::println);

        // Array
        Integer[] array = new Integer[] {1, 2, 3};
        Arrays.stream(array).forEach(System.out::println);


        // Stream.of()
        Stream.of("Value one", "Value two", "Value three")
                .forEach(System.out::println);

        // IntStream.range()
        IntStream.range(0, 5)
                .forEach(System.out::println);

        System.out.println("\n");

        // Stream.interate
        Stream.iterate(5, n -> n * 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("\n");
        // Files
        Path path = Paths.get("");
        Files.list(path).forEach(System.out::println);

        System.out.println("\n");
        // BufferedReader - lines
        File file = new File("");
        FileReader fileReader = new FileReader(file);
        try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            bufferedReader.lines().forEach(System.out::println);
        }

    }

}
