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
public class Employee implements java.io.Serializable {

    ArrayList<Timeslot> myListofTimeSlots = new ArrayList();
    ArrayList<String> myListofSkills = new ArrayList();

    public Employee() {

    }

    public Employee(ArrayList<Timeslot> inpListofTimeSlots, ArrayList<String> inpListofSkills) {
        this.myListofTimeSlots = inpListofTimeSlots;
        this.myListofSkills = inpListofSkills;

    }

    public boolean hasSkill(String s) {
        for (int i = 0; i < this.myListofSkills.size(); i++) {
            if (this.myListofSkills.get(i) == s) {
                return true;
            }
        }

        return false;
    }

    public boolean isAvailable(String inpday, int inphour) {
        for (int i = 0; i < this.myListofTimeSlots.size(); i++) {
            if (this.myListofTimeSlots.get(i).day.equals(inpday) & this.myListofTimeSlots.get(i).hour == inphour) {
                return true;
            }
        }

        return false;
    }

    public void addTimeSlot(String day, int hour) {
        Timeslot t = new Timeslot(day, hour);
        //add to array
        myListofTimeSlots.add(t);
    }

    public void addSkill(String skill) {

        //add to array
        myListofSkills.add(skill);

    }

}
