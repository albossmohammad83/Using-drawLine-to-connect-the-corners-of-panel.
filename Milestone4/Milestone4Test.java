import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Milestone4Test

{
	public static void main (String[] args) 
	{
		Milestone4 panel = new Milestone4 ();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(300, 300); //size of canvas
		application.setVisible(true); //visible
		
	}
}