package QuanLyCuaHang.GUI;
import doanquanlycuahang.MyConnect;

import javax.print.attribute.standard.DialogOwner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    private JFrame frame;
    private JTextField usernameField;
    private MyConnect myConnect;

    public LoginForm() {
        myConnect = new MyConnect();

        frame = new JFrame("Login Form");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {

        panel.setLayout(null);

        // ...

    JLabel userLabel = new JLabel("Phone Number");
    userLabel.setBounds(10, 10, 80, 25);
    panel.add(userLabel);

    usernameField = new JTextField(20);
    usernameField.setBounds(100, 10, 160, 25);
    panel.add(usernameField);

    // Remove password field...

    JButton loginButton = new JButton("login");
    loginButton.setBounds(10, 40, 80, 25);
    panel.add(loginButton);

    loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String phoneNumber = usernameField.getText();
            String role = myConnect.login(phoneNumber);
            if (role != null) {
                JOptionPane.showMessageDialog(frame, "Login successful. Role: " + role);
                frame.dispose(); // Close the login form
                new DatMonAnGUI(role).setVisible(true); // Open the DatMonAnGUI form
            } else {
                JOptionPane.showMessageDialog(frame, "Login failed.");
            }
        }
    });

    }

    public static void main(String[] args) {
        new LoginForm();
    }
}