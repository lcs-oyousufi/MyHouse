
/**
 * Creates an instance of a tree.
 *
 * @author O. Yousufi
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle tree1;
    private Triangle tree2;
    private Triangle tree3;
    private Square tree4;

    /**
     * Constructor for objects of class tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        tree1 = new Triangle();
        tree2 = new Triangle();
        tree3 = new Triangle();
        tree4 = new Square();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        tree1.changeColor("red");
        tree1.makeVisible();
        tree1.moveHorizontal(x);
        tree1.moveVertical(y);
        
        //
        tree2.changeColor("red");
        tree2.makeVisible();
        tree2.moveVertical(10);
        tree2.moveHorizontal(x);
        tree2.moveVertical(y);
        //
        tree3.changeColor("red");
        tree3.moveVertical(20);
        tree3.makeVisible();
        tree3.moveHorizontal(x);
        tree3.moveVertical(y);
        //
        tree4.changeColor("black");
        tree4.moveVertical(15);
        tree4.makeVisible();
        tree4.moveHorizontal(-15);
        tree4.changeSize(10);
        tree4.moveHorizontal(x);
        tree4.moveVertical(y);
        
        // translate the tree to the specified location
        
        
    }
    
}