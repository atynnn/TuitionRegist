import java.util.ArrayList;

//import java.util.Scanner;
import java.util.*;
public class TuitionCentre {
    private String address;
    private String headmaster;
    private ArrayList<String> teachers;

    //constructor public
    TuitionCentre(String address, String headmaster, int numT) {
        System.out.println("\nThere must be " + numT + " teacher(s) must be registered (1 for each student)");
        TeacherData tData = new TeacherData();
        tData.inputTData(numT);

        ArrayList<String> teachers = tData.getTeachers();

        this.address = address;
        this.headmaster = headmaster;
        this.teachers = teachers;
    }

    //getters and setters
    public ArrayList<String> getDTeachers() {
        return teachers;
    }
    public String getAddress() {
        return address;
    }

    public String getHeadmaster() {
        return headmaster;
    }

}
