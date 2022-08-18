package Task17continue;

public class First extends Shape{
    public First(double p) {
        super(p);
    }

    @Override
    public double getPerimeter() {
        return getP();
    }

    @Override
    public String toString() {
        return  "P1 = " + getP();
    }
}
