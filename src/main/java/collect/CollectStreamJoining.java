package collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Utilizados para objetos mutáveis
public class CollectStreamJoining {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6);

        String collect = list.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining(";"));// Diferente do joining do reduce ele utiliza o StringBuider que é mais performatico

        System.out.println(collect);

    }

}
