public class TuitionCentre {
    private String address;
    private String headmaster;
    //private ArrayList<Teacher> teachers;

    //constructor public
    TuitionCentre(String address, String headmaster) {
        this.address = address;
        this.headmaster = headmaster;
        //teachers = new ArrayList<Teacher>();
    }

    //getters and setters
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(String headmaster) {
        this.headmaster = headmaster;

    }

    /*public ArrayList<Teacher> getTeachers() {
        return teachers;

    }

    //methods to add and remove teachers
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);

    }*/
}
