/**
 * Short, one-line description of Scene class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene
{
    private House house1;
    private House house2;
    private Circle sun;
    private Circle moon;

    /**
     * Scene Constructor.
     *
     */
    public Scene()
    {
        house1 = new House();
        house1.makeVisible();
        house1.changeWallColor("red");
        house1.changeRoofColor("green");
        house1.changeWindowColor("blue");
        house1.moveHorizontal(-75);
        house1.moveVertical(-10);

        house2 = new House();
        house2.makeVisible();
        house2.changeWallColor("blue");
        house2.changeRoofColor("black");
        house2.changeWindowColor("yellow");
        house2.moveHorizontal(55);
        house2.moveVertical(-35);

        sun = new Circle();
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.moveVertical(-50);
        sun.changeSize(50);

        moon = new Circle();
        moon.makeVisible();
        moon.changeColor("blue");
        moon.moveVertical(-50);
        moon.moveHorizontal(-100);
        moon.changeSize(50);
    }

    /**
     * Method main.
     *
     * @param args A parameter
     */
    public static void main(String[] args)
    {
        Scene scene = new Scene();
        scene.animate();
    }

    /**
     * Method animate.
     *
     */
    public void animate()
    {
        sun.slowMoveHorizontal(300);
        moon.slowMoveHorizontal(300);
    }
}
