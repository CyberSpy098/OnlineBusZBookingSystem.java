package Backend_Classes;

import GUI.WelcomeGUI;
import HelpingClasses.*;


//Class Main
public class Main
{
    public static void main(String[] args)
    {
        HelpingAddRouteClass.Routefill();
        HelpingAddBusClass.fill();
        HelpingTicketBookingClass.Ticketfill();
        HelpingCancelTicket.Ticketfill();
        HelpingRegistration.indexfill();

        //Welcome Screen
        new WelcomeGUI().setVisible(true);

    }
}
