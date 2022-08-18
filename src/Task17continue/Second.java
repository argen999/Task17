package Task17continue;

public class Second extends Shape{
    public Second(double p) {
        super(p);
    }

    @Override
    public double getPerimeter() {
        return getP();
    }

    @Override
    public String toString() {
        return  "P2 = " + getP();
    }
}
