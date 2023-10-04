import java.util.Scanner;
public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[100];
        System.out.println("Enter values (-1 to stop)");
        int a = -1;
        for (int i = 0; i < 100; i++) {
            System.out.print(": ");
            int addMe = sc.nextInt();
            if (addMe == -1) {
                break;
            }
            intArray[i] = addMe;
            a++;
        }
        System.out.println("Your values, reversed:");
        for (int i = a; i >= 0; i--) {
            System.out.println(intArray[i]);
        }
    }
}
