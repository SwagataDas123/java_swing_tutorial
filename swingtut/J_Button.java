import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.*;
import java.awt.Dimension;
//JButton
public class J_Button
{
   private JFrame frame;
     private JPanel panel;
     private JButton button;
    public J_Button(){
        initialize();
    }
   public void initialize(){
        frame=new JFrame();
         frame.setTitle("JButton Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
    frame.setLocationRelativeTo(null);
    
    panel=new JPanel();
    button=createButton();
    panel.add(button);
    
    frame.add(panel,BorderLayout.CENTER);
}
private JButton createButton(){//config code for button in this method
    JButton button=new JButton("print");//text on button
    button.setFocusable(false);
    ImageIcon printIcon =new ImageIcon("print.jpg");//for graphics on button
    button.setIcon(printIcon);
    button.setIconTextGap(10);//to keep gap between graphics and text
    //button.setMnemonic(KeyEvent.VK_P);//stimulates key from keyboard,VK_P is virtual key 
    button.setToolTipText("some awesome text");//when button is hovered,the text is shown
    button.setFont(new Font("Arial",Font.PLAIN,16));//font,style,size
    button.setMargin(new Insets(10,10,10,10));//setting button margin;Insets(top,right,bottom,left)
    button.addActionListener(new ActionListener(){ //to do something useful when button is clicked
    public void actionPerformed(ActionEvent e){
        System.out.println("print button clicked");
    }
    });
    //button.setEnabled(false);//enable or disable button 
    button.doClick();//programically generate the button click
    //change placement of graphics and text on button
    button.setVerticalTextPosition(SwingConstants.BOTTOM);//putting text at bottom
    button.setHorizontalTextPosition(SwingConstants.CENTER);//center text horizontally
    // button.setVerticalTextPosition(SwingConstants.CENTER);
    //button.setHorizontalTextPosition(SwingConstants.LEFT);//to placee text to left of button
    button.setPreferredSize(new Dimension(200,75));//to set preferred size of button ,width,height
    return button;
}
    
     public void show(){
      frame.setVisible(true);
  }
      
}
