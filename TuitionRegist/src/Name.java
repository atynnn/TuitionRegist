public class Name {
    String fName;
    String lName;
    String mName;

    public Name() {    }

    public Name(String fName, String mName, String lName){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public void setFName(String fName){
        // this.global = local *this* - class attributes
        this.fName = fName;
    }

    /*public String getFName (){
        return fName;
    }*/

    public void setMName(String mName){
        // this.global = local *this* - class attributes
        this.mName = mName;
    }

    /*public String getMName (){
        return mName;
    }*/

    public void setLName(String lName){
        // this.global = local *this* - class attributes
        this.lName = lName;
    }

    /*public String getLName (){
        return lName;
    }*/
}
