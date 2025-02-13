package Quest1;

public class TestMyLine {
    public static void main(String[] args) {
        // Creating MyPoint instances
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);

        // Creating instance for MyLine
        MyLine line = new MyLine(p1, p2);

        // test outputs
        System.out.println("Line: " + line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient (radians): " + line.getGradient());

        // Modifying points
        line.setBeginXY(2, 3);
        line.setEndXY(6, 7);

        // more testing and testing validation
        System.out.println("Updated Line: " + line);
        System.out.println("Updated Length: " + line.getLength());
        System.out.println("Updated Gradient: " + line.getGradient());
    }
}
