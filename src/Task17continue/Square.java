package Task17continue;

public class Square extends Shape{
    private int num1;


    public Square(int num1) {
        this.num1 = num1;
    }

    @Override
    public double getPerimeter() {
        System.out.print("Периметр квадрата = ");
        return num1 * 4;
    }
}
