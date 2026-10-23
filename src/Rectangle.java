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
        super();
        int x, y;
        Point startPoint = segment.getStartPoint();
        Point endPoint = segment.getEndPoint();
        if (startPoint.getX() < endPoint.getX()) {
            x = startPoint.getX();
            width = endPoint.getX() - startPoint.getX();
        } else {
            x = endPoint.getX();
            width = startPoint.getX() - endPoint.getX();
        }
        if (startPoint.getY() < endPoint.getY()) {
            y = startPoint.getY();
            heihgt = startPoint.getY() - endPoint.getY();
        } else {
            y = endPoint.getY();
            heihgt = endPoint.getY() - startPoint.getY();
        }
        setX(x);
        setY(y);
        /*
        setX(segment.getStartPoint().getX() < segment.getEndPoint().getX() ? segment.getStartPoint().getX() : segment.getEndPoint().getX());
        setX(segment.getStartPoint().getY() < segment.getEndPoint().getY() ? segment.getStartPoint().getY() : segment.getEndPoint().getY());
         */
    }
    public void getArea() {
        this.heihgt *= heihgt;
        this.width *= width;
    }

    public void getPoint(){

    }
    public Rectangle(Point p1, Point p2) {
        super(p1.getX(), p2.getY());
        width = p2.getX() - p1.getX();
        heihgt = p2.getY() - p1.getX();
    }
    @Override
    public String toString() {return "(" + getX() + ", " + getY() + ") width: " + width + " heihgt: " + heihgt;}
}
