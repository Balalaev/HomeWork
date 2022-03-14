package HomeWork1;

public class QuadEquation {

    int a;
    int b;
    int c;
    int d;
    int n;
    double x1;
    double x2;

    public QuadEquation(int a, int b, int c) {
        if (a == 0) {
            throw new IllegalArgumentException("'a' can't equal zero");
        } else
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void discriminant () {
        this.d = b * b - 4 * a * c;
        System.out.println("Дискриминант = " + d);
    }

    public void amountRoots() {
        if (d > 0) {
            this.n = 2;
        } else if (d == 0) {
            this.n = 1;
        } else {
            this.n = 0;
        }
        System.out.println("Количество корней = " + n);
    }

    public void roots () {
        if (n == 2) {
            x1 = (- b - Math.sqrt(d)) / (2 * a);
            x2 = (- b + Math.sqrt(d)) / (2 * a);
            System.out.println("Первый корень = " + x1 + ", второй корень =" + x2);
        } else if (n == 1) {
            x1 = (- b) / (2 * a);
            System.out.println("Корень уравнения =" + x1);
        } else {
            System.out.println("У данного уравнения нет корней");
        }
    }
}

