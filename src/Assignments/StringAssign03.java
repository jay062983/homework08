package Assignments;

import java.util.Scanner;

public class StringAssign03 {
    /* 3) Write a program that reads two people's first
    names and if they expecting boy or girl?Based on the input suggests a name for a baby:
Example Output: Mom’s first name? Mary Dad’s first name? Daniel
Boy or Girl? boy Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary, Dad’s first name? DanielBoy or Girl? girlSuggested baby name: MAIEL

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Mom's first name");
        String momfirstname = scan.next();
        System.out.println("Please Enter Dad's first name");
        String dadfirstname = scan.next();
        System.out.println("Please Answer Boy or Girl?");
        String babygender= scan.next();
        String confirmgender= "BOY";

        if (babygender.equalsIgnoreCase(confirmgender)) {
        System.out.println("Suggested baby name"+ "   "+dadfirstname.substring(0,3)+momfirstname.substring(2));
    }else{
            System.out.println("Suggested baby name"+ "   "+momfirstname.substring(0,2)+dadfirstname.substring(3));
        }


    }
}
