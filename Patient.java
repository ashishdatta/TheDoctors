public class Patient
{
	protected WellCheckClinic clinic;
	protected String insuranceInfo;
	
	//---------Default constructor for Patient Class---------//
	public Patient()
	{
		insuranceInfo = "";
	}

	//---------Constructor with access to change variables to desired values---------//
	public Patient(int bloodPressure, int weight, int sugarLevel, String address, long phoneNumber, String insuranceInfo)
	{
		clinic.setBloodPressure(bloodPressure);
		clinic.setWeight(weight);
		clinic.setSugarLevel(sugarLevel);
		clinic.setAddress(address);
		clinic.setTelephoneNumber(phoneNumber);
		this.insuranceInfo = insuranceInfo;
	}

	//---------Begin setter block for protected variables------//
	public void setBloodPressure(int newBloodPressure)
	{
		clinic.setBloodPressure(newBloodPressure);
	}

	public void setWeight(int newWeight)
	{
		clinic.setWeight(newWeight);
	}

	public void setSugarLevel(int newSugarLevel)
	{
		clinic.setSugarLevel(newSugarLevel);
	}

	public void setAddress(String newAddress)
	{
		clinic.setAddress(newAddress);
	}

	public void setPhoneNumber(int newPhoneNumber)
	{
		clinic.setTelephoneNumber(newPhoneNumber);
	}

	public void setInsuranceInfo(String newInsuranceInfo)
	{
		insuranceInfo = newInsuranceInfo;
	}
	//---------End setter block for protected variables-----------//

	//---------Begin getter block for protected variables---------//
	public int getBloodPresssure()
	{
		return clinic.getBloodPressure();
	}

	public int getWeight()
	{
		return clinic.getWeight();
	}

	public int getSugarLevel()
	{
		return clinic.getSugarLevels();
	}

	public String getAddress()
	{
		return clinic.getAddress();
	}

	public long getPhoneNumber()
	{
		return clinic.getTelephoneNumber();
	}

	public String getinsuranceInfo()
	{
		return insuranceInfo;
	}
	//---------End getter block for protected variables------------//

	public String toString()
	{
		return (clinic.toString() + "\tInsurance Info" + insuranceInfo);
	}
}