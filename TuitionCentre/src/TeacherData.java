import java.util.Scanner;
import java.util.ArrayList;
public class TeacherData {
    private ArrayList<String> teachers;
    public String tName, tIC, tAddress, tQualify, dateJoin = " ";
    public int yearsEx, yearsCentre = 0;

    Scanner input = new Scanner(System.in);

    // function call for input data for teachers registered
    public void inputTData(int numT){

        teachers = new ArrayList<>();

        for (int i=0; i < numT; i++) {
            int num = i+1;
            System.out.println("\nTeacher " + num + " Data. (press ENTER)");
            input.nextLine();

            System.out.print("Full Name: "); tName = input.nextLine(); // user input of name
            System.out.print("IC: "); tIC = input.nextLine(); // user input of IC
            System.out.print("Address: "); tAddress = input.nextLine(); // user input of home address
            System.out.print("Qualification: "); tQualify = input.nextLine(); // user input of qualification
            System.out.print("Date Joined Tuition Centre: "); dateJoin = input.nextLine(); // user input of date joined
            System.out.print("Years Experience Teaching: "); yearsEx = input.nextInt(); // user input of years experience
            System.out.print("Years Since Joined this Tuition Centre: "); yearsCentre = input.nextInt(); // user input of years teach

            // add data to Teacher class and add to teachers
            Teacher teacher = new Teacher(tName, tIC, tAddress, tQualify, dateJoin, yearsEx, yearsCentre);
            teachers.add(teacher.getTName());
        }
    }

    public ArrayList<String> getTeachers() {
        return teachers;
    }

}
