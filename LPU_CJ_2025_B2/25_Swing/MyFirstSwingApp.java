import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;;

public class MyFirstSwingApp {
    public static void main(String[] args) {
        //Create the main window
        JFrame frame = new JFrame("Swing App");
        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when i click cross button, app closes

        JPanel panel = new JPanel(); //this panel will hold the components
        frame.add(panel);


        panel.setLayout(new FlowLayout(FlowLayout.LEFT));


        JButton button = new JButton("Click me");
        panel.add(button);

        JLabel label = new JLabel("Click the button!");
        panel.add(label);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                label.setText("Button Clicked");
            }
            
        });


        frame.setVisible(true);
    }
}
