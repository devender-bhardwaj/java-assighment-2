package some;
class Driver {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 7);

        //length can be only accessed from inside class
        // System.out.println(rect.length); //private

        System.out.println(rect.width); //package private
        System.out.println(rect.getPerimeter()); //protected
        System.out.println(rect.getArea()); // public
    }
}