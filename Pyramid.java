// Pyramid.java
class Pyramid extends Shape{
    public Pyramid(double length, double height){
        super(length,0, height, 6);
    }

    //Calling the methods frokm the abstract class of shape
    public double calculateArea(){
        return (Math.sqrt(3)/4)*Math.pow(dim_one, 2);
    }

    public double calculatePerimeter(){
        return 0;
    }

    public double calculateVolume(){
        return (Math.sqrt(3)/4)*Math.pow(dim_one, 2)*dim_three;
    }
}
