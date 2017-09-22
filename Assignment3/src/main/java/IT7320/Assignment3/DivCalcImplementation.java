package IT7320.Assignment3;

public class DivCalcImplementation {
	
	CalcInterface intObj;
	public int divTwoNums(int g,int h)
	{
		return intObj.div(g,h);
		
	}

	public void setIntObj(CalcInterface intObj) {
		this.intObj = intObj;
	}

}
