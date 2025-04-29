//Main.java
//Name: Utkarsh Lakhani
//PRN: 23070126064
//Branch: AIML-A3

import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    //Taking the length and width from the user and parsing it in double
        System.out.println("Enter the length for rectangle: ");
        double length = Double.parseDouble(scan.nextLine());

        System.out.println("Enter the width for rectangle: ");
        double width = Double.parseDouble(scan.nextLine());

        Shape rectangle = new Rectangle(length, width);

        System.out.println("\nArea of rectangle is: "+rectangle.calculateArea());
        System.out.println("Perimeter of rectangle is: "+rectangle.calculatePerimeter());

        System.out.println("\nEnter the height of Pyramid:");
        double height = Double.parseDouble(scan.nextLine());

        Shape pyramid = new Pyramid(length, height);

        System.out.println("\nVolume of the Pyramid: "+pyramid.calculateVolume());
        System.out.println("Area of the Pyramid: "+pyramid.calculateArea());


        System.out.println("\nEnter the radius of the circle: ");
        double radius = Double.parseDouble(scan.nextLine());

        Shape circle = new Circle(radius);

        System.out.println("\nArea of circle is: "+circle.calculateArea());
        System.out.println("Perimeter of circle is: "+circle.calculatePerimeter());

        Shape sphere = new Sphere(radius);

        System.out.println("\nArea of sphere is: "+sphere.calculateArea());
        System.out.println("Volume of sphere is: "+sphere.calculateVolume());

        System.out.println("\nEnter the height of cylinder:");
        double height_cylinder = Double.parseDouble(scan.nextLine());

        Shape cylinder = new Cylinder(radius, height_cylinder);

        System.out.println("\nArea of the cylinder: "+cylinder.calculateArea());
        System.out.println("Perimeter of the cylinder: "+cylinder.calculatePerimeter());
        System.out.println("Volume of the cylinder: "+cylinder.calculateVolume());

        System.out.println("\nEnter the length of side of Square : ");
        double side = Double.parseDouble(scan.nextLine());

        Shape square = new Square(side);
        System.out.println("\nArea of square is: "+square.calculateArea());
        System.out.println("Perimeter of square is: "+square.calculatePerimeter());
    }
}
