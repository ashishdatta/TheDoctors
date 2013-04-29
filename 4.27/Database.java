
public class Database 
{
	//Instance Data
	private Patient[] collection;
	private Address[] collection2;
	private Medical[] collection3;
	private int count, count2, count3;
	//private String prescription;
	
	//Constructor:  initially empty
	public Database()
	{
		collection = new Patient[100];
		collection2 = new Address[100];
		collection3 = new Medical[100];
		count = 0;
		count2 = 0;
		count3 = 0;
	}
	
	//Method1: Add Patient
	public void addPatient(String FirstName, String LastName)
	{
		//Check to see if Patient[] array size needs to be increased
		//NOTE: the Increase method initializes 100 more array elements before we add object elements
		if(count == collection.length)
		{
			increaseSize();		//call private support method to increase size of patients array
		}
	
		collection[count] = new Patient (FirstName, LastName);
		count++;
	}
	
	//Method2: add Address
	public void addPatientAddress(String address, String ZipCode, String Town, 
												String State, String PhoneNumber)
	{
		//Check to see if Address[] array needs to be increased
		//NOTE: the Increase method initializes 100 more array elements before we add object elements
		if(count2 == collection2.length)
		{
			increaseAddressSize();
		}
		
		collection2[count2] = new Address (address, ZipCode, Town, State, PhoneNumber);
		count2++;
	}
	
	//Method3: add Medical data
	public void addMedicalData(double Weight, String BloodPressure, int SugarLevel)
	{
		
		//Check to see if Medical[] array needs to be increased
		//NOTE: the Increase method initializes 100 more array elements before we add object elements
		if(count3 == collection3.length)
		{
			increaseMedicalSize();
		}
		
		collection3[count3] = new Medical(Weight, BloodPressure,SugarLevel);
		count3++;
	}
	
	
	
	
	//Method2: ToString
	public String toString()
	{
		String display = "---------------------------------------------------------------\n";
		display = display + "The list of Patients \n\n";
		display = display + "Number of patients: " + count + "\n";
		
		//Display First and Last Name of Patient[] array
		for(int p = 0; p < count; p++)
		{
			display = display + collection[p].toString() + "\n\n";
		}
			
		
		//Display Patient Address
		display = display + "The Patients Addresses: \n\n";
		//Display Patient's Address
		for(int a = 0; a < count2; a++)
		{
			display = display + collection2[a].toString() + "\n\n";
		}
		
		
		
		//Display Patient Medical information
		display = display + "The Patients Medical data: \n\n";
		//Display Patients Medical data
		for(int m = 0; m < count3; m++)
		{
			display = display + collection3[m].toString() + "\n\n";
		}
		
		
		return display;
	}

	//Method3: increase array size
	private void increaseSize()
	{
		//Increase Array 2 * its size
		Patient[] temp = new Patient[collection.length * 2];
		
		//For loop initializes temp[] to 200 elemtnes so 100 may be defined but rest which is 100 more that was added is undefined			
		for(int p = 0; p < collection.length; p++)				//(collection.length now = 200
		{
			temp[p] = collection[p];
		}
		
	}
	
	//Method5: increases size of Address[] array
	private void increaseAddressSize()
	{
		//Increases Array 2 times its size
		Address[] temp = new Address[collection2.length * 2];
		
		for(int a = 0; a < collection2.length; a++)
		{
			temp[a] = collection2[a];
		}
			collection2 = temp;
	}
	
	private void increaseMedicalSize()
	{
		Medical[] temp = new Medical[collection3.length * 2];
		
		for(int m=0; m < collection3.length; m++)
		{
			temp[m] = collection3[m];
		}
		
		collection3 = temp;
	}
	
	//Method4: Compare to to see if patient in the system
/*	
	public static Comparable linearSearch(Patient[] data, Patient target)
	{
		Comparable result = null;
		int index = 0;
		
		while (result == null && index < data.length)
		{
			if(data[index].compareTo(target) == 0)
			{
				result = data[index];
			}
			index ++;
		}
	}
	*/ 
	
	//text file store names passwords
}


