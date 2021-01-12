
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Milestone4 extends JPanel
{

	private int Line;
	private int DrawingLine;
	private int inputCounter;
	public Milestone4()
	{
		do {
			DrawingLine = 
Integer.parseInt(JOptionPane.showInputDialog( " Enter a number from 2 to 50."));	// Input dialog box
			inputCounter++;
			if(inputCounter>3)
{
			JOptionPane.showMessageDialog(null, "2 to 50, not anything more or less....."); //after certain amount of wrong inputs
}
	}
		while (DrawingLine < 2 || DrawingLine > 50); // while loop for lines
		Line = DrawingLine;
}

	public void paintComponent ( Graphics g )
{

	super.paintComponent ( g );
	int width = getWidth();
	int height = getHeight();
    int endX = width;
    int endY = height;
    int NUM_STEPS = DrawingLine;

for (int i = 0; i < NUM_STEPS; i++)
{
   	endX = i*width/NUM_STEPS;
   	endY = height - i*height/NUM_STEPS;
	//for top left corner
	g.drawLine ( 0,endX, endY, 0);
	//for top right corner
	g.drawLine ( width,endX, endX, 0);
	//for bottom right corner
	g.drawLine (width, endY,endX,height);
	//for bottom left corner
	g.drawLine(0,endY,endY,height);

}

}
}