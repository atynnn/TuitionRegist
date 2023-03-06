import java.util.Scanner;
import java.util.ArrayList;

public class StudentData {
    public String sName, sIC, sAddress, sSchoolName = " "; //initialize strings
    Scanner input = new Scanner(System.in);
    private ArrayList<String> studentList = new ArrayList<>(); // create arraylist for students

    // function call for input data for students registered
    public void inputSData(int numStud) {
        for (int i = 0; i < numStud; i++) {
            int num = i+1;
            System.out.println("\nStudent " + num + " Data. (press ENTER)");
            input.nextLine();

            System.out.print("Full Name: "); sName = input.nextLine(); // user input of name
            System.out.print("IC: "); sIC = input.nextLine(); // user input of IC
            System.out.print("Address: "); sAddress = input.nextLine(); // user input of home address
            System.out.print("School Name: "); sSchoolName = input.nextLine(); // user input of school name

            // add data to Student class and add to StudentList
            Student student = new Student(sName, sIC, sAddress, sSchoolName);
            studentList.add(student.getName());

            // Record marks for the students subjects
            System.out.println("\nEnter Student " + num + " marks for 5 subjects.");
            for (int j = 0; j < 5; j++){
                int subj = j+1;
                System.out.print("Subject " + subj + " : "); float marks = input.nextFloat();
                try {
                    student.setMarks(marks, j);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }

            //Print out the average marks, minimum and maximum mark by calling fx at Student Class
            System.out.println("\nAverage marks of 5 subjects (/100): " + student.calcAvg());
            System.out.println("Minimum mark: " + student.calcMin());
            System.out.println("Maximum mark: " + student.calcMax());

            // add student in their Batch
            StudentBatch sb2023 = new StudentBatch();
            sb2023.add(student, i);
        }

    }
    public ArrayList<String> getstudentList(){
        return studentList;
    }

}
