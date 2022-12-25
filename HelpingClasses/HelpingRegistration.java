package HelpingClasses;

import Backend_Classes.User_Registration;

public class HelpingRegistration
{
    private static User_Registration registration[]=new User_Registration[8];
    private static int registerCount=0;

    private static int Index;
    public static int getRegisterCount()
    {
        return registerCount;
    }
    public static void AddRegisterCount()
    {
        registerCount+=1;
    }
    public static void RemoveRegister()
    {
        registerCount-=1;
    }

    public static void indexfill() {
        for (int i = 0; i < 8; i++) {
            registration[i] = new User_Registration();
            registration[i].setName("");
            registration[i].setPassword("");
            registration[i].setAddress("");
            registration[i].setContact("");
            registration[i].setEmail("");
        }
    }
    public static void DeleteRegister(int reg) {

        registration[reg].setName("");
        registration[reg].setAddress("");
        registration[reg].setEmail("");
        registration[reg].setContact("");
        registration[reg].setPassword("");

        for (int i = reg; i < registerCount; i++)
        {
            registration[i].setName(getRName(i + 1));
            registration[i].setPassword(getRPassword(i + 1));
            registration[i].setContact(getRContact(i + 1));
            registration[i].setAddress(getRAddress(i + 1));
        }

        RemoveRegister();
    }

    //---------------------------------------------------- Getters ---------------------------------------//
    public static String getRName(int i) {
        return registration[i].getName();
    }

    public static String getRPassword(int index) {
        return registration[index].getPassword();
    }

    public static String getRAddress(int index) {

        return registration[index].getAddress();
    }

    public static String getRContact(int index) {

        return registration[index].getContact();
    }
    public static String getREmail(int index) {

        return registration[index].getEmail();
    }
    public static int getIndex(int i)
    {
        return Index=i;
    }

    //---------------------------------------------------- Getters ---------------------------------------//
    public static void setRName(String name, int  index) {
       registration[index].setName(name);
    }

    public static void setRPassword(String password, int  index) {
        registration[index].setPassword(password);
    }

    public static void setRAddress(String address, int  index) {

        registration[index].setAddress(address);
    }

    public static void setRContact(String contact, int  index) {

       registration[index].setContact(contact);
    }
    public static void setREmail(String contact, int  index) {

        registration[index].setEmail(contact);
    }
    public static void setIndex(int index)
    {
        Index=index;
    }

}
