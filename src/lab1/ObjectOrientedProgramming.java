/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Chathuri Perera
 */
public abstract class ObjectOrientedProgramming {

    private String courseName;
    private String courseNumber;
    private double credits;
    private PrintService printService = new PrintService();
    private final String IAEXCEPTION_MSG = "Value Entered Does Not Match the Format of the Field";

    
    public abstract void setPrerequisites(String prerequisites);

    public abstract String getPrerequisites();

    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            printService.printReport("Error: courseNumber cannot be null of empty string");
            throw new IllegalArgumentException(IAEXCEPTION_MSG);
        }
        this.courseNumber = courseNumber;
    }

    public void setCredits(String credits) {
        if (courseNumber == null || courseNumber.length() == 0) {
            printService.printReport("Error: credits cannot be null of empty");
            throw new IllegalArgumentException(IAEXCEPTION_MSG);
        }
        Double credit = Double.parseDouble(credits);
        this.credits = credit;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            printService.printReport("Error: courseName cannot be null of empty string");
            throw new IllegalArgumentException(IAEXCEPTION_MSG);
        }
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public String getIAEXCEPTION_MSG() {
        return IAEXCEPTION_MSG;
    }

}
