/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author CPere
 */
public class College {

    private ObjectOrientedProgramingCourse introToProgramming;
    private ObjectOrientedProgramingCourse introToJava;
    private ObjectOrientedProgramingCourse advancedJava;
    public PrintService printService;
    private SemesterInventory semesterInventory;

    public College() {
        printService = new PrintService();
        semesterInventory = new SemesterInventory();
    }

    public void setIntroPro(String courseName, String courseNumber, String credits, String p) {
        introToProgramming = new IntroToProgrammingCourse(courseName, courseNumber, credits, p);

    }

    public void setIntroJava(String courseName, String courseNumber, String credits, String p) {
        introToJava = new IntroJavaCourse(courseName, courseNumber, credits, introToProgramming.getCourseName());

    }

    public void setAdvancedJava(String courseName, String courseNumber, String credits, String p) {
        advancedJava = new AdvancedJavaCourse(courseName, courseNumber, credits, introToJava.getCourseName());

    }

    public void setSemesterInventory() {
        semesterInventory.setItSemesterInventory("\nCourse Name:" + introToProgramming.getCourseName()
                + "\n\tCourse Number: " + introToProgramming.getCourseNumber()
                + "\n\tCourse Credits: " + introToProgramming.getCredits()
                + "\n\tCourse Prerequisites: " + introToProgramming.getPrerequisites());

        semesterInventory.setItSemesterInventory("\n\nCourse Name:" + introToJava.getCourseName()
                + "\n\tCourse Number: " + introToJava.getCourseNumber()
                + "\n\tCourse Credits: " + introToJava.getCredits()
                + "\n\tCourse Prerequisites: " + introToJava.getPrerequisites());

        semesterInventory.setItSemesterInventory("\n\nCourse Name:" + advancedJava.getCourseName()
                + "\n\tCourse Number: " + advancedJava.getCourseNumber()
                + "\n\tCourse Credits: " + advancedJava.getCredits()
                + "\n\tCourse Prerequisites: " + advancedJava.getPrerequisites());

    }

    public void printReport() {
        setSemesterInventory();
        printService.printReport(semesterInventory.getINVENTORY_MSG() + "\n" + semesterInventory.getItSemesterInventory());
    }

}
