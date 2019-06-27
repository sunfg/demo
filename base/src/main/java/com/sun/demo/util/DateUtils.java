package com.sun.demo.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
    public static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";
    public static final String DEFAULT_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DEFAULT_DATEDETAIL_PATTERN = "yyyy-MM-dd HH:mm:ss SSS";
    public static final String DATE8_PATTERN = "yyyyMMdd";
    public static final String DATE10_PATTERN = "yyyy-MM-dd";
    public static final String TIME6_PATTERN = "HHmmss";
    public static final String TIME8_PATTERN = "HH:mm:ss";
    public static final String DATETIME14_PATTERN = "yyyyMMddHHmmss";
    public static final String DATETIME19_PATTERN = "yyyy-MM-dd HH:mm:ss";
    public static final String DATEMSEL17_PATTERN = "yyyyMMddHHmmssSSS";
    public static final String DATEMSEL18_PATTERN = "yyyyMMddHHmmssSSSS";
    public static Date DefaultDate = null;
    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    private static SimpleDateFormat getDateParser(String pattern) {
        return new SimpleDateFormat(pattern);
    }

    public static Date curDate() {
        return new Date();
    }

    public static String curDateStr(String strFormat) {
        Date date = new Date();
        return getDateParser(strFormat).format(date);
    }

    public static String curDateStr() {
        Date date = new Date();
        return getDateParser("yyyy-MM-dd").format(date);
    }

    public static Timestamp curTimestamp() {
        return new Timestamp((new Date()).getTime());
    }

    public static Date toDate(String dateString, String pattern) {
        Date date = null;

        try {
            date = getDateParser(pattern).parse(dateString);
            return date;
        } catch (Exception var4) {
            logger.warn("解析date字符串时出错,返回null. dateString:" + dateString + "ex:" + var4);
            return null;
        }
    }

    public static Date toDate(String dateString) {
        Date date = null;

        try {
            date = getDateParser("yyyy-MM-dd").parse(dateString);
            return date;
        } catch (Exception var3) {
            logger.warn("解析date字符串时出错,返回null. dateString:" + dateString + "ex:" + var3);
            return null;
        }
    }

    public static Date toDateTime(String dateString) {
        Date date = null;

        try {
            date = getDateParser("yyyy-MM-dd HH:mm:ss").parse(dateString);
            return date;
        } catch (Exception var3) {
            logger.warn("解析date字符串时出错,返回null. dateString:" + dateString + "ex:" + var3);
            return null;
        }
    }

    public static String toDateStr(Date date, String pattern) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回空字符串");
            }

            return "";
        } else {
            return getDateParser(pattern).format(date);
        }
    }

    public static String toDateStr(Date date) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回空字符串");
            }

            return "";
        } else {
            return getDateParser("yyyy-MM-dd").format(date);
        }
    }

    public static String toDateTimeStr(Date date) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回空字符串");
            }

            return "";
        } else {
            return getDateParser("yyyy-MM-dd HH:mm:ss").format(date);
        }
    }

    public static String curDateStr8() {
        Date date = new Date();
        return getDateParser("yyyyMMdd").format(date);
    }

    public static String curDateStr10() {
        Date date = new Date();
        return getDateParser("yyyy-MM-dd").format(date);
    }

    public static String curDateTimeStr14() {
        Date date = new Date();
        return getDateParser("yyyyMMddHHmmss").format(date);
    }

    public static String curDateTimeStr19() {
        Date date = new Date();
        return getDateParser("yyyy-MM-dd HH:mm:ss").format(date);
    }

    public static String curTimeStr6() {
        Date date = new Date();
        return getDateParser("HHmmss").format(date);
    }

    public static String curDateMselStr17() {
        Date date = new Date();
        return getDateParser("yyyyMMddHHmmssSSS").format(date);
    }

    public static String curDateMselStr18() {
        Date date = new Date();
        return getDateParser("yyyyMMddHHmmssSSSS").format(date);
    }

    public static Date toDate8(String dateStr) {
        Date date = null;

        try {
            date = getDateParser("yyyyMMdd").parse(dateStr);
            return date;
        } catch (Exception var3) {
            logger.warn("解析date字符串时出错,返回null. dateString:" + dateStr + "ex:" + var3);
            return null;
        }
    }

    public static Date toDate10(String dateStr) {
        Date date = null;

        try {
            date = getDateParser("yyyy-MM-dd").parse(dateStr);
            return date;
        } catch (Exception var3) {
            logger.warn("解析date字符串时出错,返回null. dateString:" + dateStr + "ex:" + var3);
            return null;
        }
    }

    public static Date toDateTime14(String dateStr) {
        Date date = null;

        try {
            date = getDateParser("yyyyMMddHHmmss").parse(dateStr);
            return date;
        } catch (Exception var3) {
            logger.warn("解析date字符串时出错,返回null. dateString:" + dateStr + "ex:" + var3);
            return null;
        }
    }

    public static Date toDateTime19(String dateStr) {
        Date date = null;

        try {
            date = getDateParser("yyyy-MM-dd HH:mm:ss").parse(dateStr);
            return date;
        } catch (Exception var3) {
            logger.warn("解析date字符串时出错,返回null. dateString:" + dateStr + "ex:" + var3);
            return null;
        }
    }

    public static String toDateStr8(Date date) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回空字符串");
            }

            return "";
        } else {
            return getDateParser("yyyyMMdd").format(date);
        }
    }

    public static String toDateStr10(Date date) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回空字符串");
            }

            return "";
        } else {
            return getDateParser("yyyy-MM-dd").format(date);
        }
    }

    public static String toDateTimeStr14(Date date) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回空字符串");
            }

            return "";
        } else {
            return getDateParser("yyyyMMddHHmmss").format(date);
        }
    }

    public static String toDateTimeStr19(Date date) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回空字符串");
            }

            return "";
        } else {
            return getDateParser("yyyy-MM-dd HH:mm:ss").format(date);
        }
    }

    public static Date addDays(Date date, int days) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回null");
            }

            return null;
        } else {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(5, days);
            return calendar.getTime();
        }
    }

    public static boolean isDateBetween(Date date, Date date1, Date date2) {
        return (date1.before(date) || date1.equals(date)) && (date.before(date2) || date.equals(date2));
    }

    public static int getDaysInterval(Date fromDate, Date toDate) {
        if (fromDate != null && toDate != null) {
            long timeInterval = toDate.getTime() - fromDate.getTime();
            int daysInterval = (int) (timeInterval / 86400000L);
            return daysInterval;
        } else {
            logger.warn("getDaysInterval时,传入的对象为空,返回默认值0");
            return 0;
        }
    }

    public static int getWeekOfYear(Date date) {
        if (date == null) {
            logger.warn("传入的对象为空,返回默认值-1");
            return -1;
        } else {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setFirstDayOfWeek(2);
            calendar.setTime(date);
            int week = calendar.get(3);
            return week;
        }
    }

    public static int getDayOfWeek(Date date) {
        if (date == null) {
            logger.warn("传入的对象为空,返回默认值-1");
            return -1;
        } else {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            int day = calendar.get(7);
            --day;
            if (0 == day) {
                day = 7;
            }

            return day;
        }
    }

    public static Date getLastDayInMonth(Date date) {
        return getLastDayInMonth(date, 0);
    }

    public static Date getLastDayInNextMonth(Date date) {
        return getLastDayInMonth(date, 1);
    }

    public static Date getLastDayInMonth(Date date, int i) {
        if (date == null) {
            if (logger.isInfoEnabled()) {
                logger.info("传入的date对象为空,返回null");
            }

            return null;
        } else {
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            calendar.add(2, i + 1);
            calendar.set(5, 1);
            calendar.add(5, -1);
            return calendar.getTime();
        }
    }

    public static String toDateTime(long times) {
        times /= 1000L;
        long hours = times / 3600L;
        times -= hours * 3600L;
        long minutes = times / 60L;
        times -= minutes * 60L;
        String result = hours + "(h) " + minutes + "(m) " + times + "(s)";
        return result;
    }

    public static String dateDiff(String startTime, String endTime, String format) throws Exception {
        SimpleDateFormat sd = new SimpleDateFormat(format);
        long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
        return dateDiff(diff);
    }

    public static String dateDiff(String startTime, String endTime) throws Exception {
        return dateDiff(startTime, endTime, "yyyyMMddHHmmss");
    }

    public static String dateDiff(String startTime) throws Exception {
        return dateDiff(startTime, curDateTimeStr14(), "yyyyMMddHHmmss");
    }

    public static String dateDiff(Date startTime, Date endTime) {
        long diff = endTime.getTime() - startTime.getTime();
        return dateDiff(diff);
    }

    public static String dateDiff(long millisecond) {
        long nd = 86400000L;
        long nh = 3600000L;
        long nm = 60000L;
        long ns = 1000L;
        long day = millisecond / nd;
        long hour = millisecond % nd / nh;
        long min = millisecond % nd % nh / nm;
        long sec = millisecond % nd % nh % nm / ns;
        String ret = "";
        if (sec > 0L) {
            ret = sec + "秒";
        }

        ret = min + "分" + ret;
        if (hour > 0L) {
            ret = hour + "小时" + ret;
        }

        if (day > 0L) {
            ret = day + "天" + ret;
        }

        return ret;
    }
}