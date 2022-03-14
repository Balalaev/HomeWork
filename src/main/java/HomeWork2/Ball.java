package HomeWork2;

public class Ball extends Figure{

    public double diameter;


    public Ball(String name, double diameter) {
        super(name);
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {

        return getDiameter()/2;
    }

    @Override
    public double getVolume() {

        return 4 / 3 * Math.PI * getRadius();
    }

    @Override
    public double getSquareArea() {

        return 4 * Math.PI * getRadius() * getRadius();
    }

    @Override
    public String toString() {
        return getName() + ":\n" +
                " volume = " + getVolume() +
                "\n square = " + getSquareArea();
    }
}
