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
public class Startup {
    public static void main(String[] args) {
    College wctc = new College();
    
   ObjectOrientedProgramingCourse introPro = new IntroToProgrammingCourse();
   ObjectOrientedProgramingCourse introJava = new IntroJavaCourse();
   ObjectOrientedProgramingCourse advanceJava = new AdvancedJavaCourse();
    
    introPro.setCourseName("Intro to Programming");
    introPro.setCourseNumber("4356");
    introPro.setCredits(2.0);
    introPro.setPrerequisites(false);
    
    wctc.printServ.printReport("course name has been added to the semester inventory "+ "\nCourse Name:" 
            + introPro.getCourseName() + "\tCourse Number: "+ introPro.getCredits()+ "\tCourse Prerequisites: "
            + introPro.getCoursePrerequisites(""));
   
   
    introJava.setCourseName("Intro to Java");
    introJava.setCourseNumber("5436");
    introJava.setCredits(4.0);
    introJava.setPrerequisites(true);
    introJava.getCoursePrerequisites("Intro to Programming");
    wctc.printServ.printReport("course name has been added to the semester inventory "+ "\nCourse Name:" 
            + introJava.getCourseName() + "\tCourse Number: "+ introJava.getCredits()
            + "\tCourse Prerequisites: "+ introJava.getCoursePrerequisites(""));
    
    advanceJava.setCourseName("Advanced Java");
    advanceJava.setCourseNumber("9863");
    advanceJava.setCredits(4.0);
    advanceJava.setPrerequisites(true);
    advanceJava.getCoursePrerequisites("Intro to Java");
    wctc.printServ.printReport("course name has been added to the semester inventory "+ "\nCourse Name:" 
            + advanceJava.getCourseName() + "\tCourse Number: "+ advanceJava.getCredits()
            + "\tCourse Prerequisites: "+ advanceJava.getCoursePrerequisites(""));
   
}
}