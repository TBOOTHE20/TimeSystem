package timesystem;

import timesystem.model.Timeslot;
import timesystem.model.Employee;
import timesystem.model.ScheduleInfo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.URLEncoder;
import java.util.Base64;

/**
 *
 * @author csc190
 */
public class TimeSystem implements java.io.Serializable {

    protected static ScheduleInfo buildSchedule() {

        ScheduleInfo sinfo = new ScheduleInfo();

        String[] arrEvilDays = {"M", "W", "F"};
        int[] arrEvilHours = {9, 10, 11, 12, 19, 20};
        String[] arrEvilSkills = {"Butcher", "Saucier", "Baker"};
        Employee Evil = new Employee();

        String[] arrMiniMeDays = {"T", "W", "F"};
        int[] arrMiniMeHours = {9, 10, 12, 14, 15, 17, 18};
        String[] arrMiniMeSkills = {"Saucier", "Baker"};
        Employee MiniMe = new Employee();

        String[] arrNumberTwoDays = {"M", "F"};
        int[] arrNumberTwoHours = {12, 13, 14, 15, 16, 17, 18};
        String[] arrNumberTwoSkills = {"Butcher", "Dishwasher"};
        Employee NumberTwo = new Employee();

        String[] arrAustinPowerDays = {"T", "R"};
        int[] arrAustinPowerHours = {8, 9, 10, 11, 12, 13, 14};
        String[] arrAustinPowerSkills = {"Baker", "Saucier"};
        Employee AustinPower = new Employee();

        buildEmployee(Evil, arrEvilDays, arrEvilHours, arrEvilSkills);
        buildEmployee(MiniMe, arrMiniMeDays, arrMiniMeHours, arrMiniMeSkills);
        buildEmployee(NumberTwo, arrNumberTwoDays, arrNumberTwoHours, arrNumberTwoSkills);
        buildEmployee(AustinPower, arrAustinPowerDays, arrAustinPowerHours, arrAustinPowerSkills);

        //sInfo.addEmployee oneby one
        Employee[] arrEm = {Evil, MiniMe, NumberTwo, AustinPower};

        for (Employee ee : arrEm) {
            sinfo.addEmployee(ee);
        }

        return sinfo;

    }//end of method ...

    protected static Employee buildEmployee(Employee e, String[] arrdays, int[] arrhours, String[] arrskills) {
        for (String arrday : arrdays) {
            for (int x = 0; x < arrhours.length; x++) {
                e.addTimeSlot(arrday, arrhours[x]);
            }
        }

        for (String arrskill : arrskills) {
            e.addSkill(arrskill);
        }
        return e;
    }

    public static void main(String[] args) {
        ScheduleInfo employees = buildSchedule();
        String url = "http://localhost/datasel.php";
        String employeestogether = Utils.toStr(employees);
        String datastring = "op=uploadSchedulinginfo&val" + employeestogether;
        try {
            String response = Utils.httpsPost(url, datastring);
            System.out.println(response);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }

}
