/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timesystem.model;

import java.util.ArrayList;

/**
 *
 * @author csc190
 */
public class ScheduleInfo implements java.io.Serializable {
    ArrayList<Employee> myListofEmployeesSchedules = new ArrayList(); 

   public void addEmployee(Employee e) {

        //add to array
        myListofEmployeesSchedules.add(e);

    } 
   
   // get stuff that returns a string day time and skill
    public String getAvailableStaff(String day, int hour, String skills) {

        String ret ="";
        for (int i = 0; i < myListofEmployeesSchedules.size(); i++) {
            
            Employee ee = myListofEmployeesSchedules.get(i);
            
            if (ee.isAvailable(day, hour) && ee.hasSkill(day)) {
                ret += ee.name;
            }
        }
        return ret;
    }
}
    

    