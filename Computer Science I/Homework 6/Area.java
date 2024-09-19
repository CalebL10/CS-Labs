/**
 * The Area class.
 * 
 * This program has three overloaded static methods 
 * for calculating the areas of the circles, 
 * rectangles, and cylinders.
 *
 * @author (Caleb Long) 
 * @version (.1)
 */
public class Area
{
    // TODO: Define the methods here. Each method should include
    // JavaDoc comments with @param tags that explain what each
    // parameter is for and a @return tag that explains what is
    // being returned.
    /**
     * @param radius of circle
     * @return the result of the area formula
     */
    public static double area(double radius)
    {
        return Math.PI * (radius * radius);
    }
    
    /**
     * @param width of the rectangle
     * @param length of the rectangle
     * @return result of the area formula
     */
    public static double area(int width, int length)
    {
        return width * length;
    }
    
    /**
     * @param radius of cylinder
     * @para height of cylinder
     * @return result of the area formula
     */
    public static double area(double radius, double height)
    {
        return Math.PI * (radius * radius) * height;
    }
}
