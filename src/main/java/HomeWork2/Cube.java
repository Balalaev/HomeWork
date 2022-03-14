package HomeWork2;

public class Cube extends Figure{

    public double a;

    public Cube(String name, double a) {
        super(name);
        this.a = a;
    }

    public double getA() {

        return a;
    }

    @Override
    public double getVolume() {

        return getA() * getA() * getA();
    }

    @Override
    public double getSquareArea() {

        return 6 * getA() * getA();
    }

    @Override
    public String toString() {
        return getName() + ":\n" +
                " volume = " + getVolume() +
                "\n square = " + getSquareArea();
    }
}