import java.time.LocalDate;

public class Employee extends Person{

    private int hireDate;
    protected String companyName;
    protected double sallary;

    public Employee(String firstName, String lastName, int birthdayYear) {
        super(firstName, lastName, birthdayYear);
        this.sallary=sallary;
        this.hireDate=hireDate;
        this.companyName=companyName;
    }


    int getJobSeniority(){
        return LocalDate.now().getYear() - hireDate;
    }
    double getSallary(){
        return sallary;
    }
}
