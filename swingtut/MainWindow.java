import javax.swing.JFrame;
public class MainWindow
{
  private JFrame window;
  public MainWindow(){
      window=new JFrame();
      window.setTitle("Hello world");
      window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//default operation is now set to close the window when we click the cross
      window.setSize(800,600);//set size
      window.setLocationRelativeTo(null);//to center the window
  }
  public void show(){
      window.setVisible(true);
  }
}
