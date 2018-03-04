package Util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HandleDate {
    public static LocalDateTime convertStringToDate(String dateString)
    {
        LocalDateTime formatDate=LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss"));
        return formatDate;
    }
}
