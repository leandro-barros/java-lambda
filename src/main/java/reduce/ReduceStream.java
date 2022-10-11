package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// O reduce precisa ser associativo, ou seja, resolver em pequenos pedaços sempre irá dá o mesmo valor
public class ReduceStream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Optional<Integer>  reduce =  list.stream()
                                        .reduce((n1, n2) -> n1 + n2);

        System.out.println(reduce.get());
    }

}
