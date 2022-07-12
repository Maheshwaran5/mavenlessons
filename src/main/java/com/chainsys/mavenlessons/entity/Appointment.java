package com.chainsys.mavenlessons.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Appointment")
public class Appointment {
    @Id
    @Column(name = "APP_ID")
    private int id;

    @Column(name = "APP_DATE")
    private Date appointDate;

    @Column(name = "PATIENT_NAME")
    private String patientName;
    
    @Column(name = "DOC_ID ")
    private int doctorId;

    @Column(name = "FEES_COLLECTED")
    private int feesCollected;

    @Column(name = "FEES_CATEGORY")
    private String feesCategory;
    
 // @Joincolumn maps the column (Doc_ID) of the current Entity Appointment 
 // with the PrimaryKey column (Id) of the associated Entity Doctor
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DOC_ID" , nullable = false,
	insertable = false ,updatable = false)
    @JsonIgnore
	private Doctor doctor;
	public Doctor getDoctor() {  
		return this.doctor;
	}
	public void setDoctor(Doctor doc) {
		this.doctor=doc;
	}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAppointDate() {
        return appointDate;
    }

    public void setAppointDate(Date appointDate) {
        this.appointDate = appointDate;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getFeesCollected() {
        return feesCollected;
    }

    public void setFeesCollected(int feesCollected) {
        this.feesCollected = feesCollected;
    }

    public String getFeesCategory() {
        return feesCategory;
    }

    public void setFeesCategory(String feesCategory) {
        this.feesCategory = feesCategory;
    }

    

    @Override
    public String toString() {
        return String.format("%d, %s, %s, %f, %s", id, appointDate, patientName, feesCollected, feesCategory);
    }

}
