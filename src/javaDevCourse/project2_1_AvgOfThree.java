
package javaDevCourse;
import java.util.*;
public class project2_1_AvgOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double average;
        System.out.println("Please enter the three numbers");
        num1=keyboard.nextDouble();
        num2= keyboard.nextDouble();
        num3 = keyboard.nextDouble();
        keyboard.nextLine();
        average =(num1+num2+num3)/3.0;
        System.out.println(average);
    }
}
