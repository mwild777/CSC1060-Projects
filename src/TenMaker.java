import java.util.Scanner;
public class TenMaker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you first integer ");
        int first = sc.nextInt();
        System.out.println("Enter you second integer ");
        int second = sc.nextInt();
        boolean result = makes10(first, second);
        if (result == true) {
            System.out.println("The numbers equal ten. ");
        }
        else {
            System.out.println("The numbers do not equal ten. ");
        }
    }
    public static boolean makes10(int first, int second) {
        int ten = first + second;
        if (ten == 10) {
            return true;
        }
        return false;
    }
}
