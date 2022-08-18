package Main;

import Task17continue.*;

public class OOP17continue {
    public static void main(String[] args) {
        Shape shape1 = new First(12.5);
        Shape shape2 = new Second(48.9);
        Shape shape3 = new Third(32.5);
        Shape shape4 = new Fourth(67.7);
        Shape shape5 = new Fifth(123.3);
        Shape[] shapes = {shape1,shape2,shape3,shape4,shape5};
        for (Shape sh:shapes) {
            System.out.println(sh);
        }
    }
}
