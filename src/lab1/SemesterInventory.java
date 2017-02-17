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

    private String itSemesterInventory;
    private String businessSemesterInventory;
    private String healthSemesterInventory;
    
    private final String INVENTORY_MSG = "Course details have been added to the semester inventory ";
    

    public String getItSemesterInventory() {
        return itSemesterInventory;
    }

    public void setItSemesterInventory(String semesterInventory) {
        this.itSemesterInventory += semesterInventory;
    }

    public String getINVENTORY_MSG() {
        return INVENTORY_MSG;
    }

    public String getBusinessSemesterInventory() {
        return businessSemesterInventory;
    }

    public void setBusinessSemesterInventory(String businessSemesterInventory) {
        this.businessSemesterInventory = businessSemesterInventory;
    }

    public String getHealthSemesterInventory() {
        return healthSemesterInventory;
    }

    public void setHealthSemesterInventory(String healthSemesterInventory) {
        this.healthSemesterInventory = healthSemesterInventory;
    }
    

}
