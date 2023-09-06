//import scanner from library
import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        //Create Scanner
        Scanner sc = new Scanner(System.in);
        //Prompt user to tell if the temp they wish to convert is F or C or K
        String Type = SysIn();
        //Ensure user enters valid prompt
        if (Type.equals("K")){
            //get temp for conversion
            System.out.println("Enter the Kelvin you wish to convert to F and C ");
            //set temp as a double
            double Kelvin = sc.nextDouble();
            //send to kelvin converter
            ConvertK(Kelvin);
        }
        else if (Type.equals("C")){
            //get temp for conversion
            System.out.println("Enter the Celsius you wish to convert to F and K ");
            //set temp as double
            double Celsius = sc.nextDouble();
            //send to celsius converter
            ConvertC(Celsius);
        }
        else if (Type.equals("F")){
            //get temp for conversion
            System.out.println("Enter the Fahrenheit you wish to convert to C and K ");
            // set temp as double
            double Fahrenheit = sc.nextDouble();
            // send to fahrenheit converter
            ConvertF(Fahrenheit);
        }
        else Type = SysIn();
    }
    public static String SysIn() {
        //create scanner
        Scanner scnr = new Scanner(System.in);
        //prompt user to tell if the temp they wish to convert is F or C or K
        System.out.println("Fahrenheit(F) Celsius(C) Kelvin(K)");
        System.out.println("What type of temperature would you like to convert? ");
        // create string to hold the input
        String Type = scnr.nextLine();
        // send input back to main
        return Type;
    }
    //kelvin converter
    public static void ConvertK(double Kelvin){
        // get the celsius from the kelvin
        double Celsius = Kelvin - 273.15;
        // create a fraction to convert temp
        double ConvertHelp = 9.0/5.0;
        // get fahrenheit from celsius and convert help
        double Fahrenheit = Celsius * ConvertHelp + 32;
        //print the results
        System.out.println("Fahrenheit = " + Fahrenheit);
        System.out.println("Celsius = " + Celsius);
        System.out.println("Kelvin = " + Kelvin);
    }
    //celsius converter
    public static void ConvertC(double Celsius){
        //get kelvin from celsius
        double Kelvin = Celsius + 273.15;
        //creat double to help with conversion
        double ConvertHelp = 9.0/5.0;
        // get fahrenheit from celsius and convert help
        double Fahrenheit = Celsius * ConvertHelp + 32;
        // print the results
        System.out.println("Fahrenheit = " + Fahrenheit);
        System.out.println("Celsius = " + Celsius);
        System.out.println("Kelvin = " + Kelvin);
    }
    //fahrenheit converter
    public static void ConvertF(double Fahrenheit){
        // create a fraction double to aid in conversion
        double ConvertHelp = 5.0/9.0;
        // get celsius from fahrenheit and convert help
        double Celsius = (Fahrenheit - 32) * ConvertHelp;
        // get kelvin from celsius
        double Kelvin = Celsius + 273.15;
        // print results
        System.out.println("Fahrenheit = " + Fahrenheit);
        System.out.println("Celsius = " + Celsius);
        System.out.println("Kelvin = " + Kelvin);
    }
}