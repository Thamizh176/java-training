import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = scanner.nextLong();
        int digitCount = String.valueOf(num).length();
        System.out.println("Number of digits: " + digitCount);
        scanner.close();
    }
}
