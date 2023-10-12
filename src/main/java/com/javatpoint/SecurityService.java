package com.javatpoint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.javatpoint.bo.Data;
import com.javatpoint.data.TestData;
import com.javatpoint.model.AppointmentDetails;

@Service
public class SecurityService implements ISecurityService {
	int alertCounter =0;

	@Override
	public String addAlert(String appointmentIdr,String status) {

		Alert alert = new Alert(alertCounter++, Integer.parseInt(appointmentIdr.trim()), (new Date(System.currentTimeMillis()).toString()), status);

		TestData.Alert.add(alert);

		return "success";

	}

	

	@Override
	public Data getReports() {
		
		
		Data data = new Data();
		data.setTotal(TestData.AppointmentDetails.size());
		int colourGreen=0;
		int colourRed=0;
		int colourYellow=0;
		//data.setGreen(2);
		//data.setRed(2);
		//data.setYellow(2);
		List<AppointmentDetails> apd = new ArrayList<AppointmentDetails>();
		for (Map.Entry<String, AppointmentDetails> entry : TestData.AppointmentDetails.entrySet()) {
			if(entry.getValue().getStatus()==1)
			{
				colourGreen++;
			}else if(entry.getValue().getStatus()==2){
				colourYellow++;
			}else if(entry.getValue().getStatus()==3){
				colourRed++;
			}

		apd.add(entry.getValue());
		}

		
			data.setGreen(colourGreen);
		
		
			data.setYellow(colourYellow);
		
			data.setRed(colourRed);
		
		data.setAppointmentDetailsList(apd);
		return data;
	}
	@Override
	public String updateSOS(String appointmentIdr) {
		TestData.AppointmentDetails.get(appointmentIdr).setStatus(3);
		return "success";
	}



	@Override
	public String checkInOut(String appointmentIdr,String status) {
		if(TestData.AppointmentDetails.get(appointmentIdr) != null){
		TestData.AppointmentDetails.get(appointmentIdr).setStatus(Integer.parseInt(status));
		return "success";
		}else {
			return "fail";
		}
	}



	@Override
	public Data getReportsColour(int colourCode) {
		
		Data data = new Data();
		data.setTotal(TestData.AppointmentDetails.size());
		int colourCount=0;
		//data.setGreen(2);
		//data.setRed(2);
		//data.setYellow(2);
		List<AppointmentDetails> apd = new ArrayList<AppointmentDetails>();
		for (Map.Entry<String, AppointmentDetails> entry : TestData.AppointmentDetails.entrySet()) {
			if(entry.getValue().getStatus()==colourCode)
			{
				colourCount++;
			apd.add(entry.getValue());
		}
		}

		if(colourCode==1)
		{
			data.setGreen(colourCount);
		}else if(colourCode==2)
		{
			data.setYellow(colourCount);
		}
		else if(colourCode==3){
			data.setRed(colourCount);
		}
		data.setAppointmentDetailsList(apd);
		return data;
		
	}
}
