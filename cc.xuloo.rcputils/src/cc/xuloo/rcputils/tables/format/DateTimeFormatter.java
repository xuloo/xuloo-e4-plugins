package cc.xuloo.rcputils.tables.format;

import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;

import cc.xuloo.rcputils.properties.IValueFormatter;

public class DateTimeFormatter implements IValueFormatter<Object, String> {

	private final org.joda.time.format.DateTimeFormatter format;

	private DateTimeFormatter() {
		this.format = null;
	}

	public DateTimeFormatter(org.joda.time.format.DateTimeFormatter format) {
		this.format = format;
		
		//DateTimeFormat.forPattern("MMM d")
	}

	public String format(Object obj) {
		if (format == null)
			return String.valueOf(obj);
		
		if (obj instanceof Long)
			return format.print((Long) obj);
		
		if (obj instanceof ReadableInstant) 
			return format.print((ReadableInstant) obj);
		
		if (obj instanceof ReadablePartial) 
			return format.print((ReadablePartial) obj);
		
		return "";
	}

	public Object parse(String str) {
		if (format == null) {
			return str;
		}
		try {
			return format.parseDateTime(str);
		} catch (Exception e) {
			throw new InvalidValueException(e.getMessage() + " for \"" + str + "\"", e);
		}
	}
}
