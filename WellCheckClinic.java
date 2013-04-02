
public class WellCheckClinic 
{
	//Instance Data
	protected String patientName;
	protected String address;
	protected String healthRecord;
	protected String observation;
	protected String nurseRecommendaiton;
	protected String appointment;
	protected String prescription;
	
	protected long telephoneNumber;
	protected int bloodPressure;
	protected int sugarLevel;
	protected int weight;
	
	private static int patientCount;		//Static Instance Variable
	
	
	
	
	
	
	//Constructor: Contains name of patient entered into our database by the Patient.
	public WellCheckClinic(String thePatient, String theHealthRecord, int theBloodPressure, int theSugarLevel, int theWeight, 
									String theAddress, long theTelephoneNumber)
	{
		patientName = thePatient; 
		healthRecord = theHealthRecord;
		address = theAddress;
		telephoneNumber = theTelephoneNumber;
		bloodPressure = theBloodPressure;
		sugarLevel = theSugarLevel;
		weight = theWeight;
		
		patientCount++;
	}
	
	
	
	
	//Method 1
	public int getBloodPressure()
	{
		return bloodPressure;
	}
	
	
	//Method 2
	public int getSugarLevels()
	{
		return sugarLevel;
	}
	
	
	//Method 3
	public int getWeight()
	{
		
		return weight;
	}
	
	//Method 4
	public long getTelephoneNumber()
	{
		return telephoneNumber;
	}
	
	//Method 5
	public String getPrescription()
	{
		return prescription;
	}
	
	//Method 6
	public String getAddress()
	{
		return address;
	}
	
	//Method 7
	public String getObservation()
	{
		return observation;
	}
	
	//Method 8
	public String getHealthRecord()
	{
		return healthRecord;
	}
	
	//Method 9  Nurse
	public String getNurseRecommendaiton()
	{
		return nurseRecommendaiton;
	}
	
	//Method 10
	public String getAppointment()
	{
		return appointment;
	}
	
	//Method 11
	public void setPatientName(String thePatient)
	{
			patientName = thePatient;
	}
	
	//Method 12
	public void setAddress(String theAddress)
	{
			address = theAddress;
	}
	
	//Method 13
	public void setHealthRecord(String theHealthRecord)
	{
		 	healthRecord = theHealthRecord;
	}
	
	//Method 14
	public void setTelephoneNumber(long theTelephoneNumber)
	{
			
		
			telephoneNumber = theTelephoneNumber;
	}
	
	//Method 15
	public void setBloodPressure(int theBloodPressure)
	{
			bloodPressure = theBloodPressure;
	}
	
	//Method 16
	public void setSugarLevel(int theSugarLevel)
	{
			sugarLevel = theSugarLevel;
	}
	
	//Method 17
	public void setWeight(int theWeight)
	{
			weight = theWeight;
	}
	
	//Method 18
	public void setObservation(String info)
	{
		observation = info;
	}
	
	//Method 19
	public void setAppointment(String theAppointment)
	{
		appointment = theAppointment;
	}
	
	//Method 20
	public void setPrescriptio(String thePrescription)
	{
		prescription = thePrescription;
	}
	
	
	
	//Method 21: STATIC METHOD
	public static int getPatientCount()
	{
		return(patientCount);
	}
	
	
	//Method 22: toString
	public String toString()
	{
		return("Patient: " + patientName + "\n" + "HealthRecord: " + healthRecord+ "\n"  + "Address: " + address + "\n" + "TelephoneNumber: " + telephoneNumber);
	}
	

	

}
