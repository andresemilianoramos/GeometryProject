package GeometryProject;

// Create the class Point
public class Point {
    // with 2 integer fields, x and y
    public int x;
    public int y;

    public Point (){
         this(0,0);
    }
    //-The second will take 2 parameters of type int
    public Point (int x ,int y){
        this.x = x;
        this.y = y;
    }
    //- Create the methods setX()
    public void setX(int x) {
        this.x = x;
    }
    // and setY()
    public void setY(int y) {
        this.y = y;
    }
    public String toString() {
        // that returns the point in the way “(x , y)”
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    // Create the method moveTo
    public void moveTo (int x, int y){
        this.x = x;
        this.y = y;
    }
    //10.- Create the methods getX()
    public int getX() {
        return x;
    }
    //and getY()
    public int getY() {
        return y;
    }
    //12.- Create the method setOffset(int offsetX, int offsetY)
    public void setOffset(int offX , int offY){
    //that increments x
        x = x + offX;
        //and y values.
        y = y + offY;

    }
}
