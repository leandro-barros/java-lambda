package reduce;

import java.util.stream.DoubleStream;

public class ReduceMinIdentyValue {

    public static void main(String[] args) {

        double smallValue = DoubleStream.of(1.5, 2.9, 6.7)
                .reduce(Double.POSITIVE_INFINITY, (d1, d2) -> Math.min(d1, d2));

        System.out.println(smallValue);

    }

}
