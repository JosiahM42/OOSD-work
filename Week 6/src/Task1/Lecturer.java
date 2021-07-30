package Task1;

public class Lecturer extends Person {
    public Lecturer(){
    }
    public int lecturerID;
    public Lecturer (String firstName, String lastName, String address, int lecturerID) {
        super(firstName, lastName, address);

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.lecturerID = lecturerID;
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
                +"\n Lecturer ID is " + getLecturerID() + "\n";
    }


}
