package reduce;

import java.util.Arrays;
import java.util.List;

//  Função de combinação utilizados em stream paralelos
public class ReduceSumAndMapFunctionCombination {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        String reduce =  list.stream()
                .reduce("", (n1, n2) -> n1.toString().concat(n2.toString()), (n1, n2) -> n1.concat(n2));

        System.out.println(reduce);
    }

}
