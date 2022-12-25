package Backend_Classes;

public class Admin
{
     String Username;
     String Password;


    public Admin()
    {
        Username="Hamza";
        Password="12";
    }

    public String getUsername()
    {
        return Username;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setUsername(String username)
    {
        Username = username;
    }

    public void setPassword(String password)
    {
        Password = password;
    }
}
