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
            //print current string and give options
            System.out.println("Current string: " + string);
            System.out.println();
            System.out.println("Pick an option:");
            System.out.println("1. Add content");
            System.out.println("2. check if string contains");
            System.out.println("3. Output length");
            System.out.println("4. Output substring after prefix");
            System.out.println("5. Output substring before suffix");
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
        //send to correct choice
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
        //store string
        String addMe = sc.nextLine();
        //add strings
        string = string + addMe;
        //print new string
        System.out.println(string);
        //return final string
        return string;
    }
    public static void two(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        //ask for substring
        System.out.println("Substring: ");
        //store substring
        String substring = sc.nextLine();
        //print if substring exists in string
        System.out.println(string.contains(substring));
    }
    public static void three(String string) {
        //create int length
        int length = string.length();
        //print length
        System.out.println(length);
    }
    public static void four(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        //ask for prefix
        System.out.println("Prefix: ");
        //store prefix
        String prefix = sc.nextLine();
        //measure prefix
        int length = prefix.length();
        //find where to start printing
        int preIndex = string.indexOf(prefix) + length;
        //print
        System.out.println(string.substring(preIndex));
    }
    public static void five(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        //ask for suffix
        System.out.println("Suffix: ");
        //store suffix
        String suffix = sc.nextLine();
        //find where the suffix starts
        int sufIndex = string.indexOf(suffix);
        //print from the start of the string to the suffix
        System.out.println((string.substring(0, sufIndex)));
    }
    public static void six(String string) {
        //make scanner
        Scanner sc = new Scanner(System.in);
        //ask for prefix
        System.out.println("Prefix: ");
        //store prefix
        String prefix = sc.nextLine();
        //ask for suffix
        System.out.println("Suffix: ");
        //store suffix
        String suffix = sc.nextLine();
        //get the length of the prefix
        int length = prefix.length();
        //find the end of the prefix
        int preIndex = string.indexOf(prefix) + length;
        //find the start of the suffix
        int sufIndex = string.indexOf(suffix);
        //print from the end of the prefix to the start of the suffix
        System.out.println(string.substring(preIndex, sufIndex));
    }
}

