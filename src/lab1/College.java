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
    private DepartmentOfItStudies deptOfItStudies;
    public PrintService printServ = new PrintService();
    
    public College(String courseName, String courseNumber, String credits, String p){
    deptOfItStudies = new DepartmentOfItStudies(courseName, courseNumber, credits, p);
    printServ = new PrintService();
    } 
    public void printReport(){
    deptOfItStudies.printReport();
     }
    
}
