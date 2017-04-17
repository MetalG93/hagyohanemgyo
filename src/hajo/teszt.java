package hajo;
import java.math.*;
import java.util.Vector;
public class teszt {
	
	static double m1,m2,m3; //motor
	//merre kell menni
	public Vector CalcDirection(double destX, double destY, double boatX, double boatY)
	{
		return;
	}
	
	//mennyit kell forogni,mennire vagyunk elfordulva naptól (+- 180 fok)
	public double AngularDifference(double target, double actual) 
	{
		
	}
	
	//milyen gyorsan kell menni, visszatérési értek a hajó koordinátarendszerében
	public Vector GetSpeed(double heading, Vector destination) //merre áll a valóságban és merre kell menni, szöget fokkal elforgatni
	{
		
	}
	
	//milyen gyorsan kell pörögni
	public double GetRotation(double angularDifference) 
	{
		
	}
	
	//motor kiszámolás
	public void CalcMotorsSpeeds(Vector speed, double rotation) //első kettő fv értékét megkapja
	{
		
	}
	
	
	//length of the voyage
	double DestLength(double destX, double destY, double boatX, double boatY, int difference) 
	{
		
		//point of the destination in our coordinate system
		double voyageX= destX-boatX; 
		double voyageY=destY-boatY; 
		
		double destLength= Math.sqrt((voyageX*voyageX)+(voyageY*voyageY));
		return destLength;
	}
	
	

}
