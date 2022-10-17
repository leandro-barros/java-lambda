package collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Utilizados para objetos mutáveis
public class CollectCouting {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Long count = list.stream()
                .filter((e) -> e % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(count);

    }

}