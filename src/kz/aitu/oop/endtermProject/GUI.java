package kz.aitu.oop.endtermProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI implements ActionListener {

    private static JLabel username;
    private static JTextField userText;
    private static JLabel password;
    private static JPasswordField pswd;
    private static JButton button;
    private static JLabel success;
    private static ImageIcon backg;

    public static void uiMethod(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        username = new JLabel("Username");

        username.setBounds(10,20,80,25);
        panel.add(username);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        password = new JLabel("Password");
        password.setBounds(10,50,80,25);
        panel.add(password);

        pswd = new JPasswordField();
        pswd.setBounds(100,50,165,25);
        panel.add(pswd);

        button = new JButton("Login");
        button.setBounds(140,80,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(100,110,300,25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = pswd.getText();
        System.out.println(user + ", " + pswd );
        if( user.equals("Aidar") && password.equals("228") ){
            success.setText("Login successfully !");
        }
        else{
            success.setText("Incorrect username/password !");
        }
    }

    //backg = new ImageIcon(this.getClass().getResources(/car.jpg))

}