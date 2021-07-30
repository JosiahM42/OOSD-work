package Task1;

public class Head extends Lecturer{
    public Head(){
    }
    private String HOD;
    public Head (String firstName, String lastName, String address, int lecturerID, String HOD) {
        super(firstName, lastName, address, lecturerID);

        this.HOD = HOD;
        this.lecturerID = lecturerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getHOD() {
        return HOD;
    }

    public void setHOD(String HOD) {
        this.HOD = HOD;
    }

    public int getLecturerID()
    {
        return lecturerID;
    }
    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
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
        return "Lecturer's name is " + getFirstName() +" "+
                getLastName() +"\n Address is "+ getAddress()
                +"\n Lecturer ID is " + getLecturerID() +"Head of the " + getHOD() +"department" + "\n";
    }
}
