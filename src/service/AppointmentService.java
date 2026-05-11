package service;

import criteria.AppointmentCriteria;
import model.AppointmentDTO;
import util.Results;

public interface AppointmentService {
	
	public abstract AppointmentDTO findById(String id) throws Exception;
	public abstract String findByPatientId(String patientId) throws Exception;
	public abstract Results<AppointmentDTO> findByCriteria(AppointmentCriteria id, int from, int pageSize) throws Exception;
	public abstract boolean update(AppointmentDTO appointment) throws Exception;
	public abstract AppointmentDTO create(AppointmentDTO appointment) throws Exception;
	public abstract boolean delete(String id) throws Exception;
}
