package some;
public class Rectangle {
    private double length;
    double width;
    public Rectangle (double l , double w) {
        length  = l;
        width = w;
    }
    protected double getPerimeter() {
        return 2 * (length + width) ;
    }
    public double getArea() {
        return length * width;
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(8, 10);
        System.out.println(rect.length); //private
        System.out.println(rect.width); //package private
        System.out.println(rect.getPerimeter()); //protected
        System.out.println(rect.getArea()); // public 
    }
}
