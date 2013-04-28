import javax.swing.JOptionPane;

public class GUI 
{
	public static void main(String[] args) 
	{
		Database info = new Database();
		Medical val = new Medical();
		String title, bloodPressure, patientFirstName, patientSurname; 
		int continueProgram = 0;
		do
		{
			patientFirstName = JOptionPane.showInputDialog("Patient First Name: ");
			patientSurname = JOptionPane.showInputDialog("Patient Last Name: ");
			bloodPressure = JOptionPane.showInputDialog("Blood Pressure: ");
			
			
			continueProgram = JOptionPane.showConfirmDialog(null, "Add another patient?");
			info.addPatient(patientFirstName, patientSurname);
			
		} while(continueProgram == JOptionPane.YES_OPTION);
		
		JOptionPane.showMessageDialog(null, info.toString());
		
		
		
	}

}
