/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Chathuri Perera
 */
public class Startup {

    public static void main(String[] args) {

        College wctc = new College("WCTC");

        wctc.setIntroPro("Intro to Programming", "152-107", "2", "prerequisites");
        wctc.setIntroJava("Intro to Java", "152-134", "4", "prerequisites");
        wctc.setAdvancedJava("Advanced Java", "152-135", "4", "prerequisites");
   
        
        College uwm = new College("UWM");
        uwm.setIntroPro("Introduction to Object-Oriented Programming", "CS 550", "2", "prerequisites");
        uwm.setIntroJava(" Object-Oriented Programming", "CS 552", "3", "prerequisites");
        uwm.setAdvancedJava("Advanced Object-Oriented Programming", "CS 553", "4", "prerequisites");
  
        
        College[] college = {wctc, uwm};

        for (College col : college) {
            col.printReport();
        }

    }
}
