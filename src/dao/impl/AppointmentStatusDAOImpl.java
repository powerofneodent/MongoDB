package dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.client.MongoCollection;

import dao.AppointmentStatusDAO;
import model.AppointmentStatus;
import util.MongoDBConnection;

public class AppointmentStatusDAOImpl implements AppointmentStatusDAO {
	
	private MongoCollection<AppointmentStatus> appointmentStatuses = null;
	
	public AppointmentStatusDAOImpl() {
		appointmentStatuses = MongoDBConnection.getDatabase().getCollection("appointmentStatuses", AppointmentStatus.class);
	}
	
	@Override
	public List<AppointmentStatus> findAll() throws Exception {
		List<AppointmentStatus> patientList = new ArrayList<>();
		appointmentStatuses.find().into(patientList);
		return patientList;
	}

}
