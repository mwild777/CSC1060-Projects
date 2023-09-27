import java.util.Scanner;
public class BeverageSelector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What beverage would you like? ");
        System.out.println("(1) Water; (2) Coke; (3)Coffee");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Enjoy your water!");
        }
        else if (choice == 2) {
            System.out.println("Enjoy your Coke!");
        }
        else if (choice == 3) {
            System.out.println("Enjoy your coffee!");
        }
        else {
            System.out.println("Invalid input, please try again!");
        }
    }
}
