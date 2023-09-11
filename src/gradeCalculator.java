//import Scanner from java
import java.util.Scanner;
public class gradeCalculator {
    public static void main(String[] args){
        //create Scanner as sc
        Scanner sc = new Scanner(System.in);
        //ask user for grade
        System.out.println("Please enter your grade: ");
        //set grade as an int value
        int grade;
        //get the user input
        grade = sc.nextInt();
        //send to letterGrade to convert int into a letter grade
        letterGrade(grade);
    }
    public static void letterGrade(int grade){
        // create string to store letter grade
        String letter;
        //check if grade is an A
        if (grade >= 92){
            letter = "A";
        }
        //Check if grade is an A-
        else if (grade >= 89){
            letter = "A-";
        }
        //Check if grade is a B+
        else if (grade >= 87){
            letter = "B+";
        }
        //Check if grade is a B
        else if (grade >= 82){
            letter = "B";
        }
        //Check if grade is a B-
        else if (grade >= 79){
            letter = "B-";
        }
        //Check if grade is a C+
        else if (grade >= 77){
            letter = "C+";
        }
        //Check if grade is a C
        else if (grade >= 72){
            letter = "C";
        }
        //Check if grade is a C-
        else if (grade >= 69) {
            letter = "C-";
        }
        //Check if grade is a D+
        else if (grade >= 67){
            letter = "D+";
        }
        //Check if grade is a D
        else if (grade >= 60){
            letter = "D";
        }
        //Check if grade is a F
        else if (grade >= 0) {
            letter = "F";
        }
        //set letter to something if the grade is not from 0 to 100+
        else letter = "impossible to calculate";
        //print results
        System.out.println("Your grade is " + letter + ".");
        }
    }

