package com.javatpoint.bo;

import java.util.List;

import com.javatpoint.model.AppointmentDetails;

public class Data {
    

    private int total;
    private int green;
    private int yellow;
    private int red;

    private List<AppointmentDetails> appointmentDetailsList;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getYellow() {
		return yellow;
	}

	public void setYellow(int yellow) {
		this.yellow = yellow;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public List<AppointmentDetails> getAppointmentDetailsList() {
		return appointmentDetailsList;
	}

	public void setAppointmentDetailsList(List<AppointmentDetails> appointmentDetailsList) {
		this.appointmentDetailsList = appointmentDetailsList;
	}



}
