package Quest2;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // construct
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // get and set
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Move the rectangle (topLeft and bottomRight)
    public void move(int dx, int dy) {
        topLeft.setXY(topLeft.getX() + dx, topLeft.getY() + dy);
        bottomRight.setXY(bottomRight.getX() + dx, bottomRight.getY() + dy);
    }

    // string conversion
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
