public class Main5 {
    public static void main(String[] argv) {
        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);
        rectangle.moveTo(4,7);
        System.out.println(rectangle);

        Rectangle rectangle2 = new Rectangle(new Point(1,1), 8, 6);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(new Point(2,0), new Point(4,2));
        System.out.println(rectangle3);

        Rectangle rectangle4 = new Rectangle(new Segment(new Point(2,2), new Point(4,0)));
        System.out.println(rectangle4);

        System.out.println(rectangle4.getArea());
        System.out.println(rectangle4.getPoint());
        Rectangle rectangle5 = new Rectangle(new Point(5,6), 6,8);
        System.out.println("Arriba-Izquierda: " + rectangle5.getTopLeftPoint() + " Arriba-Derecha" +
                rectangle5.getTopRightPoint() + " Abajo-Izquierda " + rectangle5.getBottomLeftPoint() +
                " Abajo-Derecha " + rectangle5.getBottomRightPoint());
    }
}
