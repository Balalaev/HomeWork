package HomeWork2;

public class Main {

    public static void main(String[] args) {

        Figure ball = new Ball("Ball", 10);
        Figure cube = new Cube("Cube", 5);
        Figure cuboid = new Cuboid("Cuboid", 4, 8,5);

        System.out.println(ball);
        System.out.println(cube);
        System.out.println(cuboid);

    }
}

