package model;

import java.util.Date;
import java.util.Objects;

import org.bson.codecs.pojo.annotations.BsonId;

public class AppointmentDTO {

	@BsonId
	private String id;
	private String reason;
	private Date dateFrom;
	private Date dateTo;
	private String statusId;
	private String status;
	private String patientId;
	private String patientName;
	private String patientSurname1;
	private String patientSurname2;
	private Date patientBirthDate;
	private String patientAlergy;
	private String patientHabit;
	private String patientDniNie;
	private String patientEmail;
	private String patientPhoneNumber;
	
	
	
	public AppointmentDTO() {
		
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	public Date getDateFrom() {
		return dateFrom;
	}



	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}



	public Date getDateTo() {
		return dateTo;
	}



	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}



	public String getStatusId() {
		return statusId;
	}



	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getPatientId() {
		return patientId;
	}



	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}



	public String getPatientName() {
		return patientName;
	}



	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}



	public String getPatientSurname1() {
		return patientSurname1;
	}



	public void setPatientSurname1(String patientSurname1) {
		this.patientSurname1 = patientSurname1;
	}



	public String getPatientSurname2() {
		return patientSurname2;
	}



	public void setPatientSurname2(String patientSurname2) {
		this.patientSurname2 = patientSurname2;
	}



	public Date getPatientBirthDate() {
		return patientBirthDate;
	}



	public void setPatientBirthDate(Date patientBirthDate) {
		this.patientBirthDate = patientBirthDate;
	}



	public String getPatientAlergy() {
		return patientAlergy;
	}



	public void setPatientAlergy(String patientAlergy) {
		this.patientAlergy = patientAlergy;
	}



	public String getPatientHabit() {
		return patientHabit;
	}



	public void setPatientHabit(String patientHabit) {
		this.patientHabit = patientHabit;
	}



	public String getPatientDniNie() {
		return patientDniNie;
	}



	public void setPatientDniNie(String patientDniNie) {
		this.patientDniNie = patientDniNie;
	}



	public String getPatientEmail() {
		return patientEmail;
	}



	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}



	public String getPatientPhoneNumber() {
		return patientPhoneNumber;
	}



	public void setPatientPhoneNumber(String patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}



	@Override
	public int hashCode() {
		return Objects.hash(dateFrom, dateTo, id, patientAlergy, patientBirthDate, patientDniNie, patientEmail,
				patientHabit, patientId, patientName, patientPhoneNumber, patientSurname1, patientSurname2, reason,
				status, statusId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppointmentDTO other = (AppointmentDTO) obj;
		return Objects.equals(dateFrom, other.dateFrom) && Objects.equals(dateTo, other.dateTo)
				&& Objects.equals(id, other.id) && Objects.equals(patientAlergy, other.patientAlergy)
				&& Objects.equals(patientBirthDate, other.patientBirthDate)
				&& Objects.equals(patientDniNie, other.patientDniNie)
				&& Objects.equals(patientEmail, other.patientEmail) && Objects.equals(patientHabit, other.patientHabit)
				&& Objects.equals(patientId, other.patientId) && Objects.equals(patientName, other.patientName)
				&& Objects.equals(patientPhoneNumber, other.patientPhoneNumber)
				&& Objects.equals(patientSurname1, other.patientSurname1)
				&& Objects.equals(patientSurname2, other.patientSurname2) && Objects.equals(reason, other.reason)
				&& Objects.equals(status, other.status) && Objects.equals(statusId, other.statusId);
	}



	@Override
	public String toString() {
		return "AppointmentDTO [id=" + id + ", reason=" + reason + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", statusId=" + statusId + ", status=" + status + ", patientId=" + patientId + ", patientName="
				+ patientName + ", patientSurname1=" + patientSurname1 + ", patientSurname2=" + patientSurname2
				+ ", patientBirthDate=" + patientBirthDate + ", patientAlergy=" + patientAlergy + ", patientHabit="
				+ patientHabit + ", patientDniNie=" + patientDniNie + ", patientEmail=" + patientEmail
				+ ", patientPhoneNumber=" + patientPhoneNumber + "]";
	}



}