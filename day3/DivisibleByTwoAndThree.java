public class DivisibleByTwoAndThree {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 100 divisible by both 2 and 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
