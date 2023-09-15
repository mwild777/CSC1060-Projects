// import scanner
import java.util.Scanner;
public class bottlesOfBeer {
    public static void main(String[] args){
        //make new scanner
        Scanner sc = new Scanner(System.in);
        // ask for # of bottles
        System.out.println("Enter the number of bottles to start with: ");
        //create int for number of bottles and store it
        int bottleNumber = sc.nextInt();
        // create for loop
        for (int i = bottleNumber; i >= 0; i --) {
            //int for second line of rhyme
            int s = i - 1;
            // end if check
            if (i == 0) {
                // print end statement
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Go to the store and buy some more, " + bottleNumber + " bottles of beer on the wall.");
            }
            // 1 bottle if check
            else if (i == 1) {
                // change grammar so it is not plural for one bottle
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
                System.out.println("Take one down and pass it around, " + s + " bottles of beer on the wall.");
            }
            // every loop before 1
            else {
                // main print for song.
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + s + " bottles of beer on the wall.");
            }
        }
    }
}
