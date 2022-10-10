package optional.using;

import java.util.Optional;

public class OptionalIfPresent {

    public static void main(String[] args) {
        String number = "1";

        convertNumber(number).ifPresent(n -> System.out.println(n));;

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
