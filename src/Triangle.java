public class Triangle {
    private Point v1, v2, v3;

    public Triangle(Point v1, Point v2, Point v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new (int x1, int y2);
    }
    @Override
    public String toString() {
        return "Triangle @ " + v1 + ", " + v2 + ", " + v3;
    }

    public double getPerimeter() {
        double lado1 = Point.getDistance(v1, v2);
        double lado2 = Point.getDistance(v2, v3);
        double lado3 = Point.getDistance(v3, v1);
        return lado1 + lado2 + lado3;
    }

    public void printType() {
        double lado1 = Point.getDistance(v1, v2);
        double lado2 = Point.getDistance(v2, v3);
        double lado3 = Point.getDistance(v3, v1);
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Equilateral");
        } else {
            if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                System.out.println("Escalene");
            } else {
                System.out.println("Isosceles");
            }
        }
    }
}
