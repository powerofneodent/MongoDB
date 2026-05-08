package dao;

import criteria.PatientCriteria;
import model.PatientDTO;
import util.Results;

public interface PatientDAO {

	public abstract PatientDTO findById(String id) throws Exception;
	public abstract boolean update(PatientDTO patient) throws Exception;
	public abstract PatientDTO create(PatientDTO patient) throws Exception;
	public abstract boolean delete(String id) throws Exception;
	public abstract Results<PatientDTO> findByCriteria(PatientCriteria criteria, int from,int pageSize) throws Exception;
	
}
