import java.awt.*;
import javax.swing.*;
//Flow layout positions it components ina  single line from left to right until it runs out of real estate and then at end of size of container the flow layout will wrap to next line from top to
// bottom and left to right.deafult layout for Jpanel is flow layout
public class Flow_Layout
{
     private JFrame frame;
     private JPanel panel;
    public Flow_Layout(){
        initialize();
    }
   public void initialize(){
        frame=new JFrame();
         frame.setTitle("Flow_Layout Demo");
         
         panel=new JPanel(new FlowLayout(FlowLayout.CENTER,10,5)); 
         panel.setBackground(Color.PINK);
         
         for(int i=1;i<=5;i++)
         {
             JButton button=new  JButton("Button" + Integer.toString(i));
             panel.add(button);
         }
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
     frame.setLayout(new BorderLayout());
    frame.setLocationRelativeTo(null);
    frame.add(panel,BorderLayout.CENTER);//adding panel to center of frame which is using border layout
    //BorderLayout.CENTER wokrs perfect becuse center area resizes when fream is resized but when north and south only width resizes and for the other 2 directions only height resizes
    //frame.add(panel,BorderLayout.NORTH);
    }
     public void show(){
      frame.setVisible(true);
  }
}
