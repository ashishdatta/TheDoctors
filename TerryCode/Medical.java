import java.util.Scanner;

public class Medical 
{
	//Instance Data
	private double Weight;
	private int BloodPressure;
	private int SugarLevel;
	
	//Constructor1
	public Medical()
	{
		Weight = 0;
		BloodPressure = 0;
		SugarLevel = 0;
	}
	
	
	//Constructor2
	public Medical(double theWeight, int theBloodPressure, int theSugarLevel)
	{
		Weight = theWeight;
		BloodPressure = theBloodPressure;
		SugarLevel = theSugarLevel;
	}
	
	//Method 1
	public double getWeight()
	{
		return Weight;
	}
	
	//Method 2
	public void setWeight(double theWeight)
	{
		Weight = theWeight;
	}
	
	//Method 3
	public int getBloodPressure()
	{
		return BloodPressure;
	}
	
	//Method 4 
	public void setBloodPressure(int theBloodPressure)
	{
		BloodPressure = theBloodPressure;
	}
	
	//Method 5
	public int getSugarLevel()
	{
		return SugarLevel;
	}
	
	//Method 6
	public void getSugarLevel(int theSugarLevel)
	{
		SugarLevel = theSugarLevel;
	}
	
	//Method 7
	public void EnterWeight()
	{
		System.out.print("Please Enter your Weight: ");
		Scanner scan = new Scanner(System.in);
		Weight = scan.nextInt();
		
		
		
	}
	
	//Method 8
		public void EnterBloodPressure()
		{
			System.out.print("Please Enter your Blood Pressure: ");
			Scanner scan = new Scanner(System.in);
			BloodPressure = scan.nextInt();
			
			
			
		}
		
		//Method 9
		public void EnterSugarLevel()
		{
			System.out.print("Please Enter you SugarLevel: ");
			Scanner scan = new Scanner(System.in);
			SugarLevel = scan.nextInt();
			
			
			
		}
	
	
	
	//Method 10 ToString
	public String toString()
	{
		return("Weight: " + Weight + "\t" + "BloodPressure" + BloodPressure + "\t" +
				"SugarLevel: " + SugarLevel);
	}
}















