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
        super(segment.getStartPoint().getX(), segment.getEndPoint().getY());
        this.width = width;
        this.heihgt = heihgt;
    }

    public Rectangle(Point p1, Point p2) {
        super(p1.getX(), p2.getY());
        width = p2.getX() - p1.getX();
        heihgt = p2.getY() - p1.getX();
    }
    @Override
    public String toString() {return "(" + getX() + ", " + getY() + ") width: " + width + " heihgt: " + heihgt;}
}
