import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.event.KeyEvent;
public class JCheck_Box
{
      private JFrame frame;
    private JPanel panel;
    private JCheckBox checkBox;
    
    public  JCheck_Box(){
        initialize();
    }
     private void initialize(){
          frame=new JFrame();
         frame.setTitle("JCheckBox Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
    frame.setLayout(new BorderLayout(10,10));
    frame.setLocationRelativeTo(null);
    
    //change font size for menu and menu item
    Font f =new Font("sans-serif",Font.PLAIN,18);
    UIManager.put("Menu.font",f);
      UIManager.put("CheckBox.font",f);
     
      panel=new JPanel();
      checkBox=new JCheckBox();//checkbox
      checkBox.setText("Checkbox");
      System.out.println(checkBox.getText());//getting the text on checkbox
      checkBox.setMnemonic(KeyEvent.VK_C);//adding mneomonic to enable us to use keyboard for selecting or deselecting the checkbox.Key event is a class.The C in CheckBox is underlined
      panel.add(checkBox);//adding checkbox to jpanel
      frame.add(panel);
        }
     public void show(){
      frame.setVisible(true);
  }
}
