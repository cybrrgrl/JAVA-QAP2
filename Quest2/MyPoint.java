package Quest2;


public class MyPoint {
    private int x, y;

    // construct
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // get and set
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Set both x and y coords.
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Get both x and y as a single array
    public int[] getXY() {
        return new int[]{x, y};
    }

    // Calculate distance to another point (MyPoint)
    public double distance(MyPoint another) {
        int xDiff = another.x - this.x;
        int yDiff = another.y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // to strings
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
