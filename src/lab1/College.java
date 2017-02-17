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
public class College {
    
    private ObjectOrientedProgramingCourse introPro;
    private ObjectOrientedProgramingCourse introJava;
    private ObjectOrientedProgramingCourse advanceJava;
    public PrintService printService;
    private SemesterInventory semesterInventory ;
    
   public College(){
       printService = new PrintService();
       semesterInventory = new SemesterInventory();
  }
    public void setIntroPro(String courseName, String courseNumber, String credits, String p){
     introPro = new IntroToProgrammingCourse(courseName, courseNumber, credits, p);
     
  }
     public void setIntroJava(String courseName, String courseNumber, String credits, String p){
     introJava = new IntroJavaCourse(courseName, courseNumber, credits, introPro.getCourseName());
     
  }
     
     public void setAdvancedJava(String courseName, String courseNumber, String credits, String p){
      advanceJava = new AdvancedJavaCourse(courseName, courseNumber, credits, introJava.getCourseName());
     
  }
     public void setSemesterInventory(){
         semesterInventory.setSemesterInventory("\nCourse Name:" + introPro.getCourseName() 
                                                 + "\n\tCourse Number: "+ introPro.getCourseNumber()
                                                 + "\n\tCourse Credits: "+ introPro.getCredits()
                                                 + "\n\tCourse Prerequisites: " + introPro.getPrerequisites());
         
         semesterInventory.setSemesterInventory("\n\nCourse Name:" + introJava.getCourseName() 
                                                 + "\n\tCourse Number: "+ introJava.getCourseNumber()
                                                 + "\n\tCourse Credits: "+ introJava.getCredits()
                                                 + "\n\tCourse Prerequisites: " + introJava.getPrerequisites());
         
         semesterInventory.setSemesterInventory("\n\nCourse Name:" + advanceJava.getCourseName() 
                                                 + "\n\tCourse Number: "+ advanceJava.getCourseNumber()
                                                 + "\n\tCourse Credits: "+ advanceJava.getCredits()
                                                 + "\n\tCourse Prerequisites: " + advanceJava.getPrerequisites());
                  
           }
   public void printReport(){
    setSemesterInventory();
    printService.printReport(semesterInventory.getINVENTORY_MSG() +"\n" + semesterInventory.getSemesterInventory());
   }
 
}
