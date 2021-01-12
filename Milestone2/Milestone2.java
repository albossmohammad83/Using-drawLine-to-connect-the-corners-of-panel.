
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Milestone2 extends JPanel
{
	private int Line;
	private int DrawingLine;
	private int inputCounter;
	public Milestone2()
	{
		do {
			DrawingLine = 
Integer.parseInt(JOptionPane.showInputDialog( " Enter a number from 2 to 50."));
			inputCounter++;
			if(inputCounter>3)
{
			JOptionPane.showMessageDialog(null, "2 to 50, not anything more or less.....");
}
	}
		while (DrawingLine < 2 || DrawingLine > 50); // while loop for lines
		Line = DrawingLine;
}

	public void paintComponent ( Graphics g )
{

	super.paintComponent ( g );
	
	int NUM_STEPS = DrawingLine;
	int width = getWidth();
	int height = getHeight();
    int endX = 0;
    int endY = height;
    int HorizontalStep = width/NUM_STEPS;
    int VerticalStep = height/NUM_STEPS;

	
	for (int i = 0; i < NUM_STEPS; i++)
	{

	//for top left corner
	g.drawLine (0,0, endX,endY);

	//for bottom right corner
	g.drawLine(width,height,endX,endY);
	//for top right corner
	g.drawLine(width, 0,  endX, endX);
	//for bottom left corner
	g.drawLine(endX,endX,0,height);

	endX = HorizontalStep + endX;
	endY = endY - VerticalStep;

	
  
	} // end

}
}