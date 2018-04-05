import java.util.Scanner;

public class Walec extends Punkt_materialny{ //dziedziczenie
	
	private double promienWalca; //prywatne pole promienia podstawy walca
	
	public Walec() //konstruktor domy�lny ustawiaj�cy promie� podstawy walca na 10
	{
		super ();
		promienWalca = 10;
	}
	
	public Walec(double mass, double promien) //konstruktor z parametrem, konstruktor superklasy
	{
		super (mass);
		setPromienWalca(promien);
	}
	
	public double momentBezw() //przeci��ona metoda obliczaj�ca g��wny moment bezw�adno�ci walca
	{	
		return (0.5*Masa*promienWalca*promienWalca);
	}
	
	public void opis() //metoda zwracaj�ca opis walca
	{
		System.out.print("Walec");	
	}
	
	public void setPromienWalca(double rw) //kontrola warto�ci zmiennej promienWalca
	{
		while(rw<=0)
		{
			System.out.print("Podano z�� warto�� promienia podstawy walca. Spr�buj ponownie. ");	
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

