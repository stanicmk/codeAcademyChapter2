package doctorExample;

public class Doctor {

	private String speciality;
	private String name;
	
	
	
	
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getDoctorDetails() {
		System.out.println("Doctor details");
	}
	
	public String getInfo(String ime) {
		String lokalnaPromenliva;
		
		lokalnaPromenliva = "lokalnaPromenliva";
		
		return "Doctor name from attribute: " + this.name + " \n Doctor name: " +ime;
		
	}
	






}







