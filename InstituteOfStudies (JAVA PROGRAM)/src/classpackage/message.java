package classpackage;

import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.Icon;
import javax.swing.JOptionPane;




public class message {
    
    private String username;
    private String password;
    public String username1;
    public String password1;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    void message () { //no parameters
        JOptionPane.showMessageDialog(null, "Fields can't be blank",
        "Login form", JOptionPane.ERROR_MESSAGE);
    }
    
    void wrongloginmes() {
        JOptionPane.showMessageDialog(null, "Wrong Username or Password.", 
        "Login form", JOptionPane.ERROR_MESSAGE);
    }
    
    void assistantcantlogmanageracc() {
        JOptionPane.showMessageDialog(null, "Asisstants can't log into the Managers Workspace", 
        "Login form", JOptionPane.ERROR_MESSAGE);
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    void message (String empsuc) { //one parameter
        Icon icon = new javax.swing.ImageIcon(getClass().getResource
        ("/instituteofstudies/check.png"));
        JOptionPane.showMessageDialog(null, "Successfully added an employee", 
        "Manage Employees form",HEIGHT, icon);
    }
    
    void empmes() {
        JOptionPane.showMessageDialog(null,"Field can't be blank ",
        "Manage Employees form",JOptionPane.ERROR_MESSAGE);
    }
    
    void unique() {
        JOptionPane.showMessageDialog(null, "User ID must be unique",
        "Manage Employees form", JOptionPane.ERROR_MESSAGE);
    }
    
    void refreshbtn() {
        JOptionPane.showMessageDialog(null, "You have to press the REFRESH button",
        "Manage Employees form", JOptionPane.ERROR_MESSAGE);
    }
    
    void nouser() {
        JOptionPane.showMessageDialog(null, "No User in the database", 
        "Manage Employees form",JOptionPane.ERROR_MESSAGE);
    }
    
    void refreshed() {
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/check.png"));
        JOptionPane.showMessageDialog(null, "Refreshed!! Please Enter Details For Search!!", 
        "Manage Employees form",HEIGHT, icon);
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    void empmesdepartment() {
        JOptionPane.showMessageDialog(null,"Field can't be blank ",
        "Manage Departments form",JOptionPane.ERROR_MESSAGE);
    }
    
    void uniquedep() {
        JOptionPane.showMessageDialog(null, "User ID must be unique",
        "Manage Departments form", JOptionPane.ERROR_MESSAGE);
    }
    
    void errstoredep() {
        JOptionPane.showMessageDialog(null, "Something went wrong in data storing",
        "Manage Departments form", JOptionPane.ERROR_MESSAGE);
    }
    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    void empmesdesignation() {
        JOptionPane.showMessageDialog(null,"Field can't be blank ",
        "Manage Designations form",JOptionPane.ERROR_MESSAGE);
    }
    
    void uniquedes() {
        JOptionPane.showMessageDialog(null, "User ID must be unique",
        "Manage Designations form", JOptionPane.ERROR_MESSAGE);
    }
    
    void errstoredes() {
        JOptionPane.showMessageDialog(null, "Something went wrong in data storing",
        "Manage Designations form", JOptionPane.ERROR_MESSAGE);
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    void empmesregform() {
        JOptionPane.showMessageDialog(null,"Field can't be blank ",
        "Register form",JOptionPane.ERROR_MESSAGE);	
    }
    
    void passwordlessthan3() {
        JOptionPane.showMessageDialog(null, "Password must have 3 characters", 
        "Register Form",JOptionPane.ERROR_MESSAGE);
    }
    
    void confpass() {
        JOptionPane.showMessageDialog(null, "Password and Confirm Password should match",
        "Register Form",JOptionPane.ERROR_MESSAGE);
    }
    
    void regsuc() {
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/instituteofstudies/check.png"));
        JOptionPane.showMessageDialog(null, "Registration is Successful", 
        "Register Form", HEIGHT, icon);
    }
    
    void regfail() {
        JOptionPane.showMessageDialog(null, "Something went wrong in data storing",
        "Register Form", JOptionPane.ERROR_MESSAGE);
    }
}


