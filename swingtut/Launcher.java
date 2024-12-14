import javax.swing.SwingUtilities;
//to run any sepcific class in other file comment out all the other objects of other classes
public class Launcher
{
   public static void main(String[] args)
   {
       SwingUtilities.invokeLater(new Runnable(){
           public void run(){
               MainWindow main=new MainWindow();
               main.show();
                MainFrame main1=new MainFrame();
               main1.show();
                 Border_Layout main2=new Border_Layout();
               main2.show();
               Flow_Layout main3=new Flow_Layout();
               main3.show();
                Grid_Layout main4=new Grid_Layout();
               main4.show();
               J_Button main5=new J_Button();
               main5.show();
               J_Label main6=new J_Label();
               main6.show();
                JText_Field main7=new  JText_Field();
                main7.show();
                Action_Listener main8=new Action_Listener();
                main8.show();
                JPass_word main9=new JPass_word();
                main9.show();
                J_Menu main10=new J_Menu();
                main10.show();
                JCheck_Box main11=new JCheck_Box();
                main11.show();
           }
       });
   }
}
