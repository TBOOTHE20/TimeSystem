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
    
}
