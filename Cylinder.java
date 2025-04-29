//Cylinder.java
class Cylinder extends Shape{
    public Cylinder(double radius, double height){
        super(radius, 0, height, 3);
    }

    //Calling the methods frokm the abstract class of shape
    public double calculateArea(){
        return 2*(Math.PI)*dim_one*(dim_one + dim_three);
    }

    public double calculatePerimeter(){
        return 2 * (dim_one + dim_three);
    }

    public double calculateVolume(){
        return (Math.PI)*Math.pow(dim_one, 2)*dim_three;
    }
}
