/* Mohammad Abdelrahman
 * 9/29/2015
*/
//   Milestone1.java
// Using drawLine to connect the corners of panel.
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

 class Milestone1 extends JPanel
{
	private int NUM_STEPS;
	private int lines;
	private int count;
	public Milestone1()
	 //constructer
	{
	
		do
		{
			lines = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 1 and 50")); //prompt for the user to enter the lines
			count++;
			if(count > 3 && lines < 1 || lines > 50) //if the user failed to enter more than 3 times a warring message popout
	  {
	  	JOptionPane.showMessageDialog(null,"Please Follow the rules");
	  }
		}
		while(lines < 1 || lines > 50 ); //check to make sure the user put the right number
	  NUM_STEPS = lines;	  
	}
   
   public void paintComponent( Graphics g )
   {
     //call paintComponent to rnsure the panel display correctly
     super.paintComponent( g );
     //total width
     int width = getWidth();
     //total height
     int height = getHeight();
     int horizantalstep = width/NUM_STEPS;
     int verticalStep = height/NUM_STEPS;
     int endX = 0;
     int endY = height;
 for (int i = 0; i <= NUM_STEPS; i++)
 {
 endX = i*width/NUM_STEPS;
 endY = height - i*height/NUM_STEPS;
 g.drawLine ( 0,0, endX, endY );
 g.drawLine ( endX, endY, width, height);
 } 
 	for (int i = 0; i <= NUM_STEPS; i++)
 {
 endX = i*width/NUM_STEPS;
 endY = height - i*height/NUM_STEPS;
 g.drawLine ( width,0, endX, endY );
 g.drawLine ( endX, endY, width, height);
 } 
    }// end method paintComponent
}// end class DrawPanel