public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Segment() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public double getModule() {
        int x1 = startPoint.getX();
        int y1 = startPoint.getY();
        int x2 = endPoint.getX();
        int y2 = endPoint.getY();
        double distant = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distant;
    }

    @Override
    public String toString() {
        return startPoint + " - " + endPoint;
    }

    public void setOffset(int offX, int offY) {
        startPoint.moveTo(startPoint.getX() + offX, startPoint.getY() + offY);
        endPoint.moveTo(endPoint.getX() + offX, endPoint.getY() + offY);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
}
