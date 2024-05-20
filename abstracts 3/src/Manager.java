public class Manager extends Employee{

    protected double bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double sallary,double bonus ) {
        super(firstName, lastName, birthdayYear);
        this.bonus=bonus;
    }

    @Override
    double getSallary() {
        return super.getSallary() + bonus;
    }

    @Override
    public String toString() {
        return "manager with last name "+ getLastName() +" and age "+getAge() +" has a sallary "+ getSallary();
    }
}
