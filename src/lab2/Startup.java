/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import lab1.ObjectOrientedProgramming;

/**
 *
 * @author Chathuri Perera
 */
public class Startup {

    public static void main(String[] args) {

        College wctc = new College("WCTC");
        IntroToProgrammingCourse introProgramming = new IntroToProgrammingCourse("Intro to Programming", "152-107", "2", "prerequisites");
        IntroJavaCourse introJava = new IntroJavaCourse("Intro to Java", "152-134", "4", introProgramming.getCourseName());       
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("Advanced Java", "152-135", "4", introJava.getCourseName()); 
        
        wctc.addItCourse(introProgramming);
        wctc.addItCourse(introJava);
        wctc.addItCourse(advancedJava);
      
        College carroll = new College("Carroll University");
        IntroToProgrammingCourse introToProgramming = new IntroToProgrammingCourse("Introduction to Programming", "230-48", "2", "prerequisites");
        IntroJavaCourse introToJava = new IntroJavaCourse("Introduction to Java", "230-66", "3", introProgramming.getCourseName());    
        AdvancedJavaCourse advancedJavaProgramme = new AdvancedJavaCourse("Advanced Java Programming", "230-69", "4", introJava.getCourseName());

        carroll.addItCourse(introToProgramming );
        carroll.addItCourse(introToJava );
        carroll.addItCourse(advancedJavaProgramme);
        
        
        College[] college = {wctc, carroll};

        for (College col : college) {
            col.printSemesterInventory();
        }

        
    }
}
