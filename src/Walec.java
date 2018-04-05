import java.util.Scanner;

public class Walec extends Punkt_materialny{ //dziedziczenie
	
	private double promienWalca; //prywatne pole promienia podstawy walca
	
	public Walec() //konstruktor domyœlny ustawiaj¹cy promieñ podstawy walca na 10
	{
		super ();
		promienWalca = 10;
	}
	
	public Walec(double mass, double promien) //konstruktor z parametrem, konstruktor superklasy
	{
		super (mass);
		setPromienWalca(promien);
	}
	
	public double momentBezw() //przeci¹¿ona metoda obliczaj¹ca g³ówny moment bezw³adnoœci walca
	{	
		return (0.5*Masa*promienWalca*promienWalca);
	}
	
	public void opis() //metoda zwracaj¹ca opis walca
	{
		System.out.print("Walec");	
	}
	
	public void setPromienWalca(double rw) //kontrola wartoœci zmiennej promienWalca
	{
		while(rw<=0)
		{
			System.out.print("Podano z³¹ wartoœæ promienia podstawy walca. Spróbuj ponownie. ");	
			Scanner input = new Scanner(System.in);
			rw=input.nextDouble();
			System.out.print("\n");
		}
		promienWalca = rw;
	}
	
	public double getpromienWalca() //akcesor
	{
		return promienWalca;
	}
}

