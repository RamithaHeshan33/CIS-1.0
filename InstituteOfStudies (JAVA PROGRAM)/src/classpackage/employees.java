package classpackage;

public class employees  {
    private String id;
    private String name;
    private String empsal;
    private String empEPF;
    private String empdep;
    private String empdes;
    filesystem filesystem = new filesystem("employeeRecords.txt");
    

    public employees(String id1, String name1, String empdep1, String empsal1, String empEPF1, String empdes1) {
        this.id = id1;
        this.name = name1;
        this.empdep = empdep1;
        this.empsal = empsal1;
        this.empEPF = empEPF1;
        this.empdes = empdes1;
    }
    
    public boolean addEmployee () {
        if(!filesystem.createANewFile())
        {
            String record = id + "," + name + "," + empdep + "," + empsal + "," + empEPF + "," + empdes;
           
            return filesystem.writeDataToFile(record);
        }

        return false;
    }
}
