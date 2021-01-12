// Like the MileStoneFour program, but responds to upCount( ) and downCount( ) to
// change the count. In addition, the lines are different colors
//@author: Shorwei Gong
//@version: November 10, 2015
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
class ModifiedMileStoneFour extends JComponent 
{
    // number of divisions to create, vert and horiz
    private int myCount;
    // Creates a new component with the given count and size
    public ModifiedMileStoneFour(int count, int width, int height)
    {
        myCount = count;
        setPreferredSize(new Dimension(width, height));
    } 
    public void paintComponent(Graphics g)                 // start method for painting the lines
    {
      super.paintComponent(g);
      int width = getWidth();
      int height = getHeight();
      int verticalStep = 0;                               // initialize first verticalStep to 0
      int horizontalStep = 0;
      int endX;                                           // declare endX
      int endY;                                           // declare endY
      int startY;                                         // declare startY (beginning of your drawn line)
      int startX;                                         // declare startX (beginning of your drawn line)
      // create for loop to draw lines starting at top left and ending at bottom one step to the right
      // then starting one step down and ending one step to the right, according to user entered number of lines
      for (int lines = 0; lines<=myCount; lines++)
      {
         int R = (int) (Math.random( )*256);
         int G = (int)(Math.random( )*256);
         int B = (int)(Math.random( )*256);
         Color randomColor = new Color(R, G, B);
         startY = lines*height/myCount;
         endX = (1+lines)*width/myCount;
         g.drawLine( 0, startY, endX, height);
         g.setColor(randomColor);
      }
      // create for loop doing the same thing, starting in the bottom left corner
      for (int lines = 0; lines<=myCount; lines++)
      {
         int R = (int) (Math.random( )*256);
         int G = (int)(Math.random( )*256);
         int B = (int)(Math.random( )*256);
         Color randomColor = new Color(R, G, B);
         startY = height - lines*height/myCount;
         endX = (1+lines)*width/myCount;
         g.drawLine( 0, startY, endX, 0);
         g.setColor(randomColor);
      }
      // create for loop doing the same thing, starting in the top right corner
      for (int lines = 0; lines<=myCount; lines++)
      {
         int R = (int) (Math.random( )*256);
         int G = (int)(Math.random( )*256);
         int B = (int)(Math.random( )*256);
         Color randomColor = new Color(R, G, B);
         startY = lines*height/myCount;
         endX = width - (1+lines)*width/myCount;
         g.drawLine( width, startY, endX, height);
         g.setColor(randomColor);
      }
      // create for loop doing the same thing, starting in the bottom right corner
      for (int lines = 0; lines<=myCount; lines++)
      {
         int R = (int) (Math.random( )*256);
         int G = (int)(Math.random( )*256);
         int B = (int)(Math.random( )*256);
         Color randomColor = new Color(R, G, B);
         startY = height - lines*height/myCount;
         endX = width - (1+lines)*width/myCount;
         g.drawLine( width, startY, endX, 0);
         g.setColor(randomColor);
      }
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