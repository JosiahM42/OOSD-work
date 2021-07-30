package Task1;

public class Student extends Person{
    public Student(){
    }
    public int studentID;
    public Student (String firstName, String lastName, String address, int studentID) {
        super(firstName, lastName, address);

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.studentID = studentID;
    }

    public int getStudentID()
    {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student's name is " + getFirstName() +" "+
                getLastName() +"\n Address is "+ getAddress()
                +"\n Student ID is " + getStudentID() + "\n";
    }
}
