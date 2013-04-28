
public class WellCheckClinicNurse extends WellCheckClinicEmployee
{
	private String NurseSpecialty;

	
	//Constructor1
	public WellCheckClinicNurse()
	{
		super();
		NurseSpecialty = "";
	}



	//Constructor2
	public WellCheckClinicNurse(String name, int number, String DocSpecialty)
	{
		super(name, number);
			
					
			//doctorName = theDoctorName;
			NurseSpecialty = NurseSpecialty;
			
	}
	
	
	
	//Method 1
	public String getNurseSpecialty()
	{
		return NurseSpecialty;
	}
	
	
	//Method 2
	public void setSpecialty(String specialty)
	{
		NurseSpecialty = specialty;
	}
	
	
	//toSting Method
	public String toString()
	{
		return(super.toString() + "\t" + "Specialty: " + NurseSpecialty);
	}
}

