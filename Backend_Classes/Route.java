package Backend_Classes;

public class Route
{
    String Source;
    String Destination;

    public Route()
    {
        Source="";
        Destination="";
    }
    //------------------------------------------------ Getters ----------------------------------------//
    public String getBSource()
    {
        return Source;
    }
    public String getBDestination()
    {
        return Destination;
    }
    //--------------------------------------------- Setters ----------------------------------------//
    public void setBSource(String to) {
        Source = to;
    }
    public void setBDestination(String from)
    {
        Destination = from;
    }
    //---------------------------------------------------------------------------------------------//
}
