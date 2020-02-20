import java.time.LocalDate;

public class Employee {
    private String empName;
    private String empPhone;
    private LocalDate empBirthDate;

    public Employee(){ //Default Constructor
        this.empName = "Mickey Mouse";
        this.empPhone = "800-see-disney";
        this.empBirthDate = LocalDate.of(1925, 12, 01);
    }

    public Employee(String nm, String ph, LocalDate bd){
        setEmpName(nm);
        setEmpPhone(ph);
        setEmpBirthDate(bd);
    }
    public void setEmpBirthDate(LocalDate bd) {
        this.empBirthDate = bd;
    }
    public LocalDate getEmpBirthDate(){
        return empBirthDate;
    }
    public void setEmpPhone(String ph) {
        this.empPhone = ph;
    }
    public String getEmpPhone(){
        return empPhone;
    }
    public void setEmpName(String nm) {
        this.empName = nm;
    }
    public String getEmpName() {
        return empName;
    }
}
