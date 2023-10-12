package com.javatpoint.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.javatpoint.model.AppointmentDetails;
import com.javatpoint.model.Counsellor;

public class TestData {

public static HashMap<String, AppointmentDetails> AppointmentDetails;

public static HashMap<String, Counsellor> CounsellorMap;

public static HashMap<String, com.javatpoint.model.Client> clientMap;

public static HashMap<String, Object> Admin;

public static List<com.javatpoint.Alert> Alert = new ArrayList<com.javatpoint.Alert>();

static {

String start = "22-02-2023 16:00";
String end = "22-02-2023 17:00";

clientMap = new HashMap<>();

com.javatpoint.model.Client client1 = new com.javatpoint.model.Client(1, "jack", "Kharadi", "Pune", "9873489039",
"Mental illness", start, "josh", "jill", end);
com.javatpoint.model.Client client2 = new com.javatpoint.model.Client(2, "john", "Mundhwa", "Pune", "9873482039",
"Bereavement", start, "josh", "jill", end);

clientMap.put("1", client1);
clientMap.put("2", client2);

CounsellorMap = new HashMap<>();

Counsellor counsellor1 = new Counsellor(1, "happy", "Aundh", "Pune", "8734378283", "Mtech", start, "admin",
"admin", end);
Counsellor counsellor2 = new Counsellor(2, "sunny", "Khadki", "Pune", "8734362283", "Mtech", start, "admin",
"admin", end);

CounsellorMap.put("1", counsellor1);
CounsellorMap.put("2", counsellor2);

AppointmentDetails = new HashMap<String, AppointmentDetails>();

AppointmentDetails data1 = new AppointmentDetails(1, 1,"happy", 1,"jack", 1, "13-10-23 11:00:00", "11-10-23 12:00:00",
"Pune", "Jack", "Inprogress", 0, "11-10-23 11:12:00");

AppointmentDetails data2 = new AppointmentDetails(2, 1,"happy", 2, "john",1, "13-10-23 11:30:00", "11-10-23 13:00:00",
"Pune", "Jack", "Inprogress", 0, "11-10-23 11:12:00");

AppointmentDetails data3 = new AppointmentDetails(3, 2,"jack", 1, "jack",1, "13-10-23 11:00:00", "13-10-23 13:00:00",
"Pune", "Jack", "Inprogress", 0, "11-10-23 11:12:00");

AppointmentDetails data4 = new AppointmentDetails(4, 2, "jack",2,"john", 1, "13-10-23 11:00:00", "14-10-23 14:30:00",
"Pune", "Jack", "Inprogress", 0, "11-10-23 11:12:00");


AppointmentDetails data5 = new AppointmentDetails(5, 1, "happy",2, "john",1, "11-10-23 11:30:00", "11-10-23 13:00:00",
"Pune", "Jack", "Inprogress", 1, "11-10-23 11:12:00");

AppointmentDetails data6 = new AppointmentDetails(6, 2,"happy", 1,"jack", 1, "13-10-23 11:00:00", "13-10-23 13:00:00",
"Pune", "Jack", "Inprogress", 2, "11-10-23 11:12:00");

AppointmentDetails data7 = new AppointmentDetails(7, 2,"happy", 2,"john", 1, "14-10-23 11:00:00", "14-10-23 14:30:00",
"Pune", "Jack", "Inprogress", 3, "11-10-23 11:12:00");

AppointmentDetails.put("1", data1);

AppointmentDetails.put("2", data2);

AppointmentDetails.put("3", data3);

AppointmentDetails.put("4", data4);

AppointmentDetails.put("5", data5);

AppointmentDetails.put("6", data6);

AppointmentDetails.put("7", data7);

}
}
