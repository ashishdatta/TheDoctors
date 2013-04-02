public class Nurse
{
	protected String nurseName;
	protected String Appointment;
	protected String Reccomendation;
	
	public Nurse()
	{
		nurseName = "";
		Appointment = ""; 
		Reccomendation = "";
	}

	public void setReccomendations(String theReccomendation)
	{
		Reccomendation = theReccomendation;
	}

	public void setAppointment(String theAppointment)
	{
		Appointment = theAppointment;
	}

	public String toString()
	{
		return (nurseName + " " + Appointment + " " + Reccomendation);
	}
}