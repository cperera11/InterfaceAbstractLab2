package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends ObjectOrientedProgramingCourse {

    private String prerequisites;
    private PrintService printService = new PrintService();

//    public IntroJavaCourse(String courseName, String courseNumber, double credits, boolean prereq) {
//        super(courseName,courseNumber, credits, prereq );
//    }
 public IntroJavaCourse() {
        
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
