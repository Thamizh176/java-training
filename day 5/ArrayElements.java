import java.util.Scanner;

public class ArrayElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size]; 
        
        System.out.println("Enter " + size + " array elements:");
        for(int i=0; i<size; i++) {
            array[i] = scanner.nextInt(); 
        }
        
        System.out.print("The array elements are: ");
        for(int element : array) {
            System.out.print(element + " "); 
        }
        
        scanner.close();
    }
}