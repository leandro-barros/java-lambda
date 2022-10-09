package optional;

import java.util.Optional;

public class OptionalOf {

    public static void main(String[] args) {
        String number = "1";
        Optional<Integer> numeroConverting = convertNumber(number);
        System.out.printf("Number: " + numeroConverting);
    }

    public static Optional<Integer> convertNumber(String value) {
        Integer number = Integer.valueOf(value);
        return Optional.of(number);
    }
}
