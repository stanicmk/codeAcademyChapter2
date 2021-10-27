package doctorExample;

public class Hospital {

	public static void main(String[] args) {
	
		Surgeon s = new Surgeon();
		//method from surgeon class
		s.getSurgeonDetails();
		
		//overrided method
		s.getDoctorDetails();
   

		//object variabla   //instanciranje
		Doctor d = new Surgeon ();
		d.getDoctorDetails();
	
		Doctor doc = new Doctor();
		doc.getDoctorDetails();
		
		//this will not work due to private fields in Doctor class
		//doc.name = "Sam"
		
		//Setter example
		doc.setName("Sam");
		
		//Getter example
		System.out.println(doc.getName());
		
		
		//Call method with parameter
		System.out.println(doc.getInfo("Tom"));
	
	
	
	}

}
