package classpackage;

public class designations {
    private String id;
    private String name;
    private String qua;
    private String allo;
    private  String salary;
    filesystem filesystem = new filesystem("designationRecords.txt");

    public designations(String id, String name, String qua, String allo, String salary) {
        this.id = id;
        this.name = name;
        this.qua = qua;
        this.allo = allo;
        this.salary = salary;
    }

    public boolean addDesignation () {
        if(!filesystem.createANewFile())
        {
            String record = id + "," + name + "," + qua + "," + allo + "," + salary;
           
            return filesystem.writeDataToFile(record);
        }

        return false;
    }
}
