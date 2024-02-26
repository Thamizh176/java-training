import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}
