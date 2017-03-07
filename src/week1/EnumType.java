package week1;

public enum WeekDay {
	   MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
public class Timetable {
	 
	  public static String getJob(WeekDay weekDay) {
	      if (weekDay == WeekDay.SATURDAY || weekDay == WeekDay.SUNDAY) {
	          return "Nothing";
	      }
	      return "Coding";
	  }
	 
	}


