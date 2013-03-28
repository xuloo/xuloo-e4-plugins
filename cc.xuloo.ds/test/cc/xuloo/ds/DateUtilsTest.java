package cc.xuloo.ds;

import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.junit.Test;

public class DateUtilsTest {

	@Test
	public void testDaysBetween() {
		
		DateTime from = DateTime.now().minusDays(3);
		DateTime to = DateTime.now();
		
		int count = DateUtils.daysBetween(from, to);
		
		assertEquals(3, count);
	}

}
