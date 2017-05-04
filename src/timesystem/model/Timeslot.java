/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timesystem.model;

/**
 *
 * @author csc190
 */
public class Timeslot implements java.io.Serializable{
    protected String day;
    protected int hour;
    
    public Timeslot (String inpDay , int inpHour )
    {
        this.day = inpDay;
        this.hour = inpHour;
    }
}
