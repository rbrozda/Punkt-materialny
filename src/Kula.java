import java.util.Scanner;

public class Kula extends Punkt_materialny{ //dziedziczenie
	
	private double promienKuli; //prywatne pole promienia kuli
	
	public Kula() //konstruktor domyœlny ustawiaj¹cy promieñ kuli na 10
	{
		super ();
		promienKuli = 10;
	}
	
	public Kula(double mass, double promien) //konstruktor z parametrem, konstruktor superklasy
	{
		super (mass);
		setPromienKuli(promien);
	}
	
	public double momentBezw() //przeci¹¿ona metoda obliczaj¹ca g³ówny moment bezw³adnoœci kuli
	{	
		return ((2*Masa*promienKuli*promienKuli)/5);
	}
	
	public void opis() //metoda zwracaj¹ca opis kuli
	{
		System.out.print("Kula");	
	}
	
	public void setPromienKuli(double rk) //kontrola wartoœci zmiennej promienKuli
	{
		while(rk<=0)
		{
			System.out.print("Podano z³¹ wartoœæ promienia kuli. Spróbuj ponownie. ");	
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