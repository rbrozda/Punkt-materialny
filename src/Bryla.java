import java.util.Scanner;

public class Bryla 
{
	public double Masa=1;
	int liczbaPunktow;
	public double masaRazyPromien;
	public double srodek;
	public double calaMasa;
	public void srodekMasy(int liczbaPunktow)
	{
		Scanner in = new Scanner(System.in);
		double[] promien = new double[liczbaPunktow];
		for(int i=0; i<liczbaPunktow; i++) //P�tla do wprowadzania promieni punkt�w
		{
			promien[i] = in.nextDouble();
			double mRP = Masa*promien[i];
			masaRazyPromien = masaRazyPromien + mRP;
			calaMasa = calaMasa + Masa;
		}
		
		srodek = masaRazyPromien / calaMasa;
		System.out.println("Srodek masy bry�y: "+srodek);
	}
	
	public void momentOs()
	{
		
			double moment = calaMasa * srodek * srodek;
			System.out.print("Moment bezw�adno�ci punktu wzgledem osi: " + moment);
	}
	
	
	
	public static void main(String[] args)
	{
		Bryla bryla1 = new Bryla();
		bryla1.srodekMasy(3);
		bryla1.momentOs();
	}
}
