import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();  

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
    
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        boolean status = true;

        if (str1.length() != str2.length()) {
            status = false;
        } else {
            char[] s1 = str1.toLowerCase().toCharArray();
            char[] s2 = str2.toLowerCase().toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            status = Arrays.equals(s1, s2); 
        }

        if (status) {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
        scanner.close(); 
    }
}