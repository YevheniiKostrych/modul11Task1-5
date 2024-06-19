package Task1;


import java.util.ArrayList;
import java.util.List;

class ValidatorTest {
    public static void main(String[] args) {
ValidatorOfList validatorOfList=new ValidatorOfList();
        List<String> input= new ArrayList<>();
        input.add("Ivan");
        input.add("Stepan");
        input.add("Peter");
        input.add("Alex");
        input.add("Sem");
        input.add("Max");
        String result=validatorOfList.toValidList(input);
        System.out.println(result);

    }
}