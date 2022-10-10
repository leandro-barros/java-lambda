package optional.using;

import java.util.Optional;

public class OptionalOrElse {

    public static void main(String[] args) {
        String number = "1";

        // só retorna o 2 caso colocasse uma string para converter.
        Integer numberConverting = convertNumber(number).orElse(2);

        // só retorna o 5 caso colocasse uma string para converter.
        Integer number2 = convertNumber(number).orElseGet(() -> 5);

        System.out.println(numberConverting);
        System.out.println(number2);
    }

    public static Optional<Integer> convertNumber(String value) {
        try {
            Integer number = Integer.valueOf(value);
            return Optional.of(number);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

}
