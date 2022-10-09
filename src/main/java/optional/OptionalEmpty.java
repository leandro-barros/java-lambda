package optional;

import java.util.Optional;

public class OptionalEmpty {

    public static void main(String[] args) {
        String number = "Converter string";
        Optional<Integer> numeroConverting = convertNumber(number);
        System.out.printf("Number: " + numeroConverting);
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
