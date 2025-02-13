package Quest2;


public class TestMyRectangle {
    public static void main(String[] args) {
        // make instances for mypoint
        MyPoint p1 = new MyPoint(1, 4);
        MyPoint p2 = new MyPoint(5, 1);

        // myrectangle instance
        MyRectangle rect = new MyRectangle(p1, p2);

        // Display original rectangle properties
        System.out.println("Rectangle: " + rect);
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        // test moving the rectangle like in MyRectangle
        rect.move(2, 3);

        // output the updated properties
        System.out.println("After moving by (2,3): " + rect);
        System.out.println("Updated Width: " + rect.getWidth());
        System.out.println("Updated Height: " + rect.getHeight());
        System.out.println("Updated Area: " + rect.getArea());
        System.out.println("Updated Perimeter: " + rect.getPerimeter());
    }
}
