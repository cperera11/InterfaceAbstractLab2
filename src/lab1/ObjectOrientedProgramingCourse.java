/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author CPere
 */
public abstract class ObjectOrientedProgramingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    
  // private boolean prerequisites;
    
    private PrintService printService = new PrintService();

    public ObjectOrientedProgramingCourse(String courseName, String courseNumber, double credits) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
       
    }

     public ObjectOrientedProgramingCourse() {
       
    }
      public abstract void setPrerequisites(String prerequisites);
     
//    public String getCoursePrerequisites(String prerequisites) {
//        String prereqs = "";
//        if (!isPrerequisites()) {
//            if (prerequisites == null || prerequisites.length() == 0) {
//                printService.printReport("Error: courseName cannot be null of empty string");
//                System.exit(0);
//            }
//            prereqs = prerequisites;
//
//        } else {
//            printService.printReport("There is no any prerequisites for this course");
//        }
//        return prereqs;
//    }

     
     
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            printService.printReport("Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            printService.printReport("Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            printService.printReport("Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

//    public void setPrerequisites(boolean prerequisites) {
//        this.prerequisites = prerequisites;
//    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

//    public boolean isPrerequisites() {
//        return prerequisites;
//    }

}
