/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Chathuri Perera
 */
public class College {

    private PrintService printService;
    private SemesterInventory semesterInventory;
    private final List <ObjectOrientedProgramming> courses;
    private String collegeName;
            
          
    public College(String collegeName) {
        courses = new ArrayList <ObjectOrientedProgramming>();
        setCollegeName(collegeName);
        printService = new PrintService();
        semesterInventory = new SemesterInventory();
    }

    public void addItCourse(ObjectOrientedProgramming course){
        courses.add(course);
    }
    
    public List <ObjectOrientedProgramming> getCourses(){
        return courses;
    }
    
     public void setSemesterInventory() {
         courses.forEach((c) -> {
             semesterInventory.setItSemesterInventory("\n"+"Course Name:" + c.getCourseName()
                     + "\n\tCourse Number: " +c.getCourseNumber()
                     + "\n\tCourse Credits: " + c.getCredits()
                     + "\n\tCourse Prerequisites: " + c.getPrerequisites() + "\n");
        });
     }
    
    public void printSemesterInventory() {
        setSemesterInventory();
        printService.printReport(semesterInventory.getINVENTORY_MSG() +" of " + getCollegeName()+"\n"
                + semesterInventory.getItSemesterInventory());
    }

    public String getCollegeName() {
         return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}