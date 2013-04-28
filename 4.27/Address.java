
//Patient Address Class
public class Address 
{
	//Instance Data
	private String Address;
	private String ZipCode;
	private String Town;
	private String State;
	private String PhoneNumber;
	
	//Constructor
	public Address (String theAddress, String theZipCode, String theTown, String theState, String TelephoneNumber)
	{
		Address = theAddress;
		ZipCode = theZipCode;
		Town = theTown;
		State = theState;
		PhoneNumber = TelephoneNumber;
	}
	
	//Method 1
	public String getAddress()
	{
		return Address;
	}
	
	//Method 2
	public void setAddress(String theAddress)
	{
		Address = theAddress;
	}
	
	//Method 3
	public String getZipCode()
	{
		return ZipCode;
	}
	
	//Method 4
	public void setZipeCode(String theZipCode)
	{
		ZipCode = theZipCode;
	}
	
	//Method 5
	public String getTown()
	{
		return Town;
	}
	
	//Method 6
	public void setTown(String theTown)
	{
		Town = theTown;
	}
	
	//Method 7
	public String getState()
	{
		return State;
	}
	
	//method 8
	public void setState(String theState)
	{
		State = theState;
	}
	
	//Method 9
	public String getPhoneNumber()
	{
		return PhoneNumber;
	}
	
	//Method 10
	public void setPhoneNumber(String thePhoneNumber)
	{
		PhoneNumber = thePhoneNumber;
	}
	
	
	//Method 11 ToString
	public String toString()
	{
		return("Patient Address: " + Address + "\t" + "Zip Code: " + ZipCode + "\t" +
				"Town: " + Town + "\t" + "State: " + State + "\t" + 
				"PhoneNumber: " + PhoneNumber + "\n");
	}
}









