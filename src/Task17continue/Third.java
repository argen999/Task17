package Task17continue;

public class Third extends Shape{
    public Third(double p) {
        super(p);
    }

    @Override
    public double getPerimeter() {
        return getP();
    }

    @Override
    public String toString() {
        return  "P3 = " + getP();
    }
}
