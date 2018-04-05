import java.util.Scanner;

public class Punkt_materialny 
{
	public int promien;
	public static double odleglosc = 2;
	protected double Masa; //prywatne pole masy punktu materialnego
	
	public void setMasa(double m) //kontrola wartoœci zmiennej Masa
	{
		while(m<=0)
		{
			System.out.print("Podano z³¹ wartoœæ masy. Spróbuj ponownie. ");	
			Scanner input = new Scanner(System.in);
			m=input.nextDouble();
			System.out.print("\n");
		}
		//System.out.println("Podano dobr¹ wartoœæ masy. ");
		Masa = m;
	}
	
	public double getMasa() //akcesor
	{
		return Masa;
	}
	
	public Punkt_materialny() //konstruktor domyœlny ustawiaj¹cy masê na 10
	{
		Masa = 60;
	}
	
	public Punkt_materialny(double mass) //konstruktor z parametrem
	{
		setMasa(mass);
	}

	public double momentBezw() //metoda obliczaj¹ca g³ówny moment bezw³adnoœci punktu materialnego
	{
		return Masa*promien*promien;
	}
	
	public double momentSteiner(double odleglosc) //metoda obliczaj¹ca moment bezw³adnoœci punktu materialnego z twierdzenia Steinera
	{
		return( momentBezw() + (Masa*odleglosc*odleglosc));	
	}
	
	public void opis() //metoda zwracaj¹ca opis obiektu
	{
		System.out.print("Punkt materialny");	
	}


	
public static void main(String[] args)
{
	//Podpunkt 1: Stworzenie obiektów klas pochodnych za pomoc¹ konstruktorów z parametrami
	Walec walec1 = new Walec(10,10);
	Kula kula1 = new Kula(8,8);
	Pret pret1 = new Pret(6,6);
	
	
	
	
	//Podpunkt 2: Wyœwietlenie na konsoli informacji zawieraj¹cej opis, dane i wartoœci momentów bezw³adnoœci
	//dla wszystkich obiektów.
	System.out.println();
	walec1.opis();
	System.out.println(" o masie " + walec1.getMasa() + " i promieniu podstawy " + walec1.getpromienWalca() + ".");
	System.out.println("G³owny moment bezw³adnoœci walca wynosi " + walec1.momentBezw() + ".");
	
	System.out.println();
	kula1.opis();
	System.out.println(" o masie " + kula1.getMasa() + " i promieniu " + kula1.getpromienKuli() + ".");
	System.out.println("G³owny moment bezw³adnoœci kuli wynosi " + kula1.momentBezw() + ".");
	
	System.out.println();
	pret1.opis();
	System.out.println(" o masie " + pret1.getMasa() + " i d³ugoœci " + pret1.getDlugoscPreta() + ".");
	System.out.println("G³owny moment bezw³adnoœci prêta wynosi " + pret1.momentBezw() + ".");
	System.out.println();
	
	
	
	//Podpunkt 3: Stworzenie tablicy obiektów ró¿nych klas pochodnych.
	double[] tablicaMas = new double[3]; //Deklaracja tablicy z masami bry³
	Scanner in = new Scanner(System.in);
	for(int i=0; i<3; i++)
	{
		switch (i)
		{
			case 0: 
			{
				System.out.println("Podaj masê walca: ");
				tablicaMas[i] = in.nextDouble(); //Wprowadzanie wartoœci z klawiatury
				walec1.setMasa(tablicaMas[i]);
				break;
			}
			
			case 1: 
			{
				System.out.println("Podaj masê kuli: ");
				tablicaMas[i] = in.nextDouble(); 
				kula1.setMasa(tablicaMas[i]);
				break;
			}
			case 2: 
			{
				System.out.println("Podaj masê prêta: ");
				tablicaMas[i] = in.nextDouble(); 
				pret1.setMasa(tablicaMas[i]);
				break;
			}
		}
	}
	
	double[] tablicaPromieni = new double[3]; //Deklaracja tablicy z promieniami/d³ugoœciami bry³
	for(int k=0; k<3; k++)
	{
		switch (k)
		{
			case 0: 
			{
				System.out.println("Podaj promieñ walca: ");
				tablicaPromieni[k] = in.nextDouble(); 
				walec1.setPromienWalca(tablicaPromieni[k]);
				break;
			}
			
			case 1: 
			{
				System.out.println("Podaj promieñ kuli: ");
				tablicaPromieni[k] = in.nextDouble(); 
				kula1.setPromienKuli(tablicaPromieni[k]);
				break;
			}
			case 2: 
			{
				System.out.println("Podaj d³ugoœæ prêta: ");
				tablicaPromieni[k] = in.nextDouble(); 
				pret1.setDlugoscPreta(tablicaPromieni[k]);
				break;
			}
		}	
	}
	
	System.out.println();
	
	
	//Podpunkt 4: Wyœwietlenie na konsoli informacji zawieraj¹cej opis, dane i wartoœci g³ównych
	//momentów bezw³adnoœci dla wszystkich obiektów w tablicy z wykorzystaniem pêtli.
	for(int j=0; j<3; j++)
	{
		switch (j) 
		{
			case 0:
			{
				walec1.opis();
				System.out.println(" o masie " + tablicaMas[j] + " i promieniu podstawy " + tablicaPromieni[j] + ".");
				System.out.println("G³owny moment bezw³adnoœci walca wynosi " + walec1.momentBezw() + ".");
				System.out.println();
				break;
			}
			
			case 1:
			{
				kula1.opis();
				System.out.println(" o masie " + tablicaMas[j] + " i promieniu " + tablicaPromieni[j] + ".");
				System.out.println("G³owny moment bezw³adnoœci kuli wynosi " + kula1.momentBezw() + ".");
				System.out.println();
				break;
			}
			
			case 2:
			{
				pret1.opis();
				System.out.println(" o masie " + tablicaMas[j] + " i d³ugoœci " + tablicaPromieni[j] + ".");
				System.out.println("G³owny moment bezw³adnoœci prêta wynosi " + pret1.momentBezw() + ".");
				System.out.println();
				break;
			}
		}
	}
	
	//Podpunkt 5: Wyœwietlenie wartoœci momentów bezw³adnoœci wzglêdem nowej osi oddalonej o tê sam¹
	//odleg³oœæ dla wszystkich obiektów w tablicy z wykorzystaniem pêtli.
	
	for(int p=0; p<3; p++)
	{
		switch (p) 
		{
			case 0:
			{
				System.out.println("Moment bezw³adnoœci wzglêdem osi oddalonej o " + odleglosc + 
						" wynosi: " + walec1.momentSteiner(odleglosc));
				break;
			}
			
			case 1:
			{
				System.out.println("Moment bezw³adnoœci wzglêdem osi oddalonej o " + odleglosc + 
						" wynosi: " + kula1.momentSteiner(odleglosc));
				break;
			}
			
			case 2:
			{
				System.out.println("Moment bezw³adnoœci wzglêdem osi oddalonej o " + odleglosc + 
						" wynosi: " + pret1.momentSteiner(odleglosc));
				break;
			}
		}
	}
}
}







