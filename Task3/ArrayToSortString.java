package Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayToSortString {
    String[] numbers = {"1,2,0", "4,5"};

    public String toSortString() {

        StringBuilder stringBuilder = new StringBuilder();
        for (String str : numbers) {
            stringBuilder.append(str);
        }
        Pattern pattern=Pattern.compile("(\\d)");
        Matcher matcher=pattern.matcher(stringBuilder);
        List<String> ints = new ArrayList<>();
        while (matcher.find()){
            ints.add(matcher.group(1));
        }
        Collections.sort(ints, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        return String.join(", ", ints);
    }


}
