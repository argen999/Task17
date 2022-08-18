package Task17continue;

public abstract class Shape {
    private double P;


    public Shape(double p) {
        P = p;
    }



    public void setP(double p) {
        P = p;
    }
    public double getP() {
        return P;
    }


    public abstract double getPerimeter();

}
