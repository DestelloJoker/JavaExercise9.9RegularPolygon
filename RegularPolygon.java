/*Program Name:RegularPolygon.java
 * Authors: Austin P
 * Date last Updated: 8/22/2024
 * Purpose: This program is meant to create a regular polygon with a given number of sides and a given length of sides.
 * Then use the methods to find the perimeter and area of the regular polygon.
 */
// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class RegularPolygon {

  private int n = 3;

  private double side = 1;  
  private double x = 0;
  private double y = 0;

  //No-arg constructor
  public RegularPolygon() {
  }

  //Constructor that creates a regular polygon with the specified number of sides and length of side
  public RegularPolygon(int n, double side){
    this.n = n;
    this.side = side;
  }

  //A constructor that creates a regular polygon with the specified number of sides, length of side, and x and y coordinates
  public RegularPolygon(int n, double side, double x, double y){
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
  }
 
  //accessor methods for all data fields
  public int getN() {
    return n;
  }
  public double getSide() {
    return side;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  
  //mutator methods for all data fields
  public void setN(int n) {
    this.n = n;
  }
  public void setSide(double side) {
    this.side = side;
  }
  public void setX(double x) {
    this.x = x;
  }
  public void setY(double y) {
    this.y = y;
  }

  //The method getPerimeter() returns the perimeter of the regular polygon  
  public double getPerimeter(){
    return n * side;
  }

  //The method getArea() returns the area of the regular polygon
  public double getArea() {
    return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
  }
  
  
  public static void main(String[] args) {
    
    RegularPolygon polygon1 = new RegularPolygon();
    RegularPolygon polygon2 = new RegularPolygon(6, 4);
    RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

    System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
    System.out.println("Polygon 1 area: " + polygon1.getArea());
    System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter());
    System.out.println("Polygon 2 area: " + polygon2.getArea());
    System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter());
    System.out.println("Polygon 3 area: " + polygon3.getArea());

    //System.out.println("Hello world!");
  }


}