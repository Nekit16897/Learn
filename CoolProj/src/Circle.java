public class Circle {
    public double x0;
    public double y0;
    public double a;
    public Circle(double x0, double y0, double a) {
        this.x0 = x0;
        this.y0 = y0;
        this.a = a;
    }



    public boolean isPointInCircle(double x, double y) {
        return Math.pow(x+x0, 2)+Math.pow(y+y0, 2)<=a;
    }
}
