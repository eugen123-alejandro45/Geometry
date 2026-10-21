public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }
 
    public  Polygon() {
        points = new Point[100];
        for (int i = 0; i < points.length; i++) {
            points[i] = null;
        }
    }
}
