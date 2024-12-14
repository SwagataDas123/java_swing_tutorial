import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//jlabel is a display area for a short text string or an image or both
public class J_Label
{
    private JFrame frame;
       private JPanel panel;
       private JLabel label;
        private JButton button;
    public J_Label(){
        initialize();
    }
  public void initialize(){
        frame=new JFrame();
         frame.setTitle("JLabel Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
    frame.setLocationRelativeTo(null);
    
    panel =new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    panel.setBackground(Color.GREEN);
    frame.add(panel,BorderLayout.NORTH);
    
    label=new JLabel("My Cool App");//text on label 
    panel.add(label);//adding label to panel
    label.setForeground(Color.WHITE);//setting text color as white
    label.setFont(new Font("Sans-serif",Font.BOLD,50));//setting font on label
    ImageIcon labelIcon =new ImageIcon("print1.png");//for graphics on label
    label.setIcon(labelIcon);
    label.setIconTextGap(10);//set gap betwen text and graphics
    //change placement of graphics and text on button
    label.setHorizontalTextPosition(SwingConstants.CENTER);
    label.setVerticalTextPosition(SwingConstants.BOTTOM);
    
     JButton button=new JButton("update label text");
     button.addActionListener(new ActionListener(){ //to do something useful when button is clicked
    public void actionPerformed(ActionEvent e){//when button clicked,the text onthe label wwill chnage to multi line text
        label.setText("<html>My Cool App <br> Buy it now </html>");//multiline text for the label
    }
    });
     frame.add(button,BorderLayout.SOUTH);  
}
 public void show(){
      frame.setVisible(true);
  }
}