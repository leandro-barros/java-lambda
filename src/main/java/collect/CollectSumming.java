package collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Utilizados para objetos mutáveis
public class CollectSumming {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Integer summing = list.stream()
                .collect(Collectors.summingInt(n -> n.intValue()));

        System.out.println(summing);

    }

}
