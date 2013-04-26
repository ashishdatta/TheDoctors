
public class WellCheckClinicEmployee 
{
	//Instance Data
	protected String empName;
	protected int empNumber;
	
	
	//Consturctor1
	public WellCheckClinicEmployee()
	{
		empName = "";
		empNumber = 0;
	}
	
	
	
	//Constructor2
	public WellCheckClinicEmployee (String eName, int eNumber)
	{
		empName = eName;
		empNumber = eNumber;
	}
	
	//Method1
	public String getEmpName()
	{
		return empName;
	}
	
	//Method2
	public void setEmpName(String Name)
	{
		empName = Name;
	}
	
	//Method3
	public int getEmpNumber()
	{
		return empNumber;
	}
	
	//Method4
	public void setEmpNumber(int Number)
	{
		empNumber = Number;
	}
	
	//Method5 ToString
	public String toString()
	{
		return("Doctor: " + empName + "ID Number: " + empNumber);
				
	}
	

}
