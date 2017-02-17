package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class AdvancedJavaCourse extends ObjectOrientedProgramingCourse {

    private String prerequisites;
    private PrintService printService = new PrintService();

    public AdvancedJavaCourse(String courseName, String courseNumber, String credit, String prereqs) {
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
}
