package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceSumValueIdenty {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        Integer reduce =  list.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(reduce);
    }

}
