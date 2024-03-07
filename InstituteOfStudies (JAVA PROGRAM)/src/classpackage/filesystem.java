package classpackage;

import java.io.*;

public class filesystem {
   private static String FILE_PATH = "E:\\WORK\\SEM 02\\OOP\\Files\\";

    File file;
    private String fileName; 
    
    
    public filesystem(String fileName) {
        this.fileName = fileName;
        
        createANewFile();
    }
          
    public boolean createANewFile() {
        try {
            file = new File(FILE_PATH + fileName);
            if (file.createNewFile()){
                System.out.println("File Created: " + file.getName());
                return true;
            }
            
            System.out.println("File Already Exisit !");
            return false;
        }
        
        catch(IOException e) {
            System.out.println("Something went wrong with creating file" + e);
            return false;
        }
    }

    public boolean writeDataToFile(String record) {
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(record);
            bw.newLine();
            bw.close();
            fw.close();

            return true;
        }
        
        catch (IOException e) {
            System.out.println("Something went wrong with writing" + e);
            return false;
        }
    }
    
    

}
