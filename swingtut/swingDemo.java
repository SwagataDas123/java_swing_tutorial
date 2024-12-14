import javax.swing.*;
import java.awt.FlowLayout;//to use the flow layout(flow layout makes everything center align in screen but with grid layout we can place anything anywhere

public class swingDemo
{
  public static void main(String args[])
  {//inside frame everything is there
      JFrame f=new JFrame("User Form");//user form is the name of the frame 
      f.setVisible(true);//by deafult everything inside a frame is set invisible but setVisible if set to true can make everything visible and since deafult is false it sets to invisible
      f.setSize(800,400);//setSize(width,height)
      
      //using the flow layout and not card layout
      f.setLayout(new FlowLayout());
      
      //the code below until f.add(t1) uses card layout so label is displayed first and then text field behind it so we cant see the text field as in a stack of cards where each card is a component
      JLabel l1=new JLabel("User Name :");//setting first label object
      f.add(l1);//adding the component label to the frame ( add(name of component))
      JTextField t1=new JTextField(20);//add text field for label l1 (JTextField(no of characters))
      f.add(t1);
      
      JLabel l2=new JLabel("Password :");//setting second label object
      f.add(l2);//adding the component label to the frame ( add(name of component))
      JTextField t2=new JTextField(20);//add text field for label l2 (JTextField(no of characters))
      f.add(t2);
      
      JButton b=new JButton("Submit");
      f.add(b);
      
      
  }
}
