/* Mohammad Abdelrahman
 * 9/29/2015
 */
//  Milestone1Test.java
//Application to display a Milestone1.
import javax.swing.JFrame;

public class Milestone1Test
{
   public static void main( String[] args )
   { 
      //creat a panel that contains our drawing
      Milestone1 panel = new Milestone1();
      //create a new frame to hold the panel
      JFrame application = new JFrame();
      //set the frame to exit when it is closed
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      // add the panel to the frame
      application.add( panel );
      //set the size of the frame
      application.setSize(250, 250);
      // make the frame visible
      application.setVisible( true );
   }//end main
}//end class DrawPaneTest