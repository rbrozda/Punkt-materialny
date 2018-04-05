import java.util.Scanner;

public class Pret extends Punkt_materialny{ //dziedziczenie
	
	private double dlugoscPreta; //prywatne pole d�ugosci pr�ta
	
	public Pret() //konstruktor domy�lny ustawiaj�cy d�ugo�� pr�ta na 10
	{
		super ();
		dlugoscPreta = 10;
	}
	
	public Pret(double mass, double dlugosc) //konstruktor z parametrem, konstruktor superklasy
	{
		super (mass);
		setDlugoscPreta(dlugosc);
	}
	
	public double momentBezw() //przeci��ona metoda obliczaj�ca g��wny moment bezw�adno�ci pr�ta
	{	
		return (Masa*dlugoscPreta*dlugoscPreta/12);
	}
	
	public void opis() //metoda zwracaj�ca opis pr�ta
	{
		System.out.print("Pr�t");	
	}
	
	public void setDlugoscPreta(double lp) //kontrola warto�ci zmiennej dlugoscPreta
	{
		while(lp<=0)
		{
			System.out.print("Podano z�� warto�� d�ugo�ci pr�ta. Spr�buj ponownie. ");	
			Scanner input = new Scanner(System.in);
			lp=input.nextDouble();
			System.out.print("\n");
		}
		dlugoscPreta = lp;
	}
	
	public double getDlugoscPreta() //akcesor
	{
		return dlugoscPreta;
	}

}
