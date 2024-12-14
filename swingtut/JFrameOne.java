import javax.swing.JFrame;
//first way to create jframe class but showing all parts to outside world
public class JFrameOne extends JFrame
{
public JFrameOne(){
    initialize();
}
public void initialize(){
    setTitle("JFrameOne");
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setSize(500,400);//if no deafult size specified the window is resizable duirng the program run but iif we dont want that then set setResizable to false
    setResizable(false);
    setVisible(true);
    setLocationRelativeTo(null);//it centers the jframe on screen when no 
}
}
