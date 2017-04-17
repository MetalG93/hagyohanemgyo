package hajo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
public class HajoModel{
	public int vX,vY,rot;
	public void simulate(int m1, int m2, int m3) // yX,vY,rot kiszamolasa
	{
		rot=m1+m2+m3;
	}
}
public class tesztTest extends TestCase {
	public void testHajo() {
		// TODO Auto-generated method stub
		//fail();
		teszt T= new teszt();

		if(T.Calc(0, 0, 0, 0)!=0) fail();
	}
	
	

}
