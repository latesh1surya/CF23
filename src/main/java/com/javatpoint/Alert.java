package com.javatpoint;

import org.springframework.format.annotation.DateTimeFormat;

public class Alert {

    private int idr;
    private int apptIdr;
    private String responseTime;
    private String responseValue;

    
    public Alert(int idr, int apptIdr, String responseTime, String responseValue) {
        this.idr = idr;
        this.apptIdr = apptIdr;
        this.responseTime = responseTime;
        this.responseValue = responseValue;
    }
    public int getIdr() {
        return idr;
    }
    public void setIdr(int idr) {
        this.idr = idr;
    }
    public int getApptIdr() {
        return apptIdr;
    }
    public void setApptIdr(int apptIdr) {
        this.apptIdr = apptIdr;
    }
    public String getResponseTime() {
        return responseTime;
    }
    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }
    public String getResponseValue() {
        return responseValue;
    }
    public void setResponseValue(String responseValue) {
        this.responseValue = responseValue;
    }

    
    
}
