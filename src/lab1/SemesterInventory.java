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
public class SemesterInventory {

    private String semesterInventory;
    private final String INVENTORY_MSG = "Course details have been added to the semester inventory ";

    public String getSemesterInventory() {
        return semesterInventory;
    }

    public void setSemesterInventory(String semesterInventory) {
        this.semesterInventory += semesterInventory;
    }

    public String getINVENTORY_MSG() {
        return INVENTORY_MSG;
    }

}
