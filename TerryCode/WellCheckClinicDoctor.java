
public class WellCheckClinicDoctor extends WellCheckClinicEmployee
{

	private String DoctorSpecialty;

		
		//Constructor1
		public WellCheckClinicDoctor()
		{
			super();
			DoctorSpecialty = "";
		}
	
	
	
		//Constructor2
		public WellCheckClinicDoctor(String name, int number, String DocSpecialty)
		{
			super(name, number);
				//super(name, number); 
						
				//doctorName = theDoctorName;
				DoctorSpecialty = DoctorSpecialty;
				
		}
		
		
		
		//Method 1
		public String getDoctorSpecialty()
		{
			return DoctorSpecialty;
		}
		
		
		//Method 2
		public void setSpecialty(String specialty)
		{
			DoctorSpecialty = specialty;
		}
		
		
		//toSting Method
		public String toString()
		{
			return(super.toString() + "\t" + "Specialty: " + DoctorSpecialty);
		}
}
