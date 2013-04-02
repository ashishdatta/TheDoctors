
public class WellCheckClinicDoctor extends WellCheckClinic
{
	private String doctorName;
	private String Specialty;

		//Constructor
		public WellCheckClinicDoctor(String thePatient, String theHealthRecord, int theBloodPressure, int theSugarLevel, int theWeight, 
				String theAddress, long theTelephoneNumber, String theDoctorName, String specialty)
		{
			
				super(thePatient, theHealthRecord, theBloodPressure, theSugarLevel, theWeight, theAddress, theTelephoneNumber); 
						
				doctorName = theDoctorName;
				Specialty = specialty;
				
		}
		
		
		
		//Method 1
		public String getDoctorName()
		{
			return doctorName;
		}
		
		
		//Method 2
		public void setObservation(String theObservation)
		{
			observation = theObservation;
		}
		
		
		//toSting Method
		public String toString()
		{
			return(super.toString() + "\t" + "Doctor Name: " + doctorName + "\t" + "Specialty: " + Specialty);
		}
}
