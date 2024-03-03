import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter lower bound: ");
        int lowerBound = scanner.nextInt();
        
        System.out.print("Enter upper bound: "); 
        int upperBound = scanner.nextInt();
        
        for(int i = lowerBound; i <= upperBound; i++) {
            System.out.println("\nMultiplication Table of " + i);
            
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j)); 
            }
        }
        
        scanner.close();
    }
}