package service.impl;

import dao.PatientDAO;
import dao.impl.PatientDAOImpl;
import model.PatientDTO;
import service.PatientService;
import util.Results;

public class PatientServiceImpl implements PatientService {

	private PatientDAO patientDAO;
	
	private PatientServiceImpl() {
		patientDAO = new PatientDAOImpl();
	}
	
	@Override
	public PatientDTO findById(String id) throws Exception {
		return patientDAO.findById(id);
	}

	@Override
	public boolean update(model.PatientDTO patient) throws Exception {
		return patientDAO.update(patient);
	}

	@Override
	public PatientDTO create(PatientDTO patient) throws Exception {
		return patientDAO.create(patient);
	}

	@Override
	public boolean delete(String id) throws Exception {
		return patientDAO.delete(id);
	}

	@Override
	public Results<PatientDTO> findByCriteria(criteria.PatientCriteria criteria, int from, int pageSize)
			throws Exception {
		return patientDAO.findByCriteria(criteria, from, pageSize);
	}

}
