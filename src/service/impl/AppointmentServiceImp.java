package service.impl;

import criteria.AppointmentCriteria;
import dao.AppointmentDAO;
import dao.impl.AppointmentDAOImpl;
import model.AppointmentDTO;
import service.AppointmentService;
import util.Results;

public class AppointmentServiceImp implements AppointmentService {
	
	private AppointmentDAO appointmentDAO = null;
	
	public AppointmentServiceImp() {
		appointmentDAO = new AppointmentDAOImpl();
	}

	@Override
	public AppointmentDTO findById(String id) throws Exception {
		return appointmentDAO.findById(id);
	}

	@Override
	public String findByPatientId(String patientId) throws Exception {
		return appointmentDAO.findByPatientId(patientId);
	}

	@Override
	public Results<AppointmentDTO> findByCriteria(AppointmentCriteria id, int from, int pageSize)
			throws Exception {
		return appointmentDAO.findByCriteria(id, from, pageSize);
	}

	@Override
	public boolean update(AppointmentDTO appointment) throws Exception {
		return appointmentDAO.update(appointment);
	}

	@Override
	public AppointmentDTO create(AppointmentDTO appointment) throws Exception {
		return appointmentDAO.create(appointment);
	}

	@Override
	public boolean delete(String id) throws Exception {
		return appointmentDAO.delete(id);
	}
	
	

}
