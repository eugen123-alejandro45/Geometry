public class Main4 {
    public static void main(String[] argv) {
        Point p1 = new Point(4,5);
        Point p2 = new Point(6 ,8);

        Segment segment = new Segment(p1, p2);
        System.out.println("Segmento creado: " + segment);
        System.out.println("Longitud del segmento: " + segment.getModule());
    }
}
