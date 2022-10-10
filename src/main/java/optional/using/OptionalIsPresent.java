package optional.using;

import java.util.Optional;

public class OptionalIsPresent {

    public static void main(String[] args) {
        String number = "1";
        String number2 = "Teste";

        Optional<Integer> numeroConverting = convertNumber(number);
        Optional<Integer> numeroConverting2 = convertNumber(number2);


        System.out.println("Number: " + numeroConverting.isPresent());
        System.out.printf("Number 2: " + numeroConverting2.isPresent());
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
