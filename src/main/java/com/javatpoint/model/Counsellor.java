package com.javatpoint.model;

import org.springframework.format.annotation.DateTimeFormat;

public class Counsellor {
    

    private int IDR;

    private String Name;

    private String Address1;

    private String Address2;

    private String contact;

    private String education;

    private String creatonDate;

    private String createdBy;

    private String updatedBy;

    private String updatedDate;

    public int getIDR() {
        return IDR;
    }
    public void setIDR(int iDR) {
        IDR = iDR;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getAddress1() {
        return Address1;
    }
    public void setAddress1(String address1) {
        Address1 = address1;
    }
    public String getAddress2() {
        return Address2;
    }
    public void setAddress2(String address2) {
        Address2 = address2;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getEducation() {
        return education;
    }
    public void setEducation(String education) {
        this.education = education;
    }
    public String getCreatonDate() {
        return creatonDate;
    }
    public void setCreatonDate(String creatonDate) {
        this.creatonDate = creatonDate;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getUpdatedBy() {
        return updatedBy;
    }
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
    public String getUpdatedDate() {
        return updatedDate;
    }
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }
    public Counsellor(int iDR, String name, String address1, String address2, String contact, String education,
            String creatonDate, String createdBy, String updatedBy, String updatedDate) {
        IDR = iDR;
        Name = name;
        Address1 = address1;
        Address2 = address2;
        this.contact = contact;
        this.education = education;
        this.creatonDate = creatonDate;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }
    
    

    
}

