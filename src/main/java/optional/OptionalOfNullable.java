package optional;

import java.util.Optional;
// Usando em valores que podem retornar null.
public class OptionalOfNullable {

    public static void main(String[] args) {
        String number = "Converter string";
        Optional<Integer> numeroConverting = convertNumber(number);
        System.out.printf("Number: " + numeroConverting);
    }

    public static Optional<Integer> convertNumber(String value) {
        return Optional.ofNullable(null);
    }

}
