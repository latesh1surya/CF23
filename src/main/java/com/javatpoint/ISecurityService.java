package com.javatpoint;

import com.javatpoint.bo.Data;

public interface ISecurityService {
    public Data getReports() ;
    public String updateSOS(String appointmentIdr) ;
    public String addAlert(String appointmentIdr,String status) ;
    public String checkInOut(String appointmentIdr,String status);
    

}
