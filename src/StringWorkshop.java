import java.util.Scanner;
public class StringWorkshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a starting of string:");
        String string = sc.nextLine();
        int choice = 0;
        while (choice != 7) {
            System.out.println("Current string: " + string);
            System.out.println();
            System.out.println("Pick an option:");
            System.out.println("1. Add content");
            System.out.println("2. check if string contains");
            System.out.println("3. Output length");
            System.out.println("4. Output substring after prefix");
            System.out.println("5. Output substring after suffix");
            System.out.println("6. Output substring between prefix and suffix");
            System.out.println("7. Exit ");
            System.out.println();
            choice = sc.nextInt();
            string = menuFilter(string, choice);
        }
    }
    public static String menuFilter(String string, int choice) {
        if (choice == 1) string = one(string);
        else if (choice == 2) two(string);
//        else if (choice == 3) three(string);
//        else if (choice == 4) four(string);
//        else if (choice == 5) five(string);
//        else if (choice == 6) six(string);
        return (string);
    }
    public static String one(String string) {
        Scanner sc = new Scanner(System.in);
        String addMe = sc.nextLine();
        string = string + addMe;
        System.out.println(string);
        return string;
    }
    public static void two(String string) {
        
    }
}
