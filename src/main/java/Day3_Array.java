import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day3_Array {

    public static void main(String[] args) {

        String[] array = {"apple banana", "orange", "banana", "kiwi strawberry blueberry"};
        newArray(array);
    }

    public static void newArray(String[] array) {
        List<String> updatedArray = new ArrayList<>();
        List<String> words;
        for(String word : array) {
            words = Arrays.asList(word.split("\\s"));
            updatedArray.addAll(words);
        }
        System.out.println(updatedArray);
    }
}
