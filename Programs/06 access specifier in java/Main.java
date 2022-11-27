public class Main {
    public static void main(String[] args) {
        Square sq = new Square(5);

        //length can be only accessed from inside class
        // System.out.println(sq.length); //private
        

        //width can be only accessed from inside the package
        // System.out.println(sq.width); //package private

        //Protected method is only visible from derived class and
        // main is not derived from Rectangle therefor getPerimeter 
        //is not visible
        // System.out.println(sq.getPerimeter()); //protected

        //This is visible from all four classess 
        System.out.println(sq.getArea()); // public
    }
}
