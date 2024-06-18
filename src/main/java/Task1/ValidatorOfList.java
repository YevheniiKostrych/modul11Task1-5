package Task1;
import java.util.List;

public class ValidatorOfList {
    private List<String> input;
    public String toValidList(List<String> input) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.size(); i += 2) {

            result.append((i + 1)).append(". ").
                    append(input.get(i)).append(",");
            if (i != input.size() - 1 || i != input.size() - 2) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
