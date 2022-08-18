package Task17continue;

public class Fifth extends Shape{
    public Fifth(double p) {
        super(p);
    }

    @Override
    public double getPerimeter() {
        return getP();
    }

    @Override
    public String toString() {
        return  "P5 = " + getP();
    }
}
