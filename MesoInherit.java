//TODO
public class MesoInherit extends MesoAbstract
{
	char[] vals= new char[4];
	int[] charVals= new int[3];
	
	public MesoInherit(MesoStation Stid)
	{
		String STIDval= "";
		STIDval=Stid.getStID();
		vals=STIDval.toCharArray();
	}

	@Override
	public int[] calAverage() 
	{
		Double avg= (vals[0]+vals[1]+vals[2]+vals[3])/4.0;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public char letterAverage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}