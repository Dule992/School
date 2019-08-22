
package student;

public class Student {

    private String firstname = "Dusan";
    private String lastname = "Milic";
    private int yearOfBirth = 1992;
    private Course course;

    public Student() {
        this.course = new Course("Dusan", 19, "Milic");
    }
    
    public Student(String a, String b, int c, Course d) {
    
        this.firstname = a;
        this.lastname = b;
        this.yearOfBirth = c;
        this.course = d;
    }
    
    public void setFirstName(String newFName) {
        
        this.firstname = newFName; 
    } 
    
    public void setLastName(String newLName) {
    
        this.lastname = newLName;
    }
    
    public void setYearOfBirth(int newYear) {
    
        this.yearOfBirth = newYear;
    }
    
    public void setCourse(Course newCourse) {
    
        this.course = newCourse;
    }
    
    public String getFirstName() {
        
        return this.firstname; 
    } 
    
    public String getLastName() {
    
        return this.lastname;
    }
    
    public int getYearOfBirth() {
    
        return this.yearOfBirth;
    }
    
    public Course getCourse() {
    
        return this.course;
    }
    
    public void info() {
    
        System.out.println("First name: " +  + this.firstname + "Last name: " + this.lastname + "Year of birth: " + this.yearOfBirth + "Course name: " + this.course + "Course number of classes: ");
    }



    
}
