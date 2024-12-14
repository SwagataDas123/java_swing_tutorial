import java.awt.EventQueue;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
//Look and Feel (L&F) defines the appearance and behavior of the graphical user interface (GUI) components in a Java Swing application.
//It determines how buttons, menus, text fields, and other GUI elements are styled and behave visually.
//Nimbus is one of the built-in Look and Feel implementations in Java Swing.
//It offers a clean, modern, and professional UI style with smooth gradients, rounded corners, and better spacing between components.
//It determines how buttons, menus, text fields, and other GUI elements are styled and behave visually.
public class LauncherNimbus {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {// Swing components are not thread-safe, meaning they can behave unpredictably if accessed from multiple threads.
//All GUI-related code (like creating windows, buttons, etc.) must run on the Event Dispatch Thread (EDT) to avoid issues like race conditions.
//EventQueue.invokeLater() ensures the provided code runs on the EDT.
            try {
               //UIManager.getInstalledLookAndFeels() returns a list of all available Look and Feels installed with your Java runtime.
//The code iterates through this list to find a Look and Feel named Nimbus.
//If Nimbus is found, UIManager.setLookAndFeel() applies it by setting its class name.
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception e) {//If Nimbus is not available, or if any error occurs while setting the Look and Feel, the catch block ensures the program doesn’t crash.
//It prints the stack trace of the error for debugging.
                e.printStackTrace();
            }

            // Initialize your application (replace with actual application logic)
            nimbus_look_feel main=new nimbus_look_feel();//This part launches the main application.
//nimbus_look_feel is likely a class (not defined here) responsible for creating and displaying your application's GUI.
             main.show();
        });
    }
}

