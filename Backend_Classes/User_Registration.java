package Backend_Classes;

public class User_Registration
{
    String Name;
    String Contact;
    String Address;
    String Email;
    String Password;

    public User_Registration()
    {
        Name="";
        Contact="";
        Address="";
        Email="";
        Password="";
    }

    //------------------------------------------------ Getters ----------------------------------------//

    public String getName() {
        return Name;
    }

    public String getContact() {
        return Contact;
    }

    public String getAddress() {
        return Address;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }
    //------------------------------------------------ Setters ----------------------------------------//

    public void setName(String name) {
        Name = name;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
