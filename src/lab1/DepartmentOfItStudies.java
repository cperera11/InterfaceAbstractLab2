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
public class DepartmentOfItStudies {
    
    private ObjectOrientedProgramingCourse introPro;
    private ObjectOrientedProgramingCourse introJava;
    private ObjectOrientedProgramingCourse advanceJava;
    public PrintService printServ = new PrintService();
    private String itSemesterInventory;
    
   public DepartmentOfItStudies(String courseName, String courseNumber, String credits, String p){
     introPro = new IntroToProgrammingCourse(courseName, courseNumber, credits, p);
    // introJava = new IntroJavaCourse(courseName, courseNumber);
    // advanceJava = new AdvancedJavaCourse(courseName, courseNumber);
     
  }
   
   public void printReport(){
    printServ.printReport(introPro.getCourseName());
    printServ.printReport(getIntroPro().getCourseNumber());
    printServ.printReport(Double.toString(getIntroPro().getCredits()));
  //  printServ.printReport(getIntroPro().getPrerequisites());
   }

    public ObjectOrientedProgramingCourse getIntroPro() {
        return introPro;
    }

    public void setIntroPro(ObjectOrientedProgramingCourse introPro) {
        this.introPro = introPro;
    }

    public ObjectOrientedProgramingCourse getIntroJava() {
        return introJava;
    }

    public void setIntroJava(ObjectOrientedProgramingCourse introJava) {
        this.introJava = introJava;
    }

    public ObjectOrientedProgramingCourse getAdvanceJava() {
        return advanceJava;
    }

    public void setAdvanceJava(ObjectOrientedProgramingCourse advanceJava) {
        this.advanceJava = advanceJava;
    }
    
    
}
