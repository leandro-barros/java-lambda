package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// O reduce é usado sempre quando se tem um monte elemento transformado em uma coisa só
public class ReduceConcat {

    public static void main(String[] args) {
        String s = "Criando uma lista de string";
        String[] split = s.split(" ");
        List<String> listString = Arrays.asList(split);
        
        Optional<String> concat = listString.stream()
                .reduce((s1, s2) -> s1.concat(s2));

        System.out.println(concat.get());
    }

}
