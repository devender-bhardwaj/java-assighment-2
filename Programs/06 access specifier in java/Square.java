import some.Rectangle;

public class Square extends Rectangle{
    Square(double l) {
        super(l,l) ;
    }
    public static void main(String[] args) {
        Square sq = new Square(5);

        //length can be only accessed from inside class
        // System.out.println(sq.length); //private
        

        //width can be only accessed from inside the package
        // System.out.println(sq.width); //package private

        System.out.println(sq.getPerimeter()); //protected
        System.out.println(sq.getArea()); // public        
    }
}
