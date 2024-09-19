/**
 * Short, one-line description of ShapeFun class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ShapeFun
{
    /**
     * Method main.
     *
     * @param args A parameter
     */
    public static void main(String[] args)
    {
        Square square = new Square();
        square.makeVisible();
        square.moveHorizontal(50);
        
        Circle circle = new Circle();
        circle.makeVisible();
        
        Triangle triangle = new Triangle();
        triangle.makeVisible();
        triangle.moveHorizontal(100);
    }
}
