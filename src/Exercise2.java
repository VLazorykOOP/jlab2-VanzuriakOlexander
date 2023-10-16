public class Exercise2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 3);
        Rectangle r2 = new Rectangle(4, 2);
        Rectangle r3 = new Rectangle(3, 2);
        System.out.println("Perimeter of triangle " + r1.perimeterOfTriangle());
        System.out.println("Area of rectangle " + r1.rectangleArea());
        if (r1.equals(r2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They aren't equal");
        }

        if(r1.similarTriangles(r2)) {
            System.out.println("They are similar");
        } else {
            System.out.println("They aren't similar");
        }
        if(r1.similarTriangles(r3)) {
            System.out.println("They are similar");
        } else {
            System.out.println("They aren't similar");
        }
    }
}
