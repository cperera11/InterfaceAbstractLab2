package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends ObjectOrientedProgramingCourse {
    
   
    
     public IntroToProgrammingCourse(String courseName, String courseNumber, String credits, String p) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credits);
        setCredits(p);
      }
   
   
         
       @Override
    public void setPrerequisites(String prerequisites) {
        
       }

    @Override
    public String getPrerequisites() {
        return("No Prerequisites");
    }
}
