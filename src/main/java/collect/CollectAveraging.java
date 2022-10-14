package collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Utilizados para objetos mutáveis
public class CollectAveraging {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Double averaging = list.stream()
                .collect(Collectors.averagingInt(n -> n.intValue()));

        System.out.println(averaging);

    }

}
