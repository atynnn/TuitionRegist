public class Student {
    private String name; // Class Variable;
    private String icNum;
    private String address;
    private String schoolName;
    float marks[] = new float[5];

    //constructor public
    public Student(String n, String ic, String addr, String sName){
        this.name = n;
        this.icNum = ic;
        this.address = addr;
        this.schoolName = sName;
    }

    public String getName(){
        return name;
    }
    public String getIC(){
        return icNum;
    }
    public String getAddress(){
        return address;
    }
    public String getSchoolName(){
        return schoolName;
    }


    // methods or operations
    // calculate average marks
    float calcAvg() { //dont have to put parameters because marks[] already at public
        float avg, sum = 0;
        for (int i = 0; i<marks.length; i++){
            sum += marks[i];
        }
        avg = sum/5;
        return avg;
    }

    // calculate maximum mark
    float calcMax() {
        float max = marks[0];
        for (int i = 0; i<marks.length; i++){
            if (marks[i] > max){
                max = marks[i];
            }
        }
        return max;
    }

    // calculate minimum mark
    float calcMin() {
        float min = marks[0];
        for (int i = 0; i<marks.length; i++){
            if (marks[i] < min){
                min = marks[i];
            }
        }
        return min;
    }

    // record data inside array marks
    void setMarks(float mark, int i) throws Exception {
        if (mark <0){
            throw new Exception("Error in mark detected");
        }
        marks[i] = mark;
    }

}
