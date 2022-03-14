package HomeWork1;

public class Main {

    public static void main(String[] args) {

        try {
            QuadEquation qa = new QuadEquation(5, 20, 10);
            qa.discriminant();
            qa.amountRoots();
            qa.roots();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        try {
            QuadEquation qa2 = new QuadEquation(0, 20, 10);
            qa2.discriminant();
            qa2.amountRoots();
            qa2.roots();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}