public class StudentBatch {
    // data/attributes
    Student students[] = new Student[100];
    int currentSize = 0;

    // operations
    void add(Student s, int i){
        students[i] = s;
    }


    //method overloading
    void addNew(Student s){
        students[currentSize++] = s;
        //or currentSize++;
    }
}
