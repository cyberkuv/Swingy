package za.wethinkcode.swingy.CORDS;

public class Coordinates {
    private double x = 0;
    private double y = 0;
    public Coordinates() {}
    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() { return x; }
    public double getY() { return y; }
}