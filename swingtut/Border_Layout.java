import java.awt.*;
import javax.swing.*;
//BorderLayout is a layout container that arranges its components to fit in five regions(north,south,weest,east,center) and each region must contain no more than 1 component and is identified with 
//a corresponding constant which is specified when adding the component to a conati er which is usuallya  jframe or a jpanel.the absence of string specification is treated as center region
//the deafult layout for a j frame is border layout so if not specified explicitly its still there
public class Border_Layout
{
     private JFrame frame;
    public Border_Layout(){
        initialize();
    }
   public void initialize(){
        frame=new JFrame();
         frame.setTitle("BorderPane Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
    //ONE WAY TO SET BORDER LAYOUT
     frame.setLayout(new BorderLayout(5,5));//BorderLayout has 2 constructors one is no argument and another is (hori gap,ver gap) to the various 5 regions
     //SECOND WAY TO SET BORDER LAYOUT
     //BorderLayout borderLayout=new BorderLayout();
     //borderLayout.setHgap(5);
     //borderLayout.setVgap(5);
     //frame.setLayout(borderLayout);
     frame.add(new JButton("NORTH"),BorderLayout.NORTH);//adding component to frame. (name of the button, a constant) 
       frame.add(new JButton("SOUTH"),BorderLayout.SOUTH);
         frame.add(new JButton("WEST"),BorderLayout.WEST);
           frame.add(new JButton("EAST"),BorderLayout.EAST);
             frame.add(new JButton("CENTER"),BorderLayout.CENTER);
    frame.setLocationRelativeTo(null);
    
    }
     public void show(){
      frame.setVisible(true);
  }
}
