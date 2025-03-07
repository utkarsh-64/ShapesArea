//Shape.java
abstract class Shape{
    protected double dim_one, dim_two, dim_three;
    int num_of_sides;
    
    //Zero parameter constructor, if the vaues by the user are not given, to pass the edge cases
    public Shape(){
        dim_one = dim_two = dim_three = 0;
        num_of_sides = 0;
    }

    //Parameterized constructor, to assign the values to the variables given by the user
    public Shape(double dim_one, double dim_two, double dim_three, int num_of_sides){
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.dim_three = dim_three;
        this.num_of_sides = num_of_sides;
    }

    abstract double calculateArea();    //Abstract method to calculte the area
    abstract double calculatePerimeter(); //Abstract method to calculate the perimeter
    abstract double calculateVolume(); //Abstract method to calculate the volume

    public int getNumSides(){
        return num_of_sides;
    }
}
