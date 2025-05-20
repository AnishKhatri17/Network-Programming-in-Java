/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package npquestion4;
import java.net.*;

public class NPQuestion4 {


    public static void main(String[] args) {
       
        try{
            InetAddress ip = InetAddress.getByName("www.facebook.com");
            InetAddress ip1 = InetAddress.getByName("www.google.com");
            
            String str1 = ip.toString();
            String str2 = ip1.toString();
          
            System.out.println("1. "+str1);
            System.out.println("2. "+str2);
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
