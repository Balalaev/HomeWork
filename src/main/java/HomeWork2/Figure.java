package HomeWork2;

public abstract class Figure{

    protected String name;

    public String getName() {

        return name;
    }

    public Figure(String name) {

        this.name = name;
    }

    public abstract double getVolume();

    public abstract double getSquareArea();
}
