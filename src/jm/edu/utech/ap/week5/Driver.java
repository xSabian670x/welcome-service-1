package jm.edu.utech.ap.week5;

public class Driver implements Driveable 
{
	public void drive(float numberofMiles)
	{
		System.out.println(String.format("V_BOSS has DRIVEN " + "%.2f miles", numberofMiles));
	}
}
