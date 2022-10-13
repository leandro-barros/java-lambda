package collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Utilizados para objetos mutáveis
public class CollectStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        // Fornecedor - acumulação - combinação
        List<Object>  collect = list.stream()
                                    .collect(() -> new ArrayList<Object>(),
                                            (l, e) -> l.add(e),
                                            (l1, l2) -> l1.addAll(l2));

        System.out.println(collect);

    }

}
