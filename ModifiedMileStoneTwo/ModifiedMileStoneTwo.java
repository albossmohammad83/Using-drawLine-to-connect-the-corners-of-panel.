// Like MileStoneTwo, but responds to upCount( ) and downCount( ) to
// change the count.
//@author: Shorwei Gong
//@version: November 10, 2015
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
class ModifiedMileStoneTwo extends JComponent 
{
    // number of divisions to create, vert and horiz
    private int myCount;
    // Creates a new component with the given count and size
    public ModifiedMileStoneTwo(int count, int width, int height)
    {
        myCount = count;
        setPreferredSize(new Dimension(width, height));
    } 
     public void paintComponent(Graphics g)                 // create graphics for the program
    {
      super.paintComponent(g);
      int width = getWidth();
      int height = getHeight();                           
      int verticalStep = 0;                               // initialize first verticalStep to 0
      int horizontalStep = 0;
      int endX;                                           // declare endX
      int endY;                                           // declare endY
      for (int lines = 0; lines<=myCount; lines++)       
      {
         int R = (int) (Math.random( )*256);
         int G = (int)(Math.random( )*256);
         int B = (int)(Math.random( )*256);
         Color randomColor = new Color(R, G, B);
         endX = lines*width/myCount;                     // end points from left to right
         endY = height - lines*height/myCount;           // end points from bottom to top
         g.drawLine( 0, 0, endX, endY );                  // draw lines from top left first to bottom left, then step by step up to top right
         g.drawLine( width, height, endX, endY );         // draw lines from bottom right to bottom left first, then step by step to top right
         g.setColor(randomColor);
      }
      // create for loop, for end points from bottom left to top right
      for (int lines = 0; lines<=myCount; lines++)
      {
         int R = (int) (Math.random( )*256);
         int G = (int)(Math.random( )*256);
         int B = (int)(Math.random( )*256);
         Color randomColor = new Color(R, G, B);
         endX = lines*width/myCount;                     // end points from left to right
         endY = lines*height/myCount;                    // end points from top to bottom
         g.drawLine( 0, height, endX, endY );             // draw lines from bottom left to the middle of the screen, step by step from top left to bottom right
         g.drawLine( width, 0, endX, endY );              // draw lines from top right to the middle of the screen, step by step from top left to bottom right
         g.setColor(randomColor);
      }
      // create for loop, for end points from top left to bottom right
    } // end method paintComponent   
    // Increases count
    public void upCount( )
    {
        myCount++;
        repaint( ); // classic: change state, then repaint( )
    }
    // Decreases count
    public void downCount( ) 
    {
        if (myCount>0) 
        {
            myCount--;
            repaint( );
        }
    }
} 