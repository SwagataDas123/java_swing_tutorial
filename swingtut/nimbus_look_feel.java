import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//look of an appplication --> apperance
//feel of an application -->how widgets behave
public class nimbus_look_feel
{
     private JFrame frame;
       private JPanel panel;
       private JLabel label;
        private JTextField textfield;
    public nimbus_look_feel(){
        initialize();
    }
  public void initialize(){
        frame=new JFrame();
         frame.setTitle("JTextField Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
    frame.setLocationRelativeTo(null);
    ImageIcon icon =new ImageIcon("print2.jpg");//for graphics 
    frame.setIconImage(icon.getImage());
    
     panel =new JPanel();
     panel.setLayout(new FlowLayout());
    panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    
    //start of text field
    textfield=createJTextField();
    panel.add(textfield);
    
     label=new JLabel("");//text on label 
     label.setFont(new Font("Arial",Font.BOLD,25));
    panel.add(label);
    frame.add(panel,BorderLayout.CENTER);
    
}
public void show(){
      frame.setVisible(true);
  }
  
  public JTextField createJTextField(){
      
    JTextField textField=new JTextField(10);
    textField.setFont(new Font("Arial",Font.BOLD,25));
    textField.setForeground(Color.RED);
    textField.setBackground(Color.YELLOW);
    textField.setToolTipText("enter some text");//shows text when hovered
    textField.setMargin(new Insets(5,10,5,10));
    textField.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
        label.setText(textField.getText());//take the text entered into the label when this methods is called as enter button is clicked
        textField.setText("enter more text");
    }
    });
    
    return textField;
  }
}
