package dao;

import java.util.List;

import model.AppointmentStatus;

public interface AppointmentStatusDAO {
	public abstract List<AppointmentStatus> findAll() throws Exception;
}
