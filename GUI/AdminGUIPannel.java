package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminGUIPannel extends JFrame
{
    private JLabel Title;
    private JButton addBusButton;
    private JButton addRouteButton;
    private JButton deleteRouteButton;
    private JButton Bookings;
    private JButton backButton;
    private JPanel AdminPannel;
    private JButton deleteBusButton;
    private JButton button1;
    private JButton registrationButton;
    private JButton usersButton;

    public AdminGUIPannel()
    {
        Bookings.setFocusable(false);
        addBusButton.setFocusable(false);
        addRouteButton.setFocusable(false);
        deleteBusButton.setFocusable(false);
        deleteRouteButton.setFocusable(false);
        Bookings.setFocusable(false);
        backButton.setFocusable(false);


        add(AdminPannel);
        setBounds(550,200,850,550);
        setTitle("Pakistan Express");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
               new LoginGUI().setVisible(true);
               dispose();
            }
        });
        addBusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
               new AddBusGUIPannel().setVisible(true);
               dispose();
            }
        });
        addRouteButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new AddRouteGUI().setVisible(true);
                dispose();

            }
        });
        Bookings.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new CancellationBookingsGUIAdminPannel().setVisible(true);
                dispose();
            }
        });

        deleteBusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               new DeleteBus().setVisible(true);
               dispose();
            }
        });
        deleteRouteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new DeleteRoute().setVisible(true);
                dispose();

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new AdminBookingGUI().setVisible(true);
                dispose();
            }
        });
        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
                new RegistrationGUI().setVisible(true);
                dispose();
            }
        });
        usersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new UsersAdminGUI().setVisible(true);
                dispose();
            }
        });
        usersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new UsersAdminGUI().setVisible(true);
                dispose();
            }
        });
    }



}


