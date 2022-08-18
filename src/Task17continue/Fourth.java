package Task17continue;

public class Fourth extends Shape{
    public Fourth(double p) {
        super(p);
    }

    @Override
    public double getPerimeter() {
        return getP();
    }

    @Override
    public String toString() {
        return  "P4 = " + getP();
    }
}
