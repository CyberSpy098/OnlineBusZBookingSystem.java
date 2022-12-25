package HelpingClasses;

import Backend_Classes.Bus;

public class HelpingAddBusClass
{

    //Creating Object of Bus Class
    public static Bus Data[] =new Bus[20];
    private static int Counter=0;

    public static void fill()
    {
        for(int i=0;i<20;i++)
        {
            Data[i]=new Bus();
            Data[i].setName("");
            Data[i].setModel("");
            Data[i].setRegistrationNo("");
        }
    }


    //Counters
    public static int getcounter()
    {
        return Counter;
    }
    public static void addCounter()
    {
        Counter += 1;
    }
    public static void DeleteCounter()
    {
        Counter -= 1;
    }

    //------------------------------------------------ Getters ----------------------------------------//
    public static String getName(int p)
    {
        return Data[p].getName();
    }

    public static String getModel(int p)
    {
        return Data[p].getModel();
    }
    public static String getRegistrationNO(int p)
    {
        return Data[p].getRegistrationNo();
    }
    //-------------------------------------------------- Setters -------------------------------------------------//
    public static void setName(String Name,int p)
    {
       Data[p].setName(Name);
    }

    public static void setModel(String model,int p)
    {
       Data[p].setModel(model);
    }

    public static void setRegistrationNO(String regno,int p){Data[p].setRegistrationNo(regno);}

    //-------------------------------------------------------------------------------------------------------------//


    public static void DeleteBus(int P)
    {

        Data[P].setName("");
        Data[P].setModel("");
        Data[P].setRegistrationNo("");

        for (int i = P; i < Counter; i++)
        {
           Data[i].setName(getName(i+1));
           Data[i].setModel(getModel(i+1));
           Data[i].setRegistrationNo(getRegistrationNO(i+1));
        }

        DeleteCounter();
    }

}
