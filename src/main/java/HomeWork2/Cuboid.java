package HomeWork2;

public class Cuboid extends Figure{

    private double a;
    private double b;
    private double h;

    public Cuboid(String name, double a, double b, double h) {
        super(name);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getVolume() {
        return getA() * getB() * getH();
    }

    @Override
    public double getSquareArea() {
        return 2 * (getA()*getB() + getB()*getH() + getA()*getH());
    }

    @Override
    public String toString() {
        return getName() + ":\n" +
                " volume = " + getVolume() +
                "\n square = " + getSquareArea();
    }
}
