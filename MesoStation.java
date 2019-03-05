
public class MesoStation 
{
	//Creating the private String variable to use when creating the MesoStation object
	private String StID;
	
	//The constructor for the MesoStation object 
	public MesoStation(String StID)
	{
		//Setting the global variable to the value from the object
		this.StID = StID;
	}

	//Creating the getStID method that just returns the global string variable 
	public String getStID() {
		return StID;
	}
}
