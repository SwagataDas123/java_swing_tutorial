import java.awt.*;
import javax.swing.*;
//Grid_Layout is java swing layout manager class that lays out its components in a rectangular grid .the components are usually jframe or jpanel which is divided into equal rectangles with 1 
//component in each rectangle
//in border layout if we dont specify an area where we are adding component(panel) its automatically added to center
public class Grid_Layout
{
  private JFrame frame;
     private JPanel panel;
    public Grid_Layout(){
        initialize();
    }
   public void initialize(){
        frame=new JFrame();
         frame.setTitle("Grid_Layout Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
     frame.setLayout(new BorderLayout());
    frame.setLocationRelativeTo(null);
    
    panel=new JPanel(new GridLayout(4,5,10,10));//first a grid like a single row with many cols is created if nothing specified but 4,5,10,10 will create 4 rows,5 cols,10 hor gap,10 ver gap
      for(int i=1;i<=20;i++)
         {
             JButton button=new  JButton("Button" + Integer.toString(i));
             panel.add(button);
         }
         frame.add(panel);
    frame.pack();

}
     public void show(){
      frame.setVisible(true);
  }
}
