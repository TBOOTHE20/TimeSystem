/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timesystem;

/**
 *
 * @author csc190
 */
public class ClientQuery {
 
    
    public static void main(String[] args){
    
        String operation = args[0];
        String operation2 = args[1];
        
        
        String url = "http://localhost/datasel.php";
        String datastring = "op=getEmployee&time=" + operation+"&addSkills="+operation2;
        try {
            String response = Utils.httpsPost(url, datastring);
            System.out.println(response);
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
    
        
    }
    

