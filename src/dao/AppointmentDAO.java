package dao;

import criteria.AppointmentCriteria;
import model.AppointmentDTO;

public interface AppointmentDAO {
	
	public abstract String findById(String id) throws Exception;
	public abstract String findByPatientId(String patientId) throws Exception;
	public abstract AppointmentCriteria findCriteria(AppointmentCriteria id) throws Exception;
	public abstract boolean update(AppointmentDTO appointment) throws Exception;
	public abstract AppointmentDTO create(AppointmentDTO appointment) throws Exception;
	public abstract boolean delete(String id) throws Exception;

}
