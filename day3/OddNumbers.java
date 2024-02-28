public class OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount of odd numbers: " + count);
    }
}
