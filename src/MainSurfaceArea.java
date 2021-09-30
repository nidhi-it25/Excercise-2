/**
 * @author nidhi
 * Assessment: Exercise 02 
 * Student Name: Nidhi Patel
 * Due Date: Oct 1 2021
 * Description: Program to calculate surface area of silos
 * Professor Name: Mel Sanschagrin
 */


import java.util.Scanner;

public class MainSurfaceArea {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Create object of CalculateSurfaceArea class
    CalculateSurfaceArea silos1 = new CalculateSurfaceArea();

    //Create object of Scanner class to get user input
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter height: ");
    // Assign value of height to silos1 object
    silos1.setHeight(sc.nextDouble());
    System.out.println("Enter diameter:");
    // Assign value of diameter to silos1 object
    silos1.setDiameter(sc.nextDouble());

    // Print printable surface area of silos
    System.out.println("Surface Area is:" + silos1.calculateArea());
    System.out.println("Program by Nidhi Apurvakumar Patel");
  }
}
