import java.util.Scanner;

public class Kula extends Punkt_materialny{ //dziedziczenie
	
	private double promienKuli; //prywatne pole promienia kuli
	
	public Kula() //konstruktor domy�lny ustawiaj�cy promie� kuli na 10
	{
		super ();
		promienKuli = 10;
	}
	
	public Kula(double mass, double promien) //konstruktor z parametrem, konstruktor superklasy
	{
		super (mass);
		setPromienKuli(promien);
	}
	
	public double momentBezw() //przeci��ona metoda obliczaj�ca g��wny moment bezw�adno�ci kuli
	{	
		return ((2*Masa*promienKuli*promienKuli)/5);
	}
	
	public void opis() //metoda zwracaj�ca opis kuli
	{
		System.out.print("Kula");	
	}
	
	public void setPromienKuli(double rk) //kontrola warto�ci zmiennej promienKuli
	{
		while(rk<=0)
		{
			System.out.print("Podano z�� warto�� promienia kuli. Spr�buj ponownie. ");	
			Scanner input = new Scanner(System.in);
			rk=input.nextDouble();
			System.out.print("\n");
		}
		promienKuli = rk;
	}
	
	public double getpromienKuli() //akcesor
	{
		return promienKuli;
	}

}