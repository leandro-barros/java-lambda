package collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Utilizados para objetos mutáveis
public class CollectGrouppingBy {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Map<Integer, List<Integer>> groupBy =  list.stream()
                .collect(Collectors.groupingBy((n) -> n % 3));

        System.out.println(groupBy);
    }

}
