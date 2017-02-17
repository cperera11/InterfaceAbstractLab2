package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends ObjectOrientedProgramingCourse {
    
    private String prerequisites;
    private PrintService printService = new PrintService();
//    public AdvancedJavaCourse(String courseName, String courseNumber, double credits, boolean prereq) {
//        super(courseName,courseNumber, credits, prereq);
//    }
    public AdvancedJavaCourse() {
        
    }
    public String getPrerequisites() {
        return prerequisites;
    }
    @Override
    public void setPrerequisites(String prerequisites) {
        
            if (prerequisites == null || prerequisites.length() == 0) {
                printService.printReport("Error: courseName cannot be null of empty string");
                System.exit(0);
            }
           
       this.prerequisites = prerequisites;
    }
}
