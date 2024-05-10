package com.yk.ykerp.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtils {

    public static final String DT1_YMD = "yyyyMMdd";
    public static final String DT1_HMS = "HHmmss";
    public static final String DT1_YMDHMS = "yyyyMMddHHmmss";
    public static final String DT1_YMDHMSS = "yyyyMMddHHmmssSSS";
    public static final String DT2_YMD = "yyyy-MM-dd";
    public static final String DT2_HMS = "HH:mm:ss";
    public static final String DT2_YMDHMS = "yyyy-MM-dd HH:mm:ss";
    public static final String DT2_YMDHMSS = "yyyy-MM-dd HH:mm:ss.SSS";


    public static String formatLocalDate(LocalDate localDate, String pattern) {
        return localDate.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String formatLocalTime(LocalTime localTime, String pattern) {
        return localTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String formatLocalDateTime(LocalDateTime localDateTime, String pattern) {
        return localDateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDate parseLocalDate(String localDateStr, String pattern) {
        return LocalDate.parse(localDateStr, DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalTime parseLocalTime(String localTimeStr, String pattern) {
        return LocalTime.parse(localTimeStr, DateTimeFormatter.ofPattern(pattern));
    }

    public static LocalDateTime parseLocalDateTime(String localDateTimeStr, String pattern) {
        return LocalDateTime.parse(localDateTimeStr, DateTimeFormatter.ofPattern(pattern));
    }


}
