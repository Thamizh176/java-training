public class PrintASCII {
    public static void main(String[] args) {
        System.out.println("ASCII values from A to Z:");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + ": " + (int) c);
        }
    }
}
