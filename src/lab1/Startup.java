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
    
   wctc.setIntroPro("Intro to Programming", "5674-98", "2", "prerequisites");
   wctc.setIntroJava("Intro to Java", "654-8766", "4", "prerequisites");
   wctc.setAdvancedJava("Advanced Java", "765-98", "4", "prerequisites");
   
    //wctc.printReport();
    
    College matc = new College();
   matc.setIntroPro("Intro to Programming", "5674-98", "2", "prerequisites");
   matc.setIntroJava("Intro to Java", "654-8766", "4", "prerequisites");
   matc.setAdvancedJava("Advanced Java", "765-98", "4", "prerequisites");
   
    //matc.printReport();
    
    College[] college = {wctc,matc};
    
    for(College col:college){
    col.printReport();
    }

}
}