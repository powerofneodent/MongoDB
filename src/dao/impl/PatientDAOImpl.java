package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

import criteria.PatientCriteria;
import dao.PatientDAO;
import model.PatientDTO;
import util.Results;

public class PatientDAOImpl implements PatientDAO {
	
	public MongoCollection<PatientDTO> patients = null;

	@Override
	public PatientDTO findById(String id) throws Exception {
		Bson idFilter = Filters.eq("_id", id);
		return patients.find(idFilter).first();
	}

	@Override
	public boolean update(PatientDTO patient) throws Exception {
		try {
			Bson idFilter = Filters.eq("_id", patient.getId());
			Bson updates = null;
			updates = Updates.set("name", patient.getName());
			updates = Updates.set("surname1", patient.getSurname1());
			updates = Updates.set("surname2", patient.getSurname2());
			updates = Updates.set("birthDate", patient.getBirthDate());
			updates = Updates.set("alergy", patient.getAlergy());
			updates = Updates.set("habit", patient.getHabit());
			updates = Updates.set("dniNie", patient.getDniNie());
			updates = Updates.set("email", patient.getEmail());
			updates = Updates.set("phoneNumber", patient.getPhoneNumber());
			updates = Updates.set("addres", patient.getAddres());
			updates = Updates.set("localityId", patient.getLocalityId());
			updates = Updates.set("countryId", patient.getCountryId());
			patients.updateOne(idFilter, updates);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public PatientDTO create(PatientDTO patient) throws Exception {
		if (patient.getId() == null) {
			patient.setId(UUID.randomUUID().toString());
		}
		patients.insertOne(patient);
		return patient;
	}

	@Override
	public boolean delete(String id) throws Exception {
		try {
			Bson idFilter = Filters.eq("_id", id);
			patients.findOneAndDelete(idFilter);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Results<PatientDTO> findByCriteria(PatientCriteria criteria, int from, int pageSize) throws Exception {
		Results<PatientDTO> results = new Results<PatientDTO>();
		
		List<Bson> filters = new ArrayList<Bson>();
		
		if (criteria.getName() != null) {
			filters.add(Filters.eq("name", criteria.getName()));
		}
		
		if (criteria.getSurname1() != null) {
			filters.add(Filters.eq("surname", criteria.getSurname1()));
		}
		return null;
	}

	
}
