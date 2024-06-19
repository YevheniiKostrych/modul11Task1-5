package Task2;

import java.util.ArrayList;
import java.util.List;

public class SortListToUperCaseTest {
    public static void main(String[] args) {
        SortListToUperCase sortListToUperCase = new SortListToUperCase();
        List<String> input = new ArrayList<>();
        input.add("Ivan");
        input.add("Stepan");
        input.add("Peter");
        input.add("Alex");
        input.add("Sem");
        input.add("Max");
        List<String> result = sortListToUperCase.validatorSortListToUperCase(input);
        System.out.println(result);

    }
}