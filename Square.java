//Square.java
class Square extends Shape{
    public Square(double length){
        super(length, 0, 0, 4);
    }

    //Calling the methods frokm the abstract class of shape
    public double calculateArea(){
        return Math.pow(dim_one, 2);
    }

    public double calculatePerimeter(){
        return 4 *(dim_one);
    }

    public double calculateVolume(){
        return 0;
    }    
}
