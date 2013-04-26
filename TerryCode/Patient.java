
public class Patient 
{

	//Instance Data
	private String patientFirstName;
	private String patientLastName;
	//private String medicalCondition;
	//private String Prescription;
	
	
	//Constructor
	public Patient(String FirstName, String LastName)
	{
		patientFirstName = FirstName;
		patientLastName = LastName;
	//medicalCondition = theMedicalCondition;
	//	Prescription = thePrescription;
	}
	
	//Method1: ToString
	public String toString()
	{
		String description;
		
		description = "The Patient: " + patientFirstName + " " + patientLastName +  "\n";
					//  "MedicalCondition: " + medicalCondition + "\n" +
					//  "Prescription: " + Prescription + "\n";
		
		return description;
	}
	
	//Method2: Search
/*	
	public int compareTo(Object other)
	{
		int result;
		
		if(patientLastName.equals(((Patient) other).patientLastName))
		{
			result = patientFirstName.compareTo(((Contact)other).patientFirstName);
		}
		else 
		{
			result = patientLastName.compareTo(((Patient)other).patientLastName);
		}
	}
	*/

}
