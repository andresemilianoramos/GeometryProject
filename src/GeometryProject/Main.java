package GeometryProject;

// Create a class Main
public class Main{
     //(with a main method)
    public static void main(String[] args) {
    // that declares a point and then moves
        // it to a location
        Point point1 = new Point(4,5);
        Point point2 = new Point(6,8);
         point1.setOffset(4,4);
         point2.setOffset(4,4);

        System.out.println("Point 1 = "+point1.toString());
        System.out.println("Point 2 = "+point2.toString());


        //and then prints its value calling its
        // toString( ) method.
         //Make sure your class encapsulates its data.
    }
}
