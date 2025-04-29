# 📖 Shape Calculation Project

## 📌 Project Description
This Java project implements a **Shape Calculation System** using Object-Oriented Programming (OOP). The system allows users to:

- **Select Different Shapes** - Circle, Rectangle, Square, Sphere, Cylinder, and Equilateral Pyramid.
- **Calculate Area** - Computes the area of the selected shape.
- **Calculate Perimeter** - Computes the perimeter (or circumference) of 2D shapes.
- **Calculate Volume** - Computes the volume for 3D shapes.
- **Modular Implementation** - Uses an abstract class for Shape and an interface for Volume to ensure modular design.

This project follows proper coding guidelines, includes detailed comments, and ensures a structured approach to OOP principles.

## 📂 Project Structure
```
ShapeCalculation/
│── Main.java          # Entry point of the program
│── Shape.java         # Abstract class for common shape properties
│── Volume.java        # Interface for volume calculation
│── Circle.java        # Implements shape for Circle
│── Rectangle.java     # Implements shape for Rectangle
│── Square.java        # Implements shape for Square
│── Sphere.java        # Implements shape & volume for Sphere
│── Cylinder.java      # Implements shape & volume for Cylinder
│── EquilateralPyramid.java # Implements shape & volume for Pyramid
│── README.md          # Project documentation and instructions
```

## ⚡ Functions & Methods

| File                  | Function                  | Description |
|-----------------------|--------------------------|-------------|
| Shape.java           | Abstract methods         | Defines the blueprint for all shapes |
| Volume.java          | Interface method         | Defines the volume calculation method |
| Circle.java          | calculateShape(), calculatePerimeter() | Computes area & perimeter for Circle |
| Rectangle.java       | calculateShape(), calculatePerimeter() | Computes area & perimeter for Rectangle |
| Square.java         | calculateShape(), calculatePerimeter() | Computes area & perimeter for Square |
| Sphere.java         | calculateShape(), calculateVolume() | Computes surface area & volume for Sphere |
| Cylinder.java       | calculateShape(), calculateVolume() | Computes surface area & volume for Cylinder |
| EquilateralPyramid.java | calculateShape(), calculateVolume() | Computes surface area & volume for Pyramid |

## 🛠️ How to Run

1. Open Command Prompt and navigate to your project folder using:
   ```bash
   cd path_to_your_folder
   ```
2. Compile all Java files using:
   ```bash
   javac *.java
   ```
3. After compilation, run the program using:
   ```bash
   java Main
   ```
4. Follow the on-screen menu to perform calculations!

## 📌 Example Output
```
===== Shape Calculation System =====
1. Circle
2. Rectangle
3. Square
4. Sphere
5. Cylinder
6. Equilateral Pyramid
7. Exit
Enter your choice: 3

Enter side of the Square: 5
Area of Square: 25.0
Perimeter of Square: 20.0
```

## 📄 License
This project is open-source and free to use.
