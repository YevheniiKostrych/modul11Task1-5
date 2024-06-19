package Task3;

public class ArrayToSortStringTest {
    public static void main(String[] args) {
        String[] numbers = {"1,2,0", "4,5"};

        ArrayToSortString arrayToSortString=new ArrayToSortString();
        System.out.println(arrayToSortString.toSortString(numbers));

    }
}

