package classpackage;

public class ManagersAsisstants {
    private String id; 
    private String name;
    private String salary;
    private String dob;
    private String number;
    private String position;
    filesystem filesystem = new filesystem("HRemployeeRecords.txt");
    
    
    public ManagersAsisstants(String id1, String name1, String salary1, String dob1, String number1, String position1) {
        this.id = id1;
        this.name = name1;
        this.salary = salary1;
        this.dob = dob1;
        this.number = number1;
        this.position = position1;
            
    }
    
    public boolean addManagerOrAsisstant () {
        if(!filesystem.createANewFile())
        {
            String record = id + "," + name + "," + salary + "," + dob + "," + number + "," + position;
           
            return filesystem.writeDataToFile(record);
            
            
        }

        return false;
    }

}
