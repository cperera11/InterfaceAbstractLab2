package lab1;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author Chathuri Perera
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ObjectOrientedProgramingCourse {
    
    private int numberOfExams;
   
    public IntroToProgrammingCourse(String courseName, String courseNumber, String credit, String prereqs) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credit);
        setPrerequisites(prereqs);
    }

    @Override
    public void setPrerequisites(String prerequisites) {
    }

    @Override
    public String getPrerequisites() {
        return ("No Prerequisites");
    }

    public int getNumberOfExams() {
        return numberOfExams;
    }

    public void setNumberOfExams(int numberOfExams) {
        this.numberOfExams = numberOfExams;
    }

   }
