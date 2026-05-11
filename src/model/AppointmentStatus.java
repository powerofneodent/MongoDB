package model;

import java.util.Objects;

import org.bson.codecs.pojo.annotations.BsonId;

public class AppointmentStatus {
	@BsonId
	private String id;
	private String name;
	
	public AppointmentStatus() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AppointmentStatus other = (AppointmentStatus) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "AppointmentStatus [id=" + id + ", name=" + name + "]";
	}
	
	
}
