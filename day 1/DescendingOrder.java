import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 6};
        Arrays.sort(numbers, Collections.reverseOrder());
        
        System.out.println("Numbers in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
