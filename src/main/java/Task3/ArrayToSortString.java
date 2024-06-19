package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ArrayToSortString {


    public String toSortString(String[] numbers) {
        return Arrays.stream(numbers)
                .flatMap(string -> Arrays.stream(string.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

    }
}
