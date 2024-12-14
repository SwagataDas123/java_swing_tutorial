import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//JPassword lets edit a single line of text where the view indicates something was typed but doesnt show the original charcaters
public class JPass_word
{
    private JFrame frame;
    private JPanel panel;
       private JLabel label;
        private JPasswordField passwordField;
        private JButton button;
      public JPass_word(){
        initialize();
    }
  public void initialize(){
        frame=new JFrame();
         frame.setTitle("JPassword Field Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(500,300);
    frame.setLayout(new BorderLayout(10,10));
    frame.setLocationRelativeTo(null);
    
    FlowLayout layout=new FlowLayout();
    layout.setAlignment(FlowLayout.LEFT);
    layout.setHgap(10);
    layout.setVgap(10);
    
    frame.setLayout(layout);
    label=new JLabel("enter password");
    passwordField=new JPasswordField(10);
  // passwordField.setText("let me come in"); //setting value for pass word field
    passwordField.setEchoChar('#');//we can set our own echo charcter if we dont like deafult one(*)
    button=new JButton("check");
    
    button.addActionListener(new ActionListener(){ 
    public void actionPerformed(ActionEvent e){
        char[] pf=passwordField.getPassword();//puts the password into a character array
        String value=new String(pf);//converting character array to string
         System.out.println("password:"+value); 
    }
    });
    
    frame.add(label);
    frame.add(passwordField);
    frame.add(button);
    
}
public void show(){
      frame.setVisible(true);
  }
}
