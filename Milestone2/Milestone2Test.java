import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Milestone2Test

{
	public static void main (String[] args) 
	{
		Milestone2 panel = new Milestone2 ();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel);
		application.setSize(300, 300); //size of jpanel
		application.setVisible(true); //to make jpanel visible
		
	}
}