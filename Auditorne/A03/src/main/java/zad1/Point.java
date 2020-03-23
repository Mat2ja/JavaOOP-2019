package zad1;

public class Point {

    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this(p.x, p.y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }

    public double distanceToPoint(Point p) {
        return Math.sqrt(Math.pow(y - p.getY(), 2)
                + Math.pow(x - p.getX(), 2));
    }
}
