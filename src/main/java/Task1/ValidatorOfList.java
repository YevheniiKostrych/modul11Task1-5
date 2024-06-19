package Task1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class ValidatorOfList {

    public String toValidList(List<String> input) {
        return IntStream.range(0, input.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + input.get(i))
                .collect(Collectors.joining(", "));

    }
}
