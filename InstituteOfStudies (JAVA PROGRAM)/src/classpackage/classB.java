
package classpackage;

import java.io.File;
import java.io.IOException;



public class classB implements files{ // inehrite interfaces - implements
    File myFile = new File("E:\\WORK\\SEM 02\\OOP\\Files\\adminUsername&password.txt");
    
    public void adminfile(){
        try {
            
            if (myFile.createNewFile()) {
                System.out.println("File created:" + myFile.getName());
                
            }
            
            else {
                System.out.println("File already exists.");
                
            }
        }
        
        catch(IOException ex ) {
          System.err.println("An error occurred creating file"+ex);
        }
    }
    
    public void hrfile() {
        try {
            File HRFile = new File("E:\\WORK\\SEM 02\\OOP\\Files\\HRemployeeRecords.txt");
            if (HRFile.createNewFile()) {
                System.out.println("File created:" + HRFile.getName());

            }

            else {
                System.out.println("File already exists.");
            }
        }

        catch (Exception ex) {
            System.err.println("An error occurred creating file"+ex);
        }
    }
}
