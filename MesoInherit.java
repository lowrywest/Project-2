//TODO
public class MesoInherit extends MesoAbstract
{
	//Creating the global Arrays to hold the values
	char[] vals= new char[4];
	int[] charVals= new int[3];
	
	//Making the constructor for the MesoInherit object that is from the MesoAbstract Interface
	public MesoInherit(MesoStation Stid)
	{
		//Setting the value of the MesoInherit object
		vals=Stid.getStID().toCharArray();
	}

	@Override
	//Creating the calAverage method descibed in the Abstract class
	public int[] calAverage() 
	{
		//Creating a local variable that holds the average of all the chars
		Double avg= (vals[0]+vals[1]+vals[2]+vals[3])/4.0;
		//Setting the first location in the array to the rounded down value of the average
		charVals[0]= (int)Math.ceil(avg);
		//Setting the second location in the array to the rounded up value of the average
		charVals[1]= (int)Math.floor(avg);
		
			//comparing the decimal point value of the average to see whether to return the ceil or floor value
			if(avg-Math.floor(avg)< .5)
				{
				//Setting the third array value to the rounded down average if the decimal value of the average is less than 0.5
				charVals[2]= (int)Math.floor(avg);
				}
			else
			{
				//Setting the third array value to the rounded up average if the decimal value of the average is greater than or equal to 0.5
				charVals[2]= (int)Math.ceil(avg);
			}
		// TODO Auto-generated method stub
		return charVals;
	}

	@Override
	public char letterAverage() 
	{
		// TODO Auto-generated method stub
		return (char)charVals[2];
	}
	
}