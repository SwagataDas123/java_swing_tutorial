import javax.swing.SwingUtilities;
//JFrame has a default layout as border layout
public class JFrameDemo
{
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               JFrameOne frame1=new JFrameOne();
               JFrameTwo frame2=new JFrameTwo();
           }
       });
    }
}
