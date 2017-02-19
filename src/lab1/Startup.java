/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Chathuri Perera
 */
public class Startup {

    public static void main(String[] args) {

        College wctc = new College("WCTC");
        ObjectOrientedProgramingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming", "152-107", "2", "prerequisites");
        ObjectOrientedProgramingCourse introJava = new IntroJavaCourse("Intro to Java", "152-134", "4", introProgramming.getCourseName());       
        ObjectOrientedProgramingCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "152-135", "4", introJava.getCourseName()); 
        
        wctc.addItCourse(introProgramming);
        wctc.addItCourse(introJava);
        wctc.addItCourse(advancedJava);
      
        College carroll = new College("Carroll University");
        ObjectOrientedProgramingCourse introToProgramming = new IntroToProgrammingCourse("Introduction to Programming", "230-48", "2", "prerequisites");
        ObjectOrientedProgramingCourse introToJava = new IntroJavaCourse("Introduction to Java", "230-66", "3", introProgramming.getCourseName());    
        ObjectOrientedProgramingCourse advancedJavaProgramme = new AdvancedJavaCourse("Advanced Java Programming", "230-69", "4", introJava.getCourseName());

        carroll.addItCourse(introToProgramming );
        carroll.addItCourse(introToJava );
        carroll.addItCourse(advancedJavaProgramme);
        
        
        College[] college = {wctc, carroll};

        for (College col : college) {
            col.printSemesterInventory();
        }

    }
}
