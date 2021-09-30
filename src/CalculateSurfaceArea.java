/**
 * @author nidhi
 * Assessment: Exercise 02 
 * Student Name: Nidhi Patel
 * Due Date: Oct 1 2021
 * Description: Program to calculate surface area of silos
 * Professor Name: Mel Sanschagrin
 */


public class CalculateSurfaceArea {

  // Declare required property for class
  private double diameter;
  private double height;
  private double area;
  private double radius;

  // Method to get value of diameter
  public double getDiameter() {
    return diameter;
  }

  // Method to set value of diameter
  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  // Method to get value of height
  public double getHeight() {
    return height;
  }

  // Method to set value of height
  public void setHeight(double height) {
    this.height = height;
  }

  // Method to calculate printable surface area of silos
  public double calculateArea() {
    //Calculate radius from diameter
    radius = diameter / 2;
    // Calculate area of silos using giver equation
    // Use Math class to get PI value and square of number
    area = (Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height);
    // Return rounded value of area
    return Math.ceil(area);
  }
}
