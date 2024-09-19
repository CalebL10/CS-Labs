/**
 * Short, one-line description of House class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House
{
    private Square wall;
    private Triangle roof;
    private Square window;

    /**
     * House Constructor.
     *
     */
    public House()
    {
        wall = new Square();
        wall.makeVisible();
        wall.changeSize(100);
        wall.moveVertical(150);
        wall.moveHorizontal(40);

        roof = new Triangle();
        roof.makeVisible();
        roof.changeSize(50, 130);
        roof.changeColor("black");
        roof.moveHorizontal(100);
        roof.moveVertical(135);

        window = new Square();
        window.makeVisible();
        window.changeColor("blue");
        window.moveVertical(170);
        window.moveHorizontal(50);
    }

    /**
     * Method main.
     *
     * @param args A parameter
     */
    public static void main(String[] args)
    {
        House house = new House();
    }

    /**
     * Method changeRoofColor.
     *
     * @param newColor A parameter
     */
    public void changeRoofColor(String newColor)
    {
        roof.changeColor(newColor);
    }

    /**
     * Method changeWallColor.
     *
     * @param newColor A parameter
     */
    public void changeWallColor(String newColor)
    {
        wall.changeColor(newColor);
    }

    /**
     * Method changeWindowColor.
     *
     * @param newColor A parameter
     */
    public void changeWindowColor(String newColor)
    {
        window.changeColor(newColor);
    }

    /**
     * Method moveHorizontal.
     *
     * @param distance A parameter
     */
    public void moveHorizontal(int distance)
    {
        wall.moveHorizontal(distance);
        roof.moveHorizontal(distance);
        window.moveHorizontal(distance);
    }

    /**
     * Method moveVertical.
     *
     * @param distance A parameter
     */
    public void moveVertical(int distance)
    {
        wall.moveVertical(distance);
        roof.moveVertical(distance);
        window.moveVertical(distance);
    }

    /**
     * Method makeInvisible.
     *
     */
    public void makeInvisible()
    {
        wall.makeInvisible();
        roof.makeInvisible();
        window.makeInvisible();
    }

    /**
     * Method makeVisible.
     *
     */
    public void makeVisible()
    {
        wall.makeVisible();
        roof.makeVisible();
        window.makeVisible();
    }
}
