public class Student extends Person {
    private String Program;
    private int Year;

    public Student(String Name, String Address, String Program, int Year) {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
    }

    //setters
    public void setProgram(String Program) {
        this.Program = Program;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    //getters
    public String getProgram() {
        return Program;
    }

    public int getYear() {
        return Year;
    }

    public String toString(){
        return "Hello I am " + Name + " I lived in " + Address + ". I am " + Year + " year of " + Program + ".";
    }

    
}