package collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Utilizados para objetos mutáveis
public class CollectPartitioningBy {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> partitioning =  list.stream()
                .collect(Collectors.partitioningBy((n) -> n % 3 == 0));

        System.out.println(partitioning);
    }

}
