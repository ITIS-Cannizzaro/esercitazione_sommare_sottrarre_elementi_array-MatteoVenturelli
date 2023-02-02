import java.util.Scanner;

public class Venturelli
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					es1();
				break;
				case 2:
					es2();
				break;
				case 3:
					es3();
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. 1 - Titolo es. Somma e differenza numeri pari e dispari array.");
		System.out.println("2 - Es n. 2 - Titolo es. Inversione array numeri");
		System.out.println("3 - Es n. * - Titolo es. Inversione array caratteri");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	
	static void swapNumeri(int[] array)
	{
		int temp;
		for(int i = 0, j = 5; i < 3; i++, j--)
		{
			temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
	}
	
	static void swapCaratteri(String[] array)
	{
		String temp;
		for(int i = 0, j = 5; i < 3; i++, j--)
		{
			temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
	}
	static void es1()
	{
		System.out.println("Inserire la lunghezza dell'array");
		int[] numeri = new int[Integer.parseInt(in.nextLine())];
		int somma = 0;
		int differenza = 0;
		for(int i=0; i < numeri.length; i++)
		{
			System.out.println("Inserire il valore " + i);
			numeri[i]=Integer.parseInt(in.nextLine());
		}
		differenza = numeri[1];
		for(int i=0; i < numeri.length; i++)
		{
			if(i % 2 == 0 || i == 0)
				somma += numeri[i];	
		}
		
		for(int i=2; i < numeri.length; i++)
		{
			if(i % 2 != 0)
				differenza -= numeri[i];	
		}
		
		System.out.println("La somma e la differenza sono: " + somma + differenza);
	}
	
	static void es2()
	{
		int[] numeri = new int [6];
		
		for(int i=0; i < numeri.length; i++)
		{
			System.out.println("Inserire il valore " + i);
			numeri[i]=Integer.parseInt(in.nextLine());
		}
		swapNumeri(numeri);
		
		for(int i=0; i < numeri.length; i++)
			System.out.println(numeri[i]);
	}
	
	static void es3()
	{
		String[] parole = new String [6];
				
		for(int i=0; i < parole.length; i++)
		{
			System.out.println("Inserire la parola " + i);
					parole[i]=in.nextLine();
		}
				
		swapCaratteri(parole);
				
		for(int i=0; i < parole.length; i++)
			System.out.println(parole[i]);
	}
		
	

}
