//import Scanner
import java.util.Scanner;
public class circleCalculation {
    public static void main(String[] args){
        //create Scanner as sc
        Scanner sc = new Scanner(System.in);
        // ask for the radius of the circle
        System.out.println("What is the radius of the circle you wish to calculate? ");
        //create variable radius as a double
        double radius;
        //set radius as the user input
        radius = sc.nextInt();
        // reconfirm the user input
        System.out.println("if the radius is " + radius + ".");
        //calculate diameter
        diameterCalculator(radius);
        //calculate circumference
        circumferenceCalculator(radius);
        //calculate area
        areaCalculator(radius);
    }
    public static void diameterCalculator(double radius){
        //set diameter as a double
        double diameter;
        //calculate diameter
        diameter = radius * 2;
        //print results
        System.out.println("The diameter is " + diameter + ".");
    }
    public static void circumferenceCalculator(double radius){
        //set circumference as a double
        double circumference;
        //calculate circumference
        circumference = 2 * Math.PI * radius;
        //print results
        System.out.println("The circumference is " + circumference + ".");
    }
    public static void areaCalculator(double radius){
        // set area as a double
        double area;
        //calculate the area
        area = (radius * radius) * Math.PI;
        //print results
        System.out.println("The area is " + area + ".");
    }
}
