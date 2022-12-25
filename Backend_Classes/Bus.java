package Backend_Classes;

public class Bus
{
    String Name;
    String Model;
    String registrationNo;

    //Constructor
    public Bus()
    {
        Name="";
        Model="";
        registrationNo="";
    }
//------------------------------------------------ Getters ----------------------------------------//
    public String getName()
    {
        return Name;
    }

    public String getModel()
    {
        return Model;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    //--------------------------------------------- Setters ----------------------------------------//
    public void setName(String name)
    {
        Name = name;
    }

    public void setModel(String model)
    {
        Model = model;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }
}
