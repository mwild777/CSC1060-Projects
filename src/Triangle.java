// import Scanner
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        // create new Scanner
        Scanner sc = new Scanner(System.in);
        // create boolean as false
        boolean check = false;
        // create int for size
        int outerSize = 51;
        // initialize while loop
        while (!check) {
            //create int size
            int size = 51;
            // ask for size
            System.out.println("Enter size");
            // set variable size
            size = sc.nextInt();
            // create if loop to check size
            if (size > 0 && size <= 50){
                //change boolean if size is a valid input
                check = true;
                // set outer size to match inner size
                outerSize = size;
            }
        }
        // ask for fill digit
        System.out.println("Enter fill: ");
        // set fill as the fill digit
        char fill = sc.next().charAt(0);
        // for loop to make triangle
        for (int i = 1; i<= outerSize; i++) {
            // for loop for spaces before the top of triangle
            for (int w = outerSize; w > i; w --){
                System.out.print(" ");
            }
            // for loop for fill in triangle
            for (int u = 1; u <= i; u++) {
                System.out.print(" " + fill);
            }
            // next line of triangle
            System.out.println();
        }
    }
}
