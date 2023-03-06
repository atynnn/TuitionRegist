
public class Teacher {
    // data/attributes
    String name;
    String icNum;
    String address;
    String qualification;
    String dateJoin;
    int yearsEx;
    int yearsCentre;


    // methods or operations
    public Teacher(String n, String ic, String addr, String qualify, String date, int yrsEx, int yrsCent){
        this.name = n;
        this.icNum = ic;
        this.address = addr;
        this.qualification = qualify;
        this.yearsEx = yrsEx;
        this.dateJoin = date;
        this.yearsCentre = yrsCent;
    }

    public String getTName(){
        return name;
    }
    public String getTIC(){
        return icNum;
    }
    public String getTAddress(){
        return address;
    }
    public String getTQualification(){
        return qualification;
    }
}
