//import scanner
import java.util.Scanner;
public class StringWorkshop {
    public static void main(String[] args) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        //ask for initial string
        System.out.println("Enter a starting of string:");
        //create string
        String string = sc.nextLine();
        //make an int
        int choice = 0;
        //create loop for project
        while (choice != 7) {
            //print surrent string and give options
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
            //get choice
            choice = sc.nextInt();
            //send to the filter
            string = menuFilter(string, choice);
        }
    }
    public static String menuFilter(String string, int choice) {
        if (choice == 1) string = one(string);
        else if (choice == 2) two(string);
        else if (choice == 3) three(string);
        else if (choice == 4) four(string);
        else if (choice == 5) five(string);
        else if (choice == 6) six(string);
        return (string);
    }
    public static String one(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        String addMe = sc.nextLine();
        string = string + addMe;
        System.out.println(string);
        return string;
    }
    public static void two(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Substring: ");
        String substring = sc.nextLine();
        System.out.println(string.contains(substring));
    }
    public static void three(String string) {
        int length = string.length();
        System.out.println(length);
    }
    public static void four(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Prefix: ");
        String prefix = sc.nextLine();
        int length = prefix.length();
        int preIndex = string.indexOf(prefix) + length;
        System.out.println(string.substring(preIndex));
    }
    public static void five(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Suffix: ");
        String suffix = sc.nextLine();
        int sufIndex = string.indexOf(suffix);
        System.out.println((string.substring(0, sufIndex)));
    }
    public static void six(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Prefix: ");
        String prefix = sc.nextLine();
        System.out.println("Suffix: ");
        String suffix = sc.nextLine();
        int length = prefix.length();
        int preIndex = string.indexOf(prefix) + length;
        int sufIndex = string.indexOf(suffix);
        System.out.println(string.substring(preIndex, sufIndex));
    }
}

