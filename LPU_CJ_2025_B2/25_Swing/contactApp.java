import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

class Contact {
    String name;
    String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String display() {
        return "Name : " + name + " , Phone : " + phone;
    }

}

public class contactApp {

    ArrayList<Contact> contacts = new ArrayList<>();

    JFrame frame;
    JPanel panel;
    JTextField nameField, phonField;
    JButton addButton;
    JTextArea displayArea;

    contactApp() {
        frame = new JFrame("Contact App");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        frame.add(panel);

        nameField = new JTextField();
        nameField.setBorder(BorderFactory.createTitledBorder("Enter Name"));
        panel.add(nameField);

        phonField = new JTextField();
        phonField.setBorder(BorderFactory.createTitledBorder("Enter Phone"));
        panel.add(phonField);

        addButton = new JButton("Add to contacts");
        panel.add(addButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setBorder(BorderFactory.createTitledBorder("Contacts"));
        panel.add(displayArea);

        addButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phonField.getText();

                if(!name.isEmpty() && !phone.isEmpty()){
                    Contact newContact = new Contact(name, phone);
                    contacts.add(newContact);
    
                    updateDisplay();
                    nameField.setText("");
                    phonField.setText("");
                }else{
                    JOptionPane.showMessageDialog(frame, "Please fill empty fields");
                }

            }
            
        });

        frame.setVisible(true);
    }

    void updateDisplay(){
        StringBuilder sb = new StringBuilder();
        for(Contact c : contacts){
            sb.append(c.display() + "\n");
        }
        displayArea.setText(sb.toString());
    }

    public static void main(String[] args) {
        new contactApp();
        
    }
}
