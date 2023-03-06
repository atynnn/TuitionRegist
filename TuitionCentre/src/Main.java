/*
Pandai Sdn Bhd runs a number of tuition centers throughout KL and JB. Depending on business conditions,
they are looking continually to open new centers and from time to time, they may have to close existing ones.

Each tuition center, situated in a physical address and headed by a HeadMaster, employs a number of tutors
to handle batches of students (they take in a new batch each year). Tutors are all freelancers;
they come and go throughout the year, and each student is assigned to one tutor.

Each center maintains the data for each tutor (name, IC,  address, qualification,
# yearexp, date joined, # years in the center etc) and each student (name, IC, address, year,
schoolname, list of scores, etc). Pandai Sdn Bhd from time to time needs report on the performance
of each center - #students, #tutors, avg marks, min, max,  tutors background, etc.
*/

import java.util.Scanner;
import java.util.*;
public class Main
{
    // application code
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // asking user choose prefer centre
        System.out.println("1. ACE Education, KL \t2. GTG IGCSE, KL \n3. Little Prof, JB   \t4. First Place, JB");
        System.out.print("Choose a tuition centre : ");
        int tuitionPick = input.nextInt();

        // asking user how many students registered
        System.out.print("How many students registered this year? : ");
        int numStud = input.nextInt();

        // create new space for Student Data and call function to input Student Data
        StudentData studData = new StudentData();
        studData.inputSData(numStud); //calling fx studentData

        // switch case to differentiate tuition centres
        switch (tuitionPick){
            case 1:
                // set specific address and headmaster/headmistress
                TuitionCentre centre1 = new TuitionCentre("D-05, Jalan Kiara, Mont Kiara","Mr.Badrul", numStud);
                // printout tuition centre details (Location, Headmaster/headmistress, Teachers Available and Students Registered)
                System.out.println("\nReport Details.");
                System.out.println("Tuition Centre: " + centre1.getAddress());
                System.out.println("Headmaster: " + centre1.getHeadmaster());
                System.out.println("Teachers Assigned: " + centre1.getDTeachers());

                ArrayList<String> studentList1 = studData.getstudentList();
                System.out.println("Students Registered: " + studentList1);
                break;
            case 2:
                TuitionCentre centre2 = new TuitionCentre("No.12, Jalan Rampai 2, Medan Niaga Rampai", "Mr. Azri", numStud);

                System.out.println("\nReport Details.");
                System.out.println("Tuition Centre: " + centre2.getAddress());
                System.out.println("Headmaster: " + centre2.getHeadmaster());
                System.out.println("Teachers Assigned: " + centre2.getDTeachers());

                ArrayList<String> studentList2 = studData.getstudentList();
                System.out.println("Students Registered: " + studentList2);
                break;
            case 3:
                TuitionCentre centre3 = new TuitionCentre("6, Jalan Indah 1, Taman Bukit Indah", "Mr. Ah Chong", numStud);

                System.out.println("\nReport Details.");
                System.out.println("Tuition Centre: " + centre3.getAddress());
                System.out.println("Headmaster: " + centre3.getHeadmaster());
                System.out.println("Teachers Assigned: " + centre3.getDTeachers());

                ArrayList<String> studentList3 = studData.getstudentList();
                System.out.println("Students Registered: " + studentList3);
                break;
            case 4:
                TuitionCentre centre4 = new TuitionCentre("37-01, Jalan Molek 1/5A, Taman Molek", "Mrs. Aliah", numStud);

                System.out.println("\nReport Details.");
                System.out.println("Tuition Centre: " + centre4.getAddress());
                System.out.println("Headmaster: " + centre4.getHeadmaster());
                System.out.println("Teachers Assigned: " + centre4.getDTeachers());

                ArrayList<String> studentList4 = studData.getstudentList();
                System.out.println("Students Registered: " + studentList4);
                break;
            default:
                System.out.println("Error! Please choose tuition centre between 1-4");
                return;
        }

    }
}