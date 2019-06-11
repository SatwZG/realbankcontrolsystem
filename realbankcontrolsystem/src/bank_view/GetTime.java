package bank_view;

import java.util.Date;
import java.text.SimpleDateFormat;

public class GetTime {
     public GetTime() {
          System.out.print(getTime());
     }
     public static String getTime() {
    	 SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd HH:MM:ss");
    	 String time = format.format(new Date());
    	 return time;
     }
     public static void main(String[] args)
    	{
    		new GetTime();
    		
    	}
}
