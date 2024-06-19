package Task2;

import java.util.List;
import java.util.stream.Collectors;

public class SortListToUperCase {

    public List<String> validatorSortListToUperCase(List<String> input) {
        return input.stream()
                .map(String::toUpperCase)
                .sorted((i1, i2) -> i2.compareTo(i1))
                .collect(Collectors.toList());

    }

}
