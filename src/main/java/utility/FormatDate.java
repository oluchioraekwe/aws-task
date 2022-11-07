package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate{
	//private String dateString;
	
	
	public FormatDate() {
		super();
	}


	public String formatedDate(String dateString) {
		String[] strings = dateString.split("T");
		String[] strings2 = strings[1].split("\\+");
		String string = strings[0].concat(" "+strings2[0]);
		return string;
	}
	
	
	public Long dateDifference(String date1, String date2){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long difference_In_Days = 0;
		try {
			Date key1 = dateFormat.parse(date1);
			Date key2 = dateFormat.parse(date2);
			long difference_In_Time= key2.getTime() - key1.getTime();
			 difference_In_Days= (difference_In_Time/ (1000 * 60 * 60 * 24)) % 365;
		} catch (Exception e) {
			e.printStackTrace();
		}

	
		return  difference_In_Days;
		
	}
	
	public String currentDate() {
		 Date date = new Date();
		 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String dateString = dateFormat.format(date);
		 return dateString;
	}
	

}

