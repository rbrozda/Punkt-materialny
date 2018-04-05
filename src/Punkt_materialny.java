import java.util.Scanner;

public class Punkt_materialny 
{
	public int promien;
	public static double odleglosc = 2;
	protected double Masa; //prywatne pole masy punktu materialnego
	
	public void setMasa(double m) //kontrola warto�ci zmiennej Masa
	{
		while(m<=0)
		{
			System.out.print("Podano z�� warto�� masy. Spr�buj ponownie. ");	
			Scanner input = new Scanner(System.in);
			m=input.nextDouble();
			System.out.print("\n");
		}
		//System.out.println("Podano dobr� warto�� masy. ");
		Masa = m;
	}
	
	public double getMasa() //akcesor
	{
		return Masa;
	}
	
	public Punkt_materialny() //konstruktor domy�lny ustawiaj�cy mas� na 10
	{
		Masa = 60;
	}
	
	public Punkt_materialny(double mass) //konstruktor z parametrem
	{
		setMasa(mass);
	}

	public double momentBezw() //metoda obliczaj�ca g��wny moment bezw�adno�ci punktu materialnego
	{
		return Masa*promien*promien;
	}
	
	public double momentSteiner(double odleglosc) //metoda obliczaj�ca moment bezw�adno�ci punktu materialnego z twierdzenia Steinera
	{
		return( momentBezw() + (Masa*odleglosc*odleglosc));	
	}
	
	public void opis() //metoda zwracaj�ca opis obiektu
	{
		System.out.print("Punkt materialny");	
	}


	
public static void main(String[] args)
{
	//Podpunkt 1: Stworzenie obiekt�w klas pochodnych za pomoc� konstruktor�w z parametrami
	Walec walec1 = new Walec(10,10);
	Kula kula1 = new Kula(8,8);
	Pret pret1 = new Pret(6,6);
	
	
	
	
	//Podpunkt 2: Wy�wietlenie na konsoli informacji zawieraj�cej opis, dane i warto�ci moment�w bezw�adno�ci
	//dla wszystkich obiekt�w.
	System.out.println();
	walec1.opis();
	System.out.println(" o masie " + walec1.getMasa() + " i promieniu podstawy " + walec1.getpromienWalca() + ".");
	System.out.println("G�owny moment bezw�adno�ci walca wynosi " + walec1.momentBezw() + ".");
	
	System.out.println();
	kula1.opis();
	System.out.println(" o masie " + kula1.getMasa() + " i promieniu " + kula1.getpromienKuli() + ".");
	System.out.println("G�owny moment bezw�adno�ci kuli wynosi " + kula1.momentBezw() + ".");
	
	System.out.println();
	pret1.opis();
	System.out.println(" o masie " + pret1.getMasa() + " i d�ugo�ci " + pret1.getDlugoscPreta() + ".");
	System.out.println("G�owny moment bezw�adno�ci pr�ta wynosi " + pret1.momentBezw() + ".");
	System.out.println();
	
	
	
	//Podpunkt 3: Stworzenie tablicy obiekt�w r�nych klas pochodnych.
	double[] tablicaMas = new double[3]; //Deklaracja tablicy z masami bry�
	Scanner in = new Scanner(System.in);
	for(int i=0; i<3; i++)
	{
		switch (i)
		{
			case 0: 
			{
				System.out.println("Podaj mas� walca: ");
				tablicaMas[i] = in.nextDouble(); //Wprowadzanie warto�ci z klawiatury
				walec1.setMasa(tablicaMas[i]);
				break;
			}
			
			case 1: 
			{
				System.out.println("Podaj mas� kuli: ");
				tablicaMas[i] = in.nextDouble(); 
				kula1.setMasa(tablicaMas[i]);
				break;
			}
			case 2: 
			{
				System.out.println("Podaj mas� pr�ta: ");
				tablicaMas[i] = in.nextDouble(); 
				pret1.setMasa(tablicaMas[i]);
				break;
			}
		}
	}
	
	double[] tablicaPromieni = new double[3]; //Deklaracja tablicy z promieniami/d�ugo�ciami bry�
	for(int k=0; k<3; k++)
	{
		switch (k)
		{
			case 0: 
			{
				System.out.println("Podaj promie� walca: ");
				tablicaPromieni[k] = in.nextDouble(); 
				walec1.setPromienWalca(tablicaPromieni[k]);
				break;
			}
			
			case 1: 
			{
				System.out.println("Podaj promie� kuli: ");
				tablicaPromieni[k] = in.nextDouble(); 
				kula1.setPromienKuli(tablicaPromieni[k]);
				break;
			}
			case 2: 
			{
				System.out.println("Podaj d�ugo�� pr�ta: ");
				tablicaPromieni[k] = in.nextDouble(); 
				pret1.setDlugoscPreta(tablicaPromieni[k]);
				break;
			}
		}	
	}
	
	System.out.println();
	
	
	//Podpunkt 4: Wy�wietlenie na konsoli informacji zawieraj�cej opis, dane i warto�ci g��wnych
	//moment�w bezw�adno�ci dla wszystkich obiekt�w w tablicy z wykorzystaniem p�tli.
	for(int j=0; j<3; j++)
	{
		switch (j) 
		{
			case 0:
			{
				walec1.opis();
				System.out.println(" o masie " + tablicaMas[j] + " i promieniu podstawy " + tablicaPromieni[j] + ".");
				System.out.println("G�owny moment bezw�adno�ci walca wynosi " + walec1.momentBezw() + ".");
				System.out.println();
				break;
			}
			
			case 1:
			{
				kula1.opis();
				System.out.println(" o masie " + tablicaMas[j] + " i promieniu " + tablicaPromieni[j] + ".");
				System.out.println("G�owny moment bezw�adno�ci kuli wynosi " + kula1.momentBezw() + ".");
				System.out.println();
				break;
			}
			
			case 2:
			{
				pret1.opis();
				System.out.println(" o masie " + tablicaMas[j] + " i d�ugo�ci " + tablicaPromieni[j] + ".");
				System.out.println("G�owny moment bezw�adno�ci pr�ta wynosi " + pret1.momentBezw() + ".");
				System.out.println();
				break;
			}
		}
	}
	
	//Podpunkt 5: Wy�wietlenie warto�ci moment�w bezw�adno�ci wzgl�dem nowej osi oddalonej o t� sam�
	//odleg�o�� dla wszystkich obiekt�w w tablicy z wykorzystaniem p�tli.
	
	for(int p=0; p<3; p++)
	{
		switch (p) 
		{
			case 0:
			{
				System.out.println("Moment bezw�adno�ci wzgl�dem osi oddalonej o " + odleglosc + 
						" wynosi: " + walec1.momentSteiner(odleglosc));
				break;
			}
			
			case 1:
			{
				System.out.println("Moment bezw�adno�ci wzgl�dem osi oddalonej o " + odleglosc + 
						" wynosi: " + kula1.momentSteiner(odleglosc));
				break;
			}
			
			case 2:
			{
				System.out.println("Moment bezw�adno�ci wzgl�dem osi oddalonej o " + odleglosc + 
						" wynosi: " + pret1.momentSteiner(odleglosc));
				break;
			}
		}
	}
}
}







