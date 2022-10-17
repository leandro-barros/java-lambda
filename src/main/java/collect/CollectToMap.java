package collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Utilizados para objetos mutáveis
public class CollectToMap {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Map<Integer, Integer> toMap =  list.stream()
                .collect(Collectors.toMap(n -> n, n -> n * 2));

        System.out.println(toMap);
    }

}
