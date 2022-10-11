package reduce;

import java.util.Arrays;
import java.util.List;

public class ReduceConcatValueIdenty {

    public static void main(String[] args) {
        String s = "Criando uma lista de string";
        String[] split = s.split(" ");
        List<String> listString = Arrays.asList(split);
        
        String concat = listString.stream()
                    .reduce("", (s1, s2) -> s1.concat(s2));

        System.out.println(concat);

    }

}
