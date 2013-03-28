package cc.xuloo.ds;

import org.joda.time.DateTime;

public class DateUtils {

	public static int daysBetween(DateTime from, DateTime to) {
		
		int i = 0;
		
		while ((from = from.plusDays(1)).isBefore(to)) {
			i++;
		}
		
		return i;
	}
}
