public class EvenNumbers {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Even Numbers:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nCount of even numbers: " + count);
    }
}
