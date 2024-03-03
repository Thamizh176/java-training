import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int result = 0;
        
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }
        
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");  
        
        scanner.close();
    }
}