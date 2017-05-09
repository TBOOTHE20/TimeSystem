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
    protected static void uploadSchedulingInfo(String val){
        String qry = "UPDATE objects SET val='" + val +"' WHERE name='scheduleinfo'";
        Utils.execNonQuery(qry);
    }
    
 /*   protected static void getEmployees(String val,String valtime , String valskill){
        String qry = "SELECT objects SET val='" + val +"' WHERE name='scheduleinfo'";
        String x =Utils.execQuery(qry);//does the query 
        //convert x bac to object
    }
 */   
    public static void main(String [] args){
        String op = args[0];
        if(op.equals("uploadSchedulinginfo")){
            uploadSchedulingInfo(args[1]);
        }
        /*else{
            getEmployees(args[1],args[2],args[3]);//day time skill
        }*/
    }
}
