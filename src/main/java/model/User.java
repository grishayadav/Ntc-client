package model;

public class User {
	private String FirstName;
	private String Lastname;
	private String Address;
	private String City;
	private String State;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public User(String firstName, String lastname, String address, String city, String state) {

		FirstName = firstName;
		Lastname = lastname;
		Address = address;
		City = city;
		State = state;
	}

	public User() {

	}
}
