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

        wctc.setIntroPro("Intro to Programming", "152-107", "2", "prerequisites");
        wctc.setIntroJava("Intro to Java", "152-134", "4", "prerequisites");
        wctc.setAdvancedJava("Advanced Java", "152-135", "4", "prerequisites");
        //wctc.printReport();
        
        College carroll = new College("Carroll University");
        carroll.setIntroPro("Introduction to Programming", "230-48", "2", "prerequisites");
        carroll.setIntroJava("Introduction to Java", "230-66", "3", "prerequisites");
        carroll.setAdvancedJava("Advanced Java Programming", "230-69", "4", "prerequisites");
        //carroll.printReport();
        
        College[] college = {wctc, carroll};

        for (College col : college) {
            col.printReport();
        }

    }
}
