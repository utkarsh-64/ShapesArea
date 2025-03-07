//Circle.java
class Circle extends Shape{
    public Circle(double length){
        super(length, 0, 0, 0);
    }

    //Calling the methods frokm the abstract class of shape
    public double calculateArea(){
        return (Math.PI)*Math.pow(dim_one, 2);
    }

    public double calculatePerimeter(){
        return 2 *Math.PI*dim_one;
    }

    public double calculateVolume(){
        return 0;
    }
}
