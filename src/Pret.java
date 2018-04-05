import java.util.Scanner;

public class Pret extends Punkt_materialny{ //dziedziczenie
	
	private double dlugoscPreta; //prywatne pole d³ugosci prêta
	
	public Pret() //konstruktor domyœlny ustawiaj¹cy d³ugoœæ prêta na 10
	{
		super ();
		dlugoscPreta = 10;
	}
	
	public Pret(double mass, double dlugosc) //konstruktor z parametrem, konstruktor superklasy
	{
		super (mass);
		setDlugoscPreta(dlugosc);
	}
	
	public double momentBezw() //przeci¹¿ona metoda obliczaj¹ca g³ówny moment bezw³adnoœci prêta
	{	
		return (Masa*dlugoscPreta*dlugoscPreta/12);
	}
	
	public void opis() //metoda zwracaj¹ca opis prêta
	{
		System.out.print("Prêt");	
	}
	
	public void setDlugoscPreta(double lp) //kontrola wartoœci zmiennej dlugoscPreta
	{
		while(lp<=0)
		{
			System.out.print("Podano z³¹ wartoœæ d³ugoœci prêta. Spróbuj ponownie. ");	
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
