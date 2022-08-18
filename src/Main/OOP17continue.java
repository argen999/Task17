package Main;

import Task17continue.*;

public class OOP17continue {
    public static void main(String[] args) {
        Shape shape1 = new Square(123);
        Shape shape2 = new Triangle(23,56,34);
        Shape shape3 = new Rectangle(56,88,12,22);
        Shape shape4 = new Rhombus(132,67,89,77);
        Shape shape5 = new Circle(12.5);
        Shape[] shapes = {shape1,shape2,shape3,shape4,shape5};
        for (Shape sh:shapes) {
            System.out.println(sh.getPerimeter() );
        }

    }
}
