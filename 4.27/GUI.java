import javax.swing.*;

public class GUI 
{
	public static void main(String[] args) 
	{
		Database info = new Database();
		Medical val = new Medical();
		String title, bloodPressure, patientFirstName, patientSurname, weight, sugarLevel, user;  
		int continueProgram = 0;
		
		user = JOptionPane.showInputDialog("Please enter your occupation: (Doctor, Nurse or Patient)");

		System.out.println(user);
		if(user == "2")
		{
			System.out.println("Complete");
			JOptionPane.showMessageDialog(null, info.toString());
			
		}
		System.out.println(user);
		while(user == "Nurse".toLowerCase())
		{
			do
			{
				patientFirstName = JOptionPane.showInputDialog("Patient First Name: ");
				patientSurname = JOptionPane.showInputDialog("Patient Last Name: ");
				bloodPressure = JOptionPane.showInputDialog("Blood Pressure: (Use ' . ' instead of ' / ')");
				weight = JOptionPane.showInputDialog("Weight: ");
				sugarLevel = JOptionPane.showInputDialog("Sugar Level: ");
				
				
				continueProgram = JOptionPane.showConfirmDialog(null, "Add another patient?");
				info.addPatient(patientFirstName, patientSurname);
				info.addMedicalData(Double.parseDouble(weight), bloodPressure, Integer.parseInt(sugarLevel));
				
			}while(continueProgram == JOptionPane.YES_OPTION);
		}
			//JOptionPane.showMessageDialog(null, info.toString());
		
		
		
	}

}
