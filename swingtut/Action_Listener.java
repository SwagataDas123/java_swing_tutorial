import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//Action_Listener is an interface that allowss you to listen or receive java swing action events
//another way of adding action listener is to make the main class implement action listener interface
public class Action_Listener implements ActionListener
{
   private JFrame frame;
    private JPanel panel;
       private JLabel label;
        private JTextField textfield;
        private JButton button;
      public Action_Listener(){
        initialize();
    }
  public void initialize(){
        frame=new JFrame();
         frame.setTitle("Action listener Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
    frame.setLayout(new BorderLayout(10,10));
    frame.setLocationRelativeTo(null);
    
      panel =new JPanel();
       label=new JLabel("enter your name");
       textfield=new JTextField(20);
       button=new JButton("save");
       
  /*  one way of adding action listener
   * button.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
        System.out.println("button clicked"); 
    }
    });
    */
   button.addActionListener(this);//to make 2nd way work we have to register our main class as a listener for our button.this keyword used to indicate that the same class is used as a listener
   //otherwise if other class then that class name have to be mentioned.
   
       //DEAFULT LAYOUT FOR FRAME IS BRODER SO FROM LEFT TO RIGHT
        panel.add(label);
         panel.add(textfield);
          panel.add(button);
          frame.add(panel,BorderLayout.CENTER);//DEAFULT LAYOUT FOR FRAME IS FLOW SO WE ARE ADDING IT TO OUR CENTER AREA
}
  public void actionPerformed(ActionEvent e){
        //System.out.println("button clicked"); 
        System.out.println(textfield.getText()); 
    }
public void show(){
      frame.setVisible(true);
  }
  
}
