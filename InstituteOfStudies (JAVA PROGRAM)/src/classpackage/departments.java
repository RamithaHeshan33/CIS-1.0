package classpackage;

public class departments {
    private String id;
    private String name;
    private String emp;
    private String com;
    private String number;
    filesystem filesystem = new filesystem("departmentRecords.txt");

    public departments(String id, String name, String emp, String com, String number) {
        this.id = id;
        this.name = name;
        this.emp = emp;
        this.com = com;
        this.number = number;
    }
    
    public boolean addDepartment () {
        if(!filesystem.createANewFile())
        {
            String record = id + "," + name + "," + emp + "," + com + "," + number;
           
            return filesystem.writeDataToFile(record);
        }

        return false;
    }
    
    
}
