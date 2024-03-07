package classpackage;

public class admin {
    private String username;
    private String Password;
    
        
    filesystem filesystem = new filesystem("adminUsername&password.txt");

    public admin(String username, String Password) {
        this.username = username;
        this.Password = Password;
    }


    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean addadmin() {
        if(!filesystem.createANewFile())
        {
            String record = username + " " + Password;
           
            return filesystem.writeDataToFile(record);
        }

        return false;
    }

    
}
