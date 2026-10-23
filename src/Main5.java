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
    }
}
