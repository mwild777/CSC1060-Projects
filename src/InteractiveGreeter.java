import java.util.Scanner;
public class InteractiveGreeter {
    public static void main(String[] args) {
        //Create Scanner
        Scanner sc = new Scanner(System.in);
        //ask for name
        System.out.println("What is your name? ");
        //save name
        String name = sc.nextLine();
        //ask where they are from
        System.out.println("Where are you from? ");
        //save where they are from
        String from = sc.nextLine();
        //ask for age
        System.out.println("How old are you (years)? ");
        //save age
        String age = sc.nextLine();
        //give back information
        System.out.println("Hello " + name + " from " + from + ". You are " + age + " years old.");
        //ask for hobby
        System.out.println("Whats something you like to do? ");
        //save hobby
        String hobby = sc.nextLine();
        //give back hobby
        System.out.println("Have fun next time you " + hobby + "! ");
        //ask for donation amount
        System.out.println("How much would you like to donate today? ");
        //save donation
        String money = sc.nextLine();
        //give back receipt. 
        System.out.println("You will donate $" + money + " today. Yay!");
    }
}
