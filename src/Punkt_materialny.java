import java.util.Scanner;

public class Punkt_materialny 
{
	public int promien=0;
	private double Masa; //prywatne pole masy punktu materialnego
	
	public void setMasa(double m) //kontrola wartoœci zmiennej Masa
	{
		while(m<=0)
		{
			System.out.print("Podano z³¹ wartoœæ masy. Spróbuj ponownie. ");	
			Scanner input = new Scanner(System.in);
			m=input.nextDouble();
			System.out.print("\n");
		}
		System.out.print("Podano dobr¹ wartoœæ masy. ");
		Masa = m;
	}
	
	public void getMasa() //akcesor
	{
		System.out.print(Masa);
	}
	
	public Punkt_materialny() //konstruktor domyœlny ustawiaj¹cy masê na 10
	{
		Masa = 10;
	}
	
	public Punkt_materialny(double mass) //konstruktor z parametrem
	{
		setMasa(mass);
	}

	public void momentBezw() //metoda obliczaj¹ca g³ówny moment bezw³adnoœci punktu materialnego
	{
		double I;
		I=Masa*promien*promien;
		System.out.print(I);
	}
	
	public void momentSteiner(double odleglosc) //metoda obliczaj¹ca moment bezw³adnoœci punktu materialnego z twierdzenia Steinera
	{
		double I=Masa*promien*promien;
		double ISteiner=I+(Masa*odleglosc*odleglosc);
		System.out.print(ISteiner);
	}
	
	public void opis() //metoda zwracaj¹ca opis obiektu
	{
		System.out.print("Punkt materialny");	
	}


	
public static void main(String[] args)
{
	//Podpunkt 1: obiekt klasy z u¿yciem konstruktora domyœlnego
	Punkt_materialny punkt1 = new Punkt_materialny(); 
	
	//Podpunkt 2: obiekt klasy z u¿yciem konstruktora z parametrem
	Punkt_materialny punkt2 = new Punkt_materialny(20); 
	
	//Podpunkt 3: Wyœwietlenie na konsoli opisu, masy, g³ównego momentu bezw³adnoœci i momentu bezw³adnoœci wzglêdem nowej osi dla punktu 1
	punkt1.opis();
	System.out.print(" o masie ");
	punkt1.getMasa();
	System.out.println();
	
	System.out.print("G³ówny moment bezw³adnoœci punktu: ");
	punkt1.momentBezw();
	System.out.println();
	
	System.out.print("Moment bezw³adnoœci punktu z twierdzenia Steinera: ");
	punkt1.momentSteiner(4);
	System.out.print("\n\n\n");
	
	
	
	//Podpunkt 3 c.d.: Wyœwietlenie na konsoli opisu, masy, g³ównego momentu bezw³adnoœci i momentu bezw³adnoœci wzglêdem nowej osi dla punktu 2
	punkt2.opis();
	System.out.print(" o masie ");
	punkt2.getMasa();
	System.out.println();
	
	System.out.print("G³ówny moment bezw³adnoœci punktu: ");
	punkt2.momentBezw();
	System.out.println();
	
	System.out.print("Moment bezw³adnoœci punktu z twierdzenia Steinera: ");
	punkt2.momentSteiner(4);
	System.out.print("\n\n\n");
	
	
	
	//Podpunkt 4: Zmiana wartoœci masy pierwszego obiektu
	System.out.print("Zmiana masy pierwszego obiektu. Podaj now¹ masê: ");
	double m;
	Scanner wejscie = new Scanner(System.in);
	m=wejscie.nextDouble(); //Wprowadzanie wartoœci z klawiatury
	punkt1.setMasa(m);
	
	
	
	//Podpunkt 5: Wyœwietlanie na konsoli opisu, masy, i wartoœci momentów dla zmienionego obiektu
	punkt1.opis();
	System.out.print(" o masie ");
	punkt1.getMasa();
	System.out.println();
	
	System.out.print("G³ówny moment bezw³adnoœci punktu: ");
	punkt1.momentBezw();
	System.out.println();
	
	System.out.print("Moment bezw³adnoœci punktu z twierdzenia Steinera: ");
	punkt1.momentSteiner(4);
	System.out.print("\n\n\n");
	
	
	
	//Podpunkt 6: Tablica z wartoœciami mas punktów; masy wprowadzane rêcznie; z kontrol¹ wartoœci
	System.out.println("Podaj 5 mas punktów: ");	
	double[] tablicaMas = new double[5]; //Deklaracja tablicy 5-elementowej
	Scanner in = new Scanner(System.in);
	for(int i=0; i<5; i++)
	{	
		tablicaMas[i] = in.nextDouble(); //Wprowadzanie wartoœci z klawiatury

		while (tablicaMas[i]<=0) //Kontrola wartoœci masy
		{
			System.out.print("Podano z³¹ wartoœæ masy. Spróbuj ponownie. ");
			tablicaMas[i] = in.nextDouble();
		}
	}
	
	
	
	//Podpunkt 7: Wyœwietlanie na konsoli opisu, masy, i wartoœci momentów punktów
	for(int k=0; k<5; k++)
	{
		Punkt_materialny punkt = new Punkt_materialny(tablicaMas[k]); //Nowy obiekt
		punkt.opis();
		System.out.println(" o masie: "+tablicaMas[k]);		
		
		System.out.print("G³ówny moment bezw³adnoœci punktu: "); 
		punkt.momentBezw();
		System.out.println();
		
		System.out.print("Moment bezw³adnoœci punktu z twierdzenia Steinera: ");
		punkt.momentSteiner(4);
		System.out.print("\n\n");
	}
  }
}