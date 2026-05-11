package criteria;

import java.util.Date;
import java.util.Objects;

public class AppointmentCriteria {

	private String id;
	private String reason;
	private Date dateFrom;
	private Date dateTo;
	private String patientId;
	private String appointmentStatusId;
	
	public AppointmentCriteria() {
		
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

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getAppointmentStatusId() {
		return appointmentStatusId;
	}

	public void setAppointmentStatusId(String appointmentStatusId) {
		this.appointmentStatusId = appointmentStatusId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(appointmentStatusId, dateFrom, dateTo, id, patientId, reason);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppointmentCriteria other = (AppointmentCriteria) obj;
		return Objects.equals(appointmentStatusId, other.appointmentStatusId)
				&& Objects.equals(dateFrom, other.dateFrom) && Objects.equals(dateTo, other.dateTo)
				&& Objects.equals(id, other.id) && Objects.equals(patientId, other.patientId)
				&& Objects.equals(reason, other.reason);
	}

	@Override
	public String toString() {
		return "AppointmentCriteria [id=" + id + ", reason=" + reason + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", patientId=" + patientId + ", appointmentStatusId=" + appointmentStatusId + "]";
	}

}