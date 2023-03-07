public class StudentBatch {
    // data/attributes
    Student students[] = new Student[10];
    int currentSize = 0;

    // operations
    void add(Student s, int i){
        students[i] = s;
    }


    //method overloading
    void add(Student s){
        students[currentSize++] = s;
        //or currentSize++;
    }

    //find a particular student
    boolean find(String name){
        for (int i=0; i<currentSize; i++){
            if (students[i].name.fName == name)
                return true;
        }
        return false;
    }
}
