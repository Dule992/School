package main;

import media.Television;
import media.Radio;
import student.Student;
import student.Course;

public class Main {


    public static void main(String[] args) {
        
        Television Panasonic = new Television();
        
        Student DusanMilic = new Student();
        DusanMilic.setFirstName("Dusan");
        DusanMilic.setLastName("Milic");
        DusanMilic.setYearOfBirth(1992);
        
        DusanMilic.info();
    }
    
    
    
}
