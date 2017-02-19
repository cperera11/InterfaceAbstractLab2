package lab1;



/**
 * Describe responsibilities here.
 *
 * @author      Chathuri Perera
 * @version     1.00
 */
public class IntroJavaCourse extends ObjectOrientedProgramming {

    private String prerequisites;
    private int numberOfExams;
     private int numberOfProjects;
    private PrintService printService = new PrintService();

    public IntroJavaCourse(String courseName, String courseNumber, String credit, String prereqs) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credit);
        setPrerequisites(prereqs);
    }
 
    @Override
   public String getPrerequisites() {
        return prerequisites;
    }

    @Override
    public void setPrerequisites(String prerequisites) {
        
            if (prerequisites == null || prerequisites.length() == 0) {
                printService.printReport("Error: courseName cannot be null of empty string");
                throw new IllegalArgumentException(getIAEXCEPTION_MSG());
            }
           
       this.prerequisites = prerequisites;
    }

    public int getNumberOfExams() {
        return numberOfExams;
    }

    public void setNumberOfExams(int numberOfExams) {
        this.numberOfExams = numberOfExams;
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }

    public void setNumberOfProjects(int numberOfProjects) {
        this.numberOfProjects = numberOfProjects;
    }
    
      
}
