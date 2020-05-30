package com.dmolina.algorithms;

public class TimeConversion {

	public static void main(String[] args) {
		String s = "12:45:54PM";
		String res = timeConversion(s);
		System.out.println(res);
	}
	
    static String timeConversion(String s) {
    	String[] hours_12 = {"01","02","03","04","05","06","07","08","09","10","11","12"};
    	
    	String[] am_mil   = {"01","02","03","04","05","06","07","08","09","10","11","00"};
    	String[] pm_mil   = {"13","14","15","16","17","18","19","20","21","22","23","12"};
    	
        String res 			= "";
        String[] time 		= s.split(":");
        String hour 		= time[0];
        String minutes 		= time[1];
        String seconds 		= time[2].substring(0, 2);
        String ampm 		= time[2].substring(2);
        
        System.out.println(hour+":"+minutes+":"+seconds+":"+ampm);
        
        for(int i=0;i<hours_12.length;i++) {
        	if(hour.equalsIgnoreCase(hours_12[i])) {
		        if(ampm.equals("PM")) {
		        	hour = pm_mil[i];
		        }else {
		        	hour = am_mil[i];
		        }
        	}
        }
        
        return hour+":"+minutes+":"+seconds;
    }

}
