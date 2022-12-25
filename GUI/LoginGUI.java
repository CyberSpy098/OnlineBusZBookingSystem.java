package GUI;

import HelpingClasses.HelpingAdminLogin;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class LoginGUI extends JFrame
{
    private JTextField Usernamefield1;
    private JLabel Username;
    private JPanel Loginpannel;
    private JButton Login;
    private JPasswordField passwordField1;
    private JLabel WrongPassField;
    private JButton backButton;
    private JLabel Password;


    public LoginGUI()
    {
        Login.setFocusable(false);
        backButton.setFocusable(false);
        add(Loginpannel);
        setBounds(550,200,850,550);
        Border line = BorderFactory.createLineBorder(Color.white);
        Username.setBorder(line);
        Password.setBorder(line);
        setTitle("Pakistan Express");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        Login.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {

                if (Objects.equals(HelpingAdminLogin.getAdminUserName(), Usernamefield1.getText()) && Objects.equals(HelpingAdminLogin.getAdminPass(),passwordField1.getText()))
                {
                   new AdminGUIPannel().setVisible(true);
                   dispose();
                }
                else if (Usernamefield1.getText().equals("") || passwordField1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(Loginpannel, " Please fill all details!");
                }
                else
                {
                    JOptionPane.showMessageDialog(Login, "Username/ Password incorrect!");
                }




            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new WelcomeGUI().setVisible(true);
                dispose();
            }
        });
    }

}
