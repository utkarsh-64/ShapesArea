//Rectangle.java
class Rectangle extends Shape{
    public Rectangle(double length, double width){
        super(length, width, 0, 4);
    }

    //Calling the methods frokm the abstract class of shape
    public double calculateArea(){
        return dim_one * dim_two;
    }

    public double calculatePerimeter(){
        return 2 *(dim_one + dim_two);
    }

    public double calculateVolume(){
        return 0;
    }
}
