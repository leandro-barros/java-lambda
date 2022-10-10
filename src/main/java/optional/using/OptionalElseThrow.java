package optional.using;

import java.util.Optional;

public class OptionalElseThrow {

    public static void main(String[] args) {
        String number = "1";

        Integer numberConverting = convertNumber(number).orElseThrow(() -> {throw new RuntimeException("dgf");});

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
