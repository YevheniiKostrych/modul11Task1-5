package Task2;

import Task1.ValidatorOfList;

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
        System.out.println(sortListToUperCase.validatorSortListToUperCase(input));

    }
}