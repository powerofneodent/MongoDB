package dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bson.conversions.Bson;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import criteria.AppointmentCriteria;
import dao.AppointmentDAO;
import model.AppointmentDTO;
import util.Results;

public class AppointmentDAOImpl implements AppointmentDAO {

	public MongoCollection<AppointmentDTO> appointments = null;
	
	public AppointmentDAOImpl() {
		
	}
	
	@Override
	public AppointmentDTO findById(String id) throws Exception {
		Bson idFilter = Filters.eq("_id", id);
			return appointments.find(idFilter).first();
		
	}

	@Override
	public String findByPatientId(String patientId) throws Exception {
			Bson patientIdFilter = Filters.eq("patientId", patientId);
			AppointmentDTO appointment = appointments.find(patientIdFilter).first();
			if (appointment != null) {
				return appointment.getId();
			}
		return null;
	}

	@Override
	public Results<AppointmentDTO> findByCriteria(AppointmentCriteria id, int from, int pageSize) throws Exception {
		Results<AppointmentDTO> results = new Results<>();
		
		List<Bson> filters = new ArrayList<>();
		if (id.getReason() != null) {
			filters.add(Filters.eq("reason", id.getReason()));
		}
		if (id.getDateFrom() != null) {
			filters.add(Filters.gte("dateTime", id.getDateFrom()));
		}
		if (id.getDateTo() != null) {
			filters.add(Filters.lte("dateTime", id.getDateTo()));
		}
		if (id.getPatientId() != null) {
			filters.add(Filters.eq("patientId", id.getPatientId()));
		}
		
		Bson finalFilter = filters.isEmpty() ? Filters.empty() : Filters.and(filters);
		int skipValue = Math.max(0, from -1);
		List<AppointmentDTO> appointmentList = appointments.find(finalFilter).skip(skipValue).limit(pageSize).into(new ArrayList<>());
		
		results.setPage(appointmentList);
		long total = appointments.countDocuments(finalFilter);
		results.setTotal((int) total);
		return results;
	}

	@Override
	public boolean update(AppointmentDTO appointment) throws Exception {
		try {	
		Bson idFilter = Filters.eq("_id", appointment.getId());
			Bson updates = null;
			updates = Filters.eq("reason", appointment.getReason());
			updates = Filters.eq("dateTime", appointment.getDateFrom());
			updates = Filters.eq("dateTime", appointment.getDateTo());
			updates = Filters.eq("patientId", appointment.getPatientId());
			updates = Filters.eq("patientName", appointment.getPatientName());
			updates = Filters.eq("patientSurname1", appointment.getPatientSurname1());
			updates = Filters.eq("patientSurname2", appointment.getPatientSurname2());
			updates = Filters.eq("patientBirthDate", appointment.getPatientBirthDate());
			updates = Filters.eq("patientAlergy", appointment.getPatientAlergy());
			updates = Filters.eq("patientHabit", appointment.getPatientHabit());
			updates = Filters.eq("patientDniNie", appointment.getPatientDniNie());
			updates = Filters.eq("patientEmail", appointment.getPatientEmail());
			updates = Filters.eq("patientPhoneNumber", appointment.getPatientPhoneNumber());
			appointments.updateOne(idFilter, updates);
				return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public AppointmentDTO create(AppointmentDTO appointment) throws Exception {
		if (appointment.getId() == null) {
			appointment.setId(UUID.randomUUID().toString());
		}
		appointments.insertOne(appointment);
		return appointment;
	}

	@Override
	public boolean delete(String id) throws Exception {
		try {
			Bson idFilter = Filters.eq("_id", id);
			appointments.findOneAndDelete(idFilter);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	

}
