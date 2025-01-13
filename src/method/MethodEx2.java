package method;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage(3);
        printMessage(5);
        printMessage(7);
    }
    public static void printMessage(int n) {
        for (int i = 0;i < n;i++) {
            System.out.println("Hello, world!");
        }
    }
}
