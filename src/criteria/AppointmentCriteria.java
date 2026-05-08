package criteria;

import java.util.Date;
import java.util.Objects;

public class AppointmentCriteria {

	private String id;
	private String reason;
	private Date dateTime;
	private String patientId;
	
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

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateTime, id, patientId, reason);
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
		return Objects.equals(dateTime, other.dateTime) && Objects.equals(id, other.id)
				&& Objects.equals(patientId, other.patientId) && Objects.equals(reason, other.reason);
	}

	@Override
	public String toString() {
		return "AppointmentCriteria [id=" + id + ", reason=" + reason + ", dateTime=" + dateTime + ", patientId="
				+ patientId + "]";
	}
	
	
}
