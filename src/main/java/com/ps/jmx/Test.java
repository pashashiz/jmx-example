package com.ps.jmx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test implements TestMBean {

    private String format = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";

    public String getDate() {
        return new SimpleDateFormat(format).format(new Date());
    }

    public String getDateFormat() {
        return format;
    }

    public void setDateFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "TestMBean{" +
                "date='" + getDate() + '\'' +
                ", in format='" + format + '\'' +
                '}';
    }
}
