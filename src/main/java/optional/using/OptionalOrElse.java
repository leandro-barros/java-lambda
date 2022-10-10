package optional.using;

import java.util.Optional;

public class OptionalOrElse {

    public static void main(String[] args) {
        String number = "1d";

        Integer numberConverting = convertNumber(number).orElse(2);

        System.out.println(numberConverting);

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
