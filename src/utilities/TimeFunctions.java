/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Marek
 */
public class TimeFunctions {
    public static long timestampToLong(Timestamp time){
        long ans = time.getTime();
        return ans;
    }
    public static Timestamp longToTimestamp(long number){
        Timestamp ans = new Timestamp(number);
        return ans;
    }
    public static long nowTimestamp(){
    	 Date date = new Date();	 
         long timeLong = date.getTime();
         return timeLong;
    }
    public static boolean passTime(long changeDate){
        long expirationTime = 30*24*60*60*1000;
        boolean ans = false;
        if ((nowTimestamp()-changeDate > expirationTime)){
            ans =  true;
        }    
        return ans;
    }
    public static int nowYear(){
        Date date = new Date();
        int year = date.getYear()+1900;
        return year;
    }
}
