/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timesystem;

import timesystem.model.Timeslot;
import timesystem.model.Employee;
import timesystem.model.ScheduleInfo;

/**
 *
 * @author csc190
 */
public class server {
    protected static void uploadEmployees(String val){
        String qry = "UPDATE objects SET val='" + val +"' WHERE name='scheduleinfo'";
        Utils.execNonQuery(qry);
    }
    
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadSchedulinginfo")){
            uploadEmployees(args[0]);
        }
    }
}
