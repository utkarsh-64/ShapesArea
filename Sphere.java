//Sphere.java
class Sphere extends Shape{
    public Sphere(double radius){
        super(radius, 0, 0, 0);
    }

    //Calling the methods frokm the abstract class of shape
    public double calculateArea(){
        return 4*(Math.PI)*Math.pow(dim_one, 2);
    }

    public double calculatePerimeter(){
        return 0;
    }

    public double calculateVolume(){
        return (4/3)*(Math.PI)*Math.pow(dim_one, 3);
    }
}
