import java.util.Scanner;
public class TempConverter {
    public static void main(String[] args) {
        //Create Scanner
        Scanner sc = new Scanner(System.in);
        //Prompt user to tell if the temp they wish to convert is F or C or K
        String Type = SysIn();
        //Ensure user enters valid prompt
        if (Type.equals("K")){
            System.out.println("Enter the Kelvin you wish to convert to F and C ");
            double Kelvin = sc.nextDouble();
            ConvertK(Kelvin);
        }
        else if (Type.equals("C")){
            System.out.println("Enter the Celsius you wish to convert to F and K ");
            double Celsius = sc.nextDouble();
            ConvertC(Celsius);
        }
        else if (Type.equals("F")){
            System.out.println("Enter the Fahrenheit you wish to convert to C and K ");
            double Fahrenheit = sc.nextDouble();
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
        String Type = scnr.nextLine();
        return Type;
    }
    public static void ConvertK(double Kelvin){
        double Celsius = Kelvin - 273.15;
        double ConvertHelp = 9.0/5.0;
        double Fahrenheit = Celsius * ConvertHelp + 32;
        System.out.println("Fahrenheit = " + Fahrenheit);
        System.out.println("Celsius = " + Celsius);
        System.out.println("Kelvin = " + Kelvin);
    }
    public static void ConvertC(double Celsius){
        double Kelvin = Celsius + 273.15;
        double ConvertHelp = 9.0/5.0;
        double Fahrenheit = Celsius * ConvertHelp + 32;
        System.out.println("Fahrenheit = " + Fahrenheit);
        System.out.println("Celsius = " + Celsius);
        System.out.println("Kelvin = " + Kelvin);
    }
    public static void ConvertF(double Fahrenheit){
        double ConvertHelp = 5.0/9.0;
        double Celsius = (Fahrenheit - 32) * ConvertHelp;
        double Kelvin = Celsius + 273.15;
        System.out.println("Fahrenheit = " + Fahrenheit);
        System.out.println("Celsius = " + Celsius);
        System.out.println("Kelvin = " + Kelvin);
    }
}