
/**
 * It draws a compleye house on screen using individual shapes.
 *
 * @author O. Yousufi 
 * @version January 11 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle moon;
    private Triangle roof;
    private Square base;
    private Square nightSky;
    private Circle ground;
    private Square baseTwo;
    private Square garage;
    private Triangle roofTwo;
    private Triangle garageRoof;
    private Square window;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    private Tree tree5;
    private Tree tree6;
    private Tree tree7;
    private Tree tree8;
    private Tree tree9;
    private Tree tree10;

    /**
     * The job of a constructor is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        moon = new Circle();
        roof = new Triangle();
        base = new Square();
        nightSky = new Square();
        ground = new Circle();
        baseTwo = new Square();
        garage = new Square();
        roofTwo = new Triangle();
        garageRoof = new Triangle();
        window = new Square();
        //invoke the method to draw the house
        drawHouse();
        
        tree1 = new Tree(200,250);
        tree2 = new Tree(240,347);
        tree3 = new Tree(278,328);
        tree4 = new Tree(350,400);
        tree5 = new Tree(400,450);
        tree6 = new Tree(274,425);
        tree7 = new Tree(200,250);
        tree8 = new Tree(200,250);
        tree9 = new Tree(200,250);
        tree10 = new Tree(200,250);
    }

    /**
     * Draw the house for us
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawHouse()
    {
        // put the sun in position
        //draw the night sky
        nightSky.changeSize(650);
        nightSky.changeColor("black");
        nightSky.makeVisible();
        nightSky.moveHorizontal(-75);
        nightSky.moveVertical(-50);
        
        //draw the moon
        moon.moveHorizontal(-70);
        moon.moveVertical(-85);
        moon.changeSize(120);
        moon.changeColor("white");
        moon.makeVisible();
        
        
        
        //garage roof make before bases to give nice overlapping shape
        garageRoof.changeSize(40,100);
        garageRoof.changeColor("blue");
        garageRoof.makeVisible();
        garageRoof.moveVertical(120);
        garageRoof.moveHorizontal(190);
        
        //make the base of the house
        base.changeSize(100);
        base.changeColor("magenta");
        base.makeVisible();
        base.moveVertical(100);
        base.moveHorizontal(-45);
        
        //make the second base
        baseTwo.changeSize(100);
        baseTwo.changeColor("magenta");
        baseTwo.makeVisible();
        baseTwo.moveVertical(100);
        baseTwo.moveHorizontal(55);
        
        //make the garage
        garage.changeSize(75);
        garage.changeColor("red");
        garage.makeVisible();
        garage.moveVertical(125);
        garage.moveHorizontal(155);
        
        //draw the ground
        ground.changeSize(900);
        ground.changeColor("green");
        ground.makeVisible();
        ground.moveVertical(165);
        ground.moveHorizontal(-310);
        
        //make the roof of base 1
        roof.changeSize(65,150);
        roof.changeColor("blue");
        roof.makeVisible();
        roof.moveVertical(70);
        roof.moveHorizontal(37);
        
        //make the roof of base 1
        roofTwo.changeSize(50,100);
        roofTwo.changeColor("blue");
        roofTwo.makeVisible();
        roofTwo.moveVertical(85);
        roofTwo.moveHorizontal(115);
        
        //make the window
        window.changeSize(40);
        window.changeColor("yellow");
        window.makeVisible();
        window.moveVertical(75);
    }
}
