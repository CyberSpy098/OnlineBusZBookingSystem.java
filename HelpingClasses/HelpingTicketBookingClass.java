package HelpingClasses;

import Backend_Classes.TicketBookingCustomer;

public class HelpingTicketBookingClass
{
    public static TicketBookingCustomer Book[] =new TicketBookingCustomer[20];
    private static int Ticket=0;

    public static void Ticketfill()
    {
        for(int i=0;i<20;i++)
        {
            Book[i]=new TicketBookingCustomer();
            Book[i].setName("");
            Book[i].setFatherName("");
            Book[i].setCNIC("");
            Book[i].setPhone_Number("");
            Book[i].setTo("");
            Book[i].setFrom("");
        }
    }

    public static int getTicket()
    {
        return Ticket;
    }
    public static void addTicket()
    {
        Ticket += 1;
    }
    public static void DeleteTicket()
    {
         Ticket-= 1;
    }

    //-------------------------------------------------- Setters -------------------------------------------------//
    public static void setName(String Name,int T)
    {
        Book[T].setName(Name);
    }
    public static void setFatherName(String fatherName,int T)
    {
        Book[T].setFatherName(fatherName);
    }

    public static void setCNIC(String CNIC, int T)
    {
        Book[T].setCNIC(CNIC);
    }

    public static void setPhone_Number(String phone_Number,int T)
    {
       Book[T].setPhone_Number(phone_Number);
    }

    public static void setFrom(String from,int T)
    {
       Book[T].setFrom(from);
    }

    public static void setTo(String to,int T)
    {
        Book[T].setTo(to);
    }

    public static void setDate(String date,int T){Book[T].setDate(date);}

    public static void setTime(String time,int T){Book[T].setTime(time);}
    //-------------------------------------------------------------------------------------------------------------//

    public static String getName(int T)
    {
        return Book[T].getName();
    }
    public static String getFatherName(int T)
    {
        return Book[T].getFatherName();
    }

    public static String getCNIC(int T)
    {
        return Book[T].getCNIC();
    }

    public static String getPhone_Number(int T)
    {
        return Book[T].getPhone_Number();
    }

    public static String getFrom(int T)
    {
        return Book[T].getFrom();
    }

    public static String getTo(int T)
    {
        return Book[T].getTo();
    }

    public static String getDate(int T){return Book[T].getDate();}

    public static String getTime(int T){return Book[T].getTime();}

    //-----------------------------------------------------------------------------------------------------------------//
    public static void CancelBooking(int T)
    {

        HelpingCancelTicket.setName(Book[T].getName(),HelpingCancelTicket.getTicket());
        HelpingCancelTicket.setFatherName(Book[T].getFatherName(),HelpingCancelTicket.getTicket());
        HelpingCancelTicket.setCNIC(Book[T].getCNIC(),HelpingCancelTicket.getTicket());
        HelpingCancelTicket.setPhone_Number(Book[T].getPhone_Number(),HelpingCancelTicket.getTicket());
        HelpingCancelTicket.setTo(Book[T].getTo(),HelpingCancelTicket.getTicket());
        HelpingCancelTicket.setFrom(Book[T].getFrom(),HelpingCancelTicket.getTicket());


       Book[T].setName("");
       Book[T].setFatherName("");
       Book[T].setCNIC("");
       Book[T].setPhone_Number("");
       Book[T].setTo("");
       Book[T].setFrom("");

        for (int i = T; i < Ticket; i++)
        {
            Book[i].setName(getName(i+1));
            Book[i].setFatherName(getFatherName(i+1));
            Book[i].setCNIC(getCNIC(i+1));
            Book[i].setPhone_Number(getPhone_Number(i+1));
            Book[i].setTo(getTo(i+1));
            Book[i].setFrom(getFrom(i+1));
        }
        DeleteTicket();
    }

}
