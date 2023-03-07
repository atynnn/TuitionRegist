public class Student {
    // data/attributes
    Name name; // Class Variable;
    String ic;
    String address;
    String schoolname;
    float marks[] = new float[5];

    public Student(){
        System.out.println("Student Object Oriented");
    }

    //students[i] == struct

    // methods or operations
    float calcAvg() { //dont have to put parameters because marks[] already at public
        return 0;
    }

    float calcMin() {
        return 0;
    }

    void setMarks(float mark, int i) throws Exception {
        /*if (marks[i] < 0 && marks[i] > 100) {
            System.out.println("Error!");
            return;
        }*/
        if (mark <0){
            throw new Exception("Error in mark detected");
        }
        marks[i] = mark;
    }

    void setName(Name name) {
        this.name = name;
    }

    void displayMarks(){
        // print marks
        for (int i=0; i<marks.length; i++){
            System.out.println("Marks at index " +i+ " : " + marks[i]);
        }
    }

    public static void main(String args[]){
        Student stud0 = new Student();
        try { //try block. smthing in here can cause exception
            stud0.setMarks(10, 0);
            stud0.setMarks(-10, 0);
        } catch (Exception ex) { // catch block. action to be taken in case Exception
            System.out.println("Cannot continue");
            ex.printStackTrace(); //method
        }

        stud0.displayMarks();
    }
}

/*ArrayList<Student> studentList = new ArrayList<Student>();
        String sName, sIC, sAddress, sSchoolName = " ";
        int num = 1;

        for (int i=0; i < numStud; i++){
            num += i;
            System.out.println("\nStudent " + num);
            input.nextLine();

            System.out.print("Enter Student Full Name: "); sName = input.nextLine(); // user input of name
            System.out.print("Enter Student IC: "); sIC = input.nextLine(); // user input of IC
            System.out.print("Enter Student Address: "); sAddress = input.nextLine(); // user input of home address
            System.out.print("Enter School Name: "); sSchoolName = input.nextLine(); // user input of school name

            /*System.out.println("Please input Students Credits: ");
            int inputCredits = input.nextInt(); // User input of Credits
            System.out.println("Please input Student's Total Grade Points Earned: ");
            double getPoints = input.nextDouble();
            double GPA = getPoints/inputCredits; //User input of Grade Points Earned and Divide by Credits to get GPA

            Student student = new Student(sName, sIC, sAddress, sSchoolName);
            studentList.add(student);

            StudentBatch sb2023 = new StudentBatch();
            sb2023.add(student);
        }*/
