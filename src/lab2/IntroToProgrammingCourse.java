package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ObjectOrientedProgramming {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    private int numberOfExams;
    private PrintService printService = new PrintService();
    private final String IAEXCEPTION_MSG = "Value Entered Does Not Match the Format of the Field"; 

     public IntroToProgrammingCourse(String courseName, String courseNumber, String credit, String prereqs) {
        setCourseName(courseName);
        setCourseNumber(courseNumber);
        setCredits(credit);
        setPrerequisites(prereqs);
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            printService.printReport("Error: courseNumber cannot be null of empty string");
            throw new IllegalArgumentException(IAEXCEPTION_MSG);
        }
        this.courseNumber = courseNumber;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
     public void setCredits(String credits) {
        if (courseNumber == null || courseNumber.length() == 0) {
            printService.printReport("Error: credits cannot be null of empty");
            throw new IllegalArgumentException(IAEXCEPTION_MSG);
        }
        Double credit = Double.parseDouble(credits);
        this.credits = credit;
    }
    @Override
    public String getCourseName() {
        return courseName;
    }
    @Override
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            printService.printReport("Error: courseName cannot be null of empty string");
            throw new IllegalArgumentException(IAEXCEPTION_MSG);
        }
        this.courseName = courseName;
    }

    @Override
    public String getPrerequisites() {
        return "No Prerequisites";
    }

    @Override
    public void setPrerequisites(String prerequisites) {

    }

    public int getNumberOfExams() {
        return numberOfExams;
    }

    public void setNumberOfExams(int numberOfExams) {
        this.numberOfExams = numberOfExams;
    }

    
}
