//implements ModifiedMileStoneTwo, adding on the JButtons
//@author: Shorwei Gong
//@version: November 10, 2015
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ModifiedMileStoneTwoFrame extends JFrame implements ActionListener 
{
    private ModifiedMileStoneTwo myGrid;
    private JButton myUp;	//button to increase myCount
    private JButton myDown; //button to decrease myCount
    public ModifiedMileStoneTwoFrame( ) 
    {
        setTitle("ModifiedMileStoneTwoFrame");
        Container content = getContentPane( );
        content.setLayout(new BorderLayout( ));
        myGrid = new ModifiedMileStoneTwo(10, 200, 200);
        content.add(myGrid, BorderLayout.CENTER);
        // Panel for controls in south
        JPanel panel = new JPanel( );
        myUp = new JButton("Up");
        panel.add(myUp);
        myUp.addActionListener(this);
        myDown = new JButton("Down");
        panel.add(myDown);
        myDown.addActionListener(this);
        content.add(panel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack( );
        setVisible(true);
    } 
    // Notification sent by control
    // figure out what was clicked
    public void actionPerformed(ActionEvent e) 
    {
        // e.getSource( ) is control that was clicked
        if (e.getSource( ).equals(myUp)) 
        {
            myGrid.upCount( );
        }
        else if (e.getSource( ).equals(myDown)) 
        {
            myGrid.downCount( );
        }
    }
    public static void main(String[ ] args) 
    {
        ModifiedMileStoneTwoFrame f = new ModifiedMileStoneTwoFrame( );
    }
} 