package criteria;

import java.util.Date;
import java.util.Objects;

public class PatientCriteria {
	
	private String id;
	private String name;
	private String surname1;
	private String surname2;
	private Date birthDate;
	private String alergy;
	private String habit;
	private String dniNie;
	private String email;
	private String phoneNumber;
	private String addres;
	private String localityId;
	private String countryId;

	
	public PatientCriteria() {
		
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


	public String getSurname1() {
		return surname1;
	}


	public void setSurname1(String surname1) {
		this.surname1 = surname1;
	}


	public String getSurname2() {
		return surname2;
	}


	public void setSurname2(String surname2) {
		this.surname2 = surname2;
	}


	public Date getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


	public String getAlergy() {
		return alergy;
	}


	public void setAlergy(String alergy) {
		this.alergy = alergy;
	}


	public String getHabit() {
		return habit;
	}


	public void setHabit(String habit) {
		this.habit = habit;
	}


	public String getDniNie() {
		return dniNie;
	}


	public void setDniNie(String dniNie) {
		this.dniNie = dniNie;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddres() {
		return addres;
	}


	public void setAddres(String addres) {
		this.addres = addres;
	}


	public String getLocalityId() {
		return localityId;
	}


	public void setLocalityId(String localityId) {
		this.localityId = localityId;
	}


	public String getCountryId() {
		return countryId;
	}


	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(addres, alergy, birthDate, countryId, dniNie, email, habit, id, localityId, name,
				phoneNumber, surname1, surname2);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientCriteria other = (PatientCriteria) obj;
		return Objects.equals(addres, other.addres) && Objects.equals(alergy, other.alergy)
				&& Objects.equals(birthDate, other.birthDate) && Objects.equals(countryId, other.countryId)
				&& Objects.equals(dniNie, other.dniNie) && Objects.equals(email, other.email)
				&& Objects.equals(habit, other.habit) && Objects.equals(id, other.id)
				&& Objects.equals(localityId, other.localityId) && Objects.equals(name, other.name)
				&& Objects.equals(phoneNumber, other.phoneNumber) && Objects.equals(surname1, other.surname1)
				&& Objects.equals(surname2, other.surname2);
	}


	@Override
	public String toString() {
		return "PatientCriteria [id=" + id + ", name=" + name + ", surname1=" + surname1 + ", surname2=" + surname2
				+ ", birthDate=" + birthDate + ", alergy=" + alergy + ", habit=" + habit + ", dniNie=" + dniNie
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", addres=" + addres + ", localityId="
				+ localityId + ", countryId=" + countryId + "]";
	}
	
	
}
