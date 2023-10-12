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
		data.setGreen(2);
		data.setRed(2);
		data.setYellow(2);
		List<AppointmentDetails> apd = new ArrayList<AppointmentDetails>();
		for (Map.Entry<String, AppointmentDetails> entry : TestData.AppointmentDetails.entrySet()) {
			apd.add(entry.getValue());
		}
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
		TestData.AppointmentDetails.get(appointmentIdr).setStatus(Integer.parseInt(status));
		return "success";
	}
}
