public class Rectangle extends Point {
    private int width;
    private int heihgt;

    public Rectangle() {
        super();
        width = 0;
        heihgt = 0;
    }

    public  Rectangle(Point point, int newWidth, int newHeihgt) {
        super(point.getX(), point.getY());
        width = newWidth;
        heihgt = newHeihgt;
    }

    public Rectangle(Segment segment) {

    }

    @Override
    public String toString() {return "(" + getX() + ", " + getY() + ") width: " + width + " heihgt: " + heihgt;}
}
