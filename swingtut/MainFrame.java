import javax.swing.*;
import java.awt.*;

//panel is a container for other components
//JPanel has a separate layout manager other than frame and its deafult layout is flow layout
public class MainFrame
{
      private JFrame frame;
    public MainFrame(){
        initialize();
    }
    public void initialize(){
        frame=new JFrame();
        frame.setLayout(new BorderLayout(10,5));
         frame.setTitle("Java Swing JPanel Demo");
    frame.setSize(800,500);
    frame.setLocationRelativeTo(null);
     frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
     JPanel panel=new JPanel();//creating JPanel
     panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5));//set layout with Flowlayout(alignment,horizontal gap,vertical gap) in pixels
     //FlowLayout.LEFT -> aligns left (now the three buttons move to succeeding lines if we minimise the window if its set to left but if center then it stays in center even if minimised) 
     //FlowLayout.RIGHT -> aligns right
     panel.setBackground(Color.RED);//Jpanel takes up the entire space of frame
     
     Button button1 =new Button("Button 1");//button
     panel.add(button1);//adding button to panel
        Button button2 =new Button("Button 2");//button
     panel.add(button2);//adding button to panel
        Button button3 =new Button("Button 3");//button
     panel.add(button3);//adding button to panel
     
     panel.setPreferredSize(new Dimension(250,250));//setting preferred size
     //the dimensions 250,250 is respected only when the BorderLayout.CENTER is not there and its any other direction like BorderLayout.NORTH and so on
     
    frame.add(panel,BorderLayout.CENTER);//adding panel to frame
    //setting the red part and the button in diff directions
    //BorderLayout.NORTH ->up
    //BorderLayout.SOUTH ->down
    //BorderLayout.EAST ->right
    //BorderLayout.WEST ->left
     
     
    }
      public void show(){
      frame.setVisible(true);
  }
}
