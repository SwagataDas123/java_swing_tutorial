import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
  //Menu bar is the conatiner that conatins all the menu items
  //nmeonics for all users and makes a visible menu item be chosen
  //accelerators for power users and causes a menu item be chosen irrespective of its visibility
public class J_Menu implements ActionListener
{
   private JFrame frame;
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenuItem newMenuItem;
   private JMenuItem saveMenuItem;
   private JMenuItem exitMenuItem;
   
   public J_Menu(){
       initialize();
   }
   private void initialize(){
        frame=new JFrame();
         frame.setTitle("JMenu Demo");
          frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(800,500);
    frame.setLayout(new BorderLayout(10,10));
    frame.setLocationRelativeTo(null);
    
    //change font size for menu and menu item
    Font f =new Font("sans-serif",Font.PLAIN,18);
    UIManager.put("Menu.font",f);
     UIManager.put("MenuItem.font",f);
      UIManager.put("CheckBoxMenuItem.font",f);
       UIManager.put("RadioBoxMenuItem.font",f);
       
       menuBar=new JMenuBar();//menu conatainer
       fileMenu=new JMenu("File");//file menu
       //MNEMONIC is used becuse File word is visible
       fileMenu.setMnemonic(KeyEvent.VK_F);//Key event is a class.The F in File is underlined
       
       //3 menu items
       newMenuItem=new JMenuItem("New....");
       ImageIcon icon=new ImageIcon("new.gif");//for graphics beside the new menu option
       newMenuItem.setIcon(icon);
       newMenuItem.setIconTextGap(10);
       newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));//accleartor used because new menu option is not visible
       newMenuItem.addActionListener(this);
       
       saveMenuItem=new JMenuItem("Save");
        saveMenuItem.setIconTextGap(10);
         saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,ActionEvent.CTRL_MASK));//accleartor used because new menu option is not visible
        saveMenuItem.addActionListener(this);
        
      exitMenuItem =new JMenuItem("Exit");
       exitMenuItem.setIconTextGap(10);
      exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));//accleartor used because new menu option is not visible
      exitMenuItem.addActionListener(this);
       
      //adding objects to file menu
      fileMenu.add( newMenuItem);
        fileMenu.add(saveMenuItem);
          
          fileMenu.add(new JRadioButtonMenuItem("RadioButton"));
          fileMenu.add(new JCheckBoxMenuItem("CheckBox"));
          fileMenu.add(new JMenu("Sub Menu"));//creating sub menu
          
          fileMenu.addSeparator();
          
          fileMenu.add( exitMenuItem);
          
          //adding filemenu to menu bar
           menuBar.add(fileMenu);
           //adding menubar to frame
           frame.setJMenuBar(menuBar);
    
   }
  
    public void actionPerformed(ActionEvent e){
       if(e.getSource() instanceof JMenuItem){
           JMenuItem item=(JMenuItem)e.getSource();
           String text=item.getText();
             System.out.println(text); 
       }
         
    }
   
   public void show(){
      frame.setVisible(true);
  }
   
}
