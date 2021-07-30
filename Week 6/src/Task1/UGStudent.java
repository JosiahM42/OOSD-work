package Task1;

public class UGStudent extends Student{
    public UGStudent(){
    }
    private String degreeName;
    public UGStudent (String firstName, String lastName, String address, int studentID, String degreeName) {
        super(firstName, lastName, address, studentID);

        this.studentID = studentID;
        this.degreeName = degreeName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getStudentID()
    {
        return studentID;
    }
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
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
                +"\n Student ID is " + getStudentID()
                +"\n Undergraduate Degree is " +  getDegreeName() + "\n";
    }
}
