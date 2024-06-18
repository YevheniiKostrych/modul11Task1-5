package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListToUperCase {

    public List<String> validatorSortListToUperCase(List<String>input){
        List<String> upperCaseStrings = new ArrayList<>();
for (String string: input)
    upperCaseStrings.add(string.toUpperCase());
        Collections.sort(upperCaseStrings,Collections.reverseOrder());
        return upperCaseStrings;
    }

}
