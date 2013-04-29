import javax.swing.*;

public class GUI 
{
	public static void main(String[] args) 
	{
		Database info = new Database();
		Medical val = new Medical();
		String title, bloodPressure, patientFirstName, patientSurname, weight, sugarLevel;  
		int continueProgram = 0;
		
		JFrame home = new JFrame("Well Check Clinic");
		home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		home.pack();
		home.setVisible(true);
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
			
		} while(continueProgram == JOptionPane.YES_OPTION);
		
		JOptionPane.showMessageDialog(null, info.toString());
		
		
		
	}

}
