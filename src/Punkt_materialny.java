import java.util.Scanner;

public class Punkt_materialny 
{
	public int promien=0;
	private double Masa; //prywatne pole masy punktu materialnego
	
	public void setMasa(double m) //kontrola warto�ci zmiennej Masa
	{
		while(m<=0)
		{
			System.out.print("Podano z�� warto�� masy. Spr�buj ponownie. ");	
			Scanner input = new Scanner(System.in);
			m=input.nextDouble();
			System.out.print("\n");
		}
		System.out.print("Podano dobr� warto�� masy. ");
		Masa = m;
	}
	
	public void getMasa() //akcesor
	{
		System.out.print(Masa);
	}
	
	public Punkt_materialny() //konstruktor domy�lny ustawiaj�cy mas� na 10
	{
		Masa = 10;
	}
	
	public Punkt_materialny(double mass) //konstruktor z parametrem
	{
		setMasa(mass);
	}

	public void momentBezw() //metoda obliczaj�ca g��wny moment bezw�adno�ci punktu materialnego
	{
		double I;
		I=Masa*promien*promien;
		System.out.print(I);
	}
	
	public void momentSteiner(double odleglosc) //metoda obliczaj�ca moment bezw�adno�ci punktu materialnego z twierdzenia Steinera
	{
		double I=Masa*promien*promien;
		double ISteiner=I+(Masa*odleglosc*odleglosc);
		System.out.print(ISteiner);
	}
	
	public void opis() //metoda zwracaj�ca opis obiektu
	{
		System.out.print("Punkt materialny");	
	}


	
public static void main(String[] args)
{
	//Podpunkt 1: obiekt klasy z u�yciem konstruktora domy�lnego
	Punkt_materialny punkt1 = new Punkt_materialny(); 
	
	//Podpunkt 2: obiekt klasy z u�yciem konstruktora z parametrem
	Punkt_materialny punkt2 = new Punkt_materialny(20); 
	
	//Podpunkt 3: Wy�wietlenie na konsoli opisu, masy, g��wnego momentu bezw�adno�ci i momentu bezw�adno�ci wzgl�dem nowej osi dla punktu 1
	punkt1.opis();
	System.out.print(" o masie ");
	punkt1.getMasa();
	System.out.println();
	
	System.out.print("G��wny moment bezw�adno�ci punktu: ");
	punkt1.momentBezw();
	System.out.println();
	
	System.out.print("Moment bezw�adno�ci punktu z twierdzenia Steinera: ");
	punkt1.momentSteiner(4);
	System.out.print("\n\n\n");
	
	
	
	//Podpunkt 3 c.d.: Wy�wietlenie na konsoli opisu, masy, g��wnego momentu bezw�adno�ci i momentu bezw�adno�ci wzgl�dem nowej osi dla punktu 2
	punkt2.opis();
	System.out.print(" o masie ");
	punkt2.getMasa();
	System.out.println();
	
	System.out.print("G��wny moment bezw�adno�ci punktu: ");
	punkt2.momentBezw();
	System.out.println();
	
	System.out.print("Moment bezw�adno�ci punktu z twierdzenia Steinera: ");
	punkt2.momentSteiner(4);
	System.out.print("\n\n\n");
	
	
	
	//Podpunkt 4: Zmiana warto�ci masy pierwszego obiektu
	System.out.print("Zmiana masy pierwszego obiektu. Podaj now� mas�: ");
	double m;
	Scanner wejscie = new Scanner(System.in);
	m=wejscie.nextDouble(); //Wprowadzanie warto�ci z klawiatury
	punkt1.setMasa(m);
	
	
	
	//Podpunkt 5: Wy�wietlanie na konsoli opisu, masy, i warto�ci moment�w dla zmienionego obiektu
	punkt1.opis();
	System.out.print(" o masie ");
	punkt1.getMasa();
	System.out.println();
	
	System.out.print("G��wny moment bezw�adno�ci punktu: ");
	punkt1.momentBezw();
	System.out.println();
	
	System.out.print("Moment bezw�adno�ci punktu z twierdzenia Steinera: ");
	punkt1.momentSteiner(4);
	System.out.print("\n\n\n");
	
	
	
	//Podpunkt 6: Tablica z warto�ciami mas punkt�w; masy wprowadzane r�cznie; z kontrol� warto�ci
	System.out.println("Podaj 5 mas punkt�w: ");	
	double[] tablicaMas = new double[5]; //Deklaracja tablicy 5-elementowej
	Scanner in = new Scanner(System.in);
	for(int i=0; i<5; i++)
	{	
		tablicaMas[i] = in.nextDouble(); //Wprowadzanie warto�ci z klawiatury

		while (tablicaMas[i]<=0) //Kontrola warto�ci masy
		{
			System.out.print("Podano z�� warto�� masy. Spr�buj ponownie. ");
			tablicaMas[i] = in.nextDouble();
		}
	}
	
	
	
	//Podpunkt 7: Wy�wietlanie na konsoli opisu, masy, i warto�ci moment�w punkt�w
	for(int k=0; k<5; k++)
	{
		Punkt_materialny punkt = new Punkt_materialny(tablicaMas[k]); //Nowy obiekt
		punkt.opis();
		System.out.println(" o masie: "+tablicaMas[k]);		
		
		System.out.print("G��wny moment bezw�adno�ci punktu: "); 
		punkt.momentBezw();
		System.out.println();
		
		System.out.print("Moment bezw�adno�ci punktu z twierdzenia Steinera: ");
		punkt.momentSteiner(4);
		System.out.print("\n\n");
	}
  }
}