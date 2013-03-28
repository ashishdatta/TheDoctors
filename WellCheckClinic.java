
public class WellCheckClinic 
{
	protected String patientName;
	protected String address;
	protected int telephoneNumber;
	protected int bloodPressure;
	protected int sugarLevel;
	protected int weight;
	protected int healthRecord;
	protected int patientTotal;
	
	private static int patientCount;		//Static Instance Variable
	
	//Constructor: Contains name of patient entered into our database by the Patient.
	public WellCheckClinic(String thePatient, int theTelephoneNumber, int theBloodPressure, 
																	  int theSugarLevel, int theWeight )
	{
		patientName = thePatient; 
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
	public int getTelephoneNumber()
	{
		return telephoneNumber;
	}
	
	//Method 5
	public String getAddress()
	{
		return address;
	}
	
	//Method 6
	public static int getPatientCount()
	{
		return(patientCount);
	}
	//---------End getter block for protected variables-----------//

	//---------Begin setter block for protected Variables---------//
	public void setBloodPressure(int newBloodPressure)
	{
		bloodPressure = newBloodPressure;
	}

	public void setSugarLevel(int newSugarLevel)
	{
		sugarLevel = newSugarLevel;
	}

	public void setTelephoneNumber(int newNumber)
	{
		telephoneNumber = newNumber;
	}

	public void setAddress(String newAddress)
	{
		address =  newAddress;
	}

	public void setWeight(int newWeight)
	{
		weight = newWeight;
	}
	//---------End setter block for protected variables---------//
	
	//Method 10 toString
	public String toString()
	{
		return("Patient" + patientName + "\t" + "Address" + address + "\t" + "telephone number " + telephoneNumber);
	}
	

	

}
