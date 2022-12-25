package HelpingClasses;

import Backend_Classes.Admin;

public class HelpingAdminLogin
{

    private static Admin admin=new Admin();

    //--------------------------------------------- Setters ----------------------------------------//
    public static String getAdminUserName()
    {
        return admin.getUsername();
    }

    public static String getAdminPass()
    {
        return admin.getPassword();
    }

    public static void setAdminUserName(String Username)
    {
        admin.setUsername(Username);
    }

    public static void setAdminPass(String Password)
    {
       admin.setPassword(Password);
    }

    //---------------------------------------------------------------------------------------------//
}
