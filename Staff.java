public class Staff extends Person {
    private String School;
    private Double Salary;

    public Staff (String Name, String Address, String School, Double Salary) {
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }

    //setters
    public void setSchool(String School) {
        this.School = School;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    //getters
    public String getSchool() {
        return School;
    }

    public Double getSalary() {
        return Salary;
    }

    public String toString(){
        return "Hello I am " + Name + " I lived in " + Address + ". I work in " + School + " and my salary is " + Salary + ".";
    }
    
}