import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 6};
        Arrays.sort(numbers);
        
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
