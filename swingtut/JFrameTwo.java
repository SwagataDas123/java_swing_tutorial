import javax.swing.JFrame;
//second way to create jframe class but not showing all parts to outside world
public class JFrameTwo
{
    private JFrame frame;
    public JFrameTwo(){
        initialize();
    }
    public void initialize(){
        frame=new JFrame();
         this.frame.setTitle("JFrameTwo");//this.frame. is important becuse jframetwo doesnt descend from jframe class so refercing to private variable
    this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.frame.setSize(500,400);//if no deafult size specified the window is resizable duirng the program run but iif we dont want that then set setResizable to false
    this.frame.setResizable(false);
    this.frame.setVisible(true);
    this.frame.setLocationRelativeTo(null);//it centers the jframe on screen when no 
    }
}
