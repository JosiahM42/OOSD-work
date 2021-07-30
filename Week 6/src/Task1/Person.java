package Task1;

public class Person {
    public String firstName;
    public String lastName;
    public String address;
    public Person() {
    }
    public Person(String firstName, String lastName, String address)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
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
        return "Person's name is " + getFirstName() +" "+
                getLastName() +"\n Address is "+ getAddress() + "\n";
    }

    public static void main(String args[])
    {

        Person p = new Person();
        System.out.println(p);
        p.setFirstName("James");
        p.setLastName("Lear");
        p.setAddress("FET-CSCT");
        System.out.println(p);
        Person p1 = new Person("Kun", "Wei", "FET-CSCT");
        System.out.println(p1);

        Lecturer l = new Lecturer();
        System.out.println(l);
        l.setFirstName("Hugo");
        l.setLastName("Horton");
        l.setAddress("FET-CSCT");
        l.setLecturerID(0001);
        System.out.println(l);
        Lecturer l1 = new Lecturer("Pheobe", "Flowers", "FET-CSCT", 0002);
        System.out.println(l1);

        Head h = new Head();
        System.out.println(h);
        h.setFirstName("Theo");
        h.setLastName("Horton");
        h.setAddress("FET-CSCT");
        h.setLecturerID(0002);
        h.setHOD("HOD-CSCT");
        System.out.println(h);
        Head h1 = new Head("Pheobe", "Flowers", "HOD-GEO", 0003, "HOD-GEO");
        System.out.println(h1);

        Student s = new Student();
        System.out.println(s);
        s.setFirstName("Felicity");
        s.setLastName("Horton");
        s.setAddress("FET-CSCT");
        s.setStudentID(0001);
        System.out.println(s);
        Student s1 = new Student("Pheobe", "Flowers", "FET-CSCT", 0002);
        System.out.println(s1);

        UGStudent ugs = new UGStudent();
        System.out.println(ugs);
        ugs.setFirstName("Nathan");
        ugs.setLastName("Horton");
        ugs.setAddress("FET-CSCT");
        ugs.setStudentID(0003);
        ugs.setDegreeName("Bsc Hons Computer Science");
        System.out.println(ugs);
        UGStudent ugs1 = new UGStudent("Pheobe", "Flowers", "FET-CSCT", 0004, "Bsc Hons Human Geography");
        System.out.println(s1);
    }
}
