import javax.swing.*;

public class GUI 
{
	public static void main(String[] args) 
	{
		Database info = new Database();
		Medical val = new Medical();
		String title, bloodPressure, patientFirstName, patientSurname, weight, sugarLevel, user, prescription;
		int continueProgram = 1;
		
		user = JOptionPane.showInputDialog("Please enter your occupation: (Doctor, Nurse or Patient)");

		if(user.equals("Patient"))
		{
			JOptionPane.showMessageDialog(null, info.toString());	
		}
		
		while(user.equals("Nurse"))
		{
			do
			{
				patientFirstName = JOptionPane.showInputDialog("Patient First Name: ");
				patientSurname = JOptionPane.showInputDialog("Patient Last Name: ");
				bloodPressure = JOptionPane.showInputDialog("Blood Pressure: ");
				weight = JOptionPane.showInputDialog("Weight: ");
				sugarLevel = JOptionPane.showInputDialog("Sugar Level: ");
				
				
				continueProgram = JOptionPane.showConfirmDialog(null, "Add another patient?");
				info.addPatient(patientFirstName, patientSurname);
				info.addMedicalData(Double.parseDouble(weight), bloodPressure, Integer.parseInt(sugarLevel));
				
			}while(continueProgram == JOptionPane.YES_OPTION);
			user = "" ;
		}
		
		while(user.equals("Doctor"))
		{
			do
			{
				prescription = JOptionPane.showInputDialog("Prescription(s): (Seperate by commas)");
				patientFirstName = JOptionPane.showInputDialog("Patient First Name: ");
				patientSurname = JOptionPane.showInputDialog("Patient Last Name: ");
				bloodPressure = JOptionPane.showInputDialog("Blood Pressure: ");
				weight = JOptionPane.showInputDialog("Weight: ");
				sugarLevel = JOptionPane.showInputDialog("Sugar Level: ");
				
				
				continueProgram = JOptionPane.showConfirmDialog(null, "Add another patient?");
				info.addPatient(patientFirstName, patientSurname);
				info.addMedicalData(Double.parseDouble(weight), bloodPressure, Integer.parseInt(sugarLevel));
				
			}while(continueProgram == JOptionPane.YES_OPTION);
			user = "" ;
		}
			//JOptionPane.showMessageDialog(null, info.toString());
		
		
		
	}

}
