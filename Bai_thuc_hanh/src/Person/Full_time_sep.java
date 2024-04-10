package Person;

public class Full_time_sep extends Employee{
    public Full_time_sep(String name){
        this.name = name;
    }

    public String typeOfEmp(){
        return "Boss";
    }

    public void calculateSalary(){
        salary = Configs.luong_nhan_vien_fulltime_sep;
    }
}
