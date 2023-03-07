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

public class Main
{
    // application code
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Student mike = new Student();
        Name name = new Name();
        name.setFName("Michael"); name.setMName("Jordan"); name.setLName("Jr.");
        mike.setName(name);

        Student adila = new Student();
        name = new Name();
        name.fName = "Adila"; name.mName = "Huda"; name.lName = "Ahmad";
        adila.setName(name);

        Student aiman = new Student();
        name = new Name("Aiman", "Akeem", "Amirullah");
        aiman.setName(name);

        //create batch object
        StudentBatch sb2023 = new StudentBatch(); // must create new so that data doesn't come out null
        sb2023.add(mike); sb2023.add(adila); sb2023.add(aiman);

        // declare a method that allows following
        boolean isIn = sb2023.find("Adila");

        Teacher mrsMinah = new Teacher();


        /*/for (int i=0; i<5; i++)
            //mike.marks[i] = 100;
            mike.setMarks(100, i);*/

        // calculate and print average
        float avg = 0;
        avg = mike.calcAvg();
        System.out.println("Average = " + avg);

        //calculate the min marks for mike
        System.out.println("Minimum = " + mike.calcMin());
    }
}