package com.javatpoint;

public class AppointmentDetails {

	private String idr;

	private int Countsellor;

	private int client;

	private int admin;

	private String appointmentStartTime;

	private String appointmentEndTime;

	private String appointmentLocation;

	private String authorityContact;

	private String result;

	private int status;

	private String creationDate;

	public AppointmentDetails(String idr, int countsellor, int client, int admin, String appointmentStartTime,
			String appointmentEndTime, String appointmentLocation, String authorityContact, String result,
			int status, String creationDate) {
		this.idr = idr;
		Countsellor = countsellor;
		this.client = client;
		this.admin = admin;
		this.appointmentStartTime = appointmentStartTime;
		this.appointmentEndTime = appointmentEndTime;
		this.appointmentLocation = appointmentLocation;
		this.authorityContact = authorityContact;
		this.result = result;
		this.status = status;
		this.creationDate = creationDate;
	}

	public String getIdr() {
		return idr;
	}

	public void setIdr(String idr) {
		this.idr = idr;
	}

	public int getCountsellor() {
		return Countsellor;
	}

	public void setCountsellor(int countsellor) {
		Countsellor = countsellor;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public int getAdmin() {
		return admin;
	}

	public void setAdmin(int admin) {
		this.admin = admin;
	}

	public String getAppointmentStartTime() {
		return appointmentStartTime;
	}

	public void setAppointmentStartTime(String appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}

	public String getAppointmentEndTime() {
		return appointmentEndTime;
	}

	public void setAppointmentEndTime(String appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}

	public String getAppointmentLocation() {
		return appointmentLocation;
	}

	public void setAppointmentLocation(String appointmentLocation) {
		this.appointmentLocation = appointmentLocation;
	}

	public String getAuthorityContact() {
		return authorityContact;
	}

	public void setAuthorityContact(String authorityContact) {
		this.authorityContact = authorityContact;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

}
