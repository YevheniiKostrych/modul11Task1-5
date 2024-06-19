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



//        StringBuilder stringBuilder = new StringBuilder();
//        for (String str : numbers) {
//            stringBuilder.append(str);
//        }
//        Pattern pattern = Pattern.compile("(\\d)");
//        Matcher matcher = pattern.matcher(stringBuilder);
//        List<String> ints = new ArrayList<>();
//        while (matcher.find()) {
//            ints.add(matcher.group(1));
//        }
//        return ints.stream().sorted().collect(Collectors.joining(","));

    }
}
