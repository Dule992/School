package student;

public class Course {

    public String name;
    public int numberOfClasses;
    public String codeName;

    public Course() {
    }

    public Course(String a, int b, String c) {

        this.name = a;
        this.numberOfClasses = b;
        this.codeName = c;
    }

    public void setName(String newName) {

        this.name = newName;

    }

    public void setNumberOfClasses(int newNoC) {

        this.numberOfClasses = newNoC;
    }

    public void setCodeName(String newCodeName) {

        this.codeName = newCodeName;
    }

    public String getName() {

        return this.name;
    }

    public int getNumberOfClasses() {

        return this.numberOfClasses;
    }

    public String getCodeName() {

        return this.codeName;
    }

    public void printInfo() {

        System.out.println(this.name + this.numberOfClasses + this.codeName);
    }

}
