package Backend_Classes;

public class TicketBookingCustomer
{
    String Name;
    String FatherName;
    String CNIC;
    String Phone_Number;
    String From;
    String To;
    String date;
    String time;

    public TicketBookingCustomer()
    {
        Name="";
        FatherName="";
        CNIC="";
        Phone_Number="";
        From="";
        To="";
        From="";
        To="";
        date="";
        time="";
    }
    //---------------------------------------------------------------- Setters ----------------------------------------------------//
    public void setName(String name)
    {
        Name = name;
    }

    public void setFatherName(String fatherName)
    {
        FatherName = fatherName;
    }

    public void setCNIC(String CNIC)
    {
        this.CNIC = CNIC;
    }

    public void setPhone_Number(String phone_Number)
    {
        Phone_Number = phone_Number;
    }

    public void setFrom(String from)
    {
        From = from;
    }

    public void setTo(String to)
    {
        To = to;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    //--------------------------------------------------   Getters   -----------------------------------------------------------//
    public String getName() {
        return Name;
    }

    public String getFatherName() {
        return FatherName;
    }

    public String getCNIC() {
        return CNIC;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public String getFrom() {
        return From;
    }

    public String getTo() {
        return To;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    //------------------------------------------------------------------------------------------------------------//
}
