import java.util.Scanner;
public class Summer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int i = 10;
        while (i != 0){
            System.out.println("Enter an integer to add ");
            int addMe = sc.nextInt();
            number = number + addMe;
            i = addMe;
        }
        System.out.println(number);
    }
}
