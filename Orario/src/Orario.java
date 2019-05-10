import java.util.Scanner;

public class Orario {
	public static void main ( String [] args ) {
		
		Scanner input = new Scanner(System.in);
		int ore, minuti;
		boolean ore_ok, minuti_ok;
		
		System.out.println("Inserire ore: ");
		ore = input.nextInt ();
		System.out.println("Inserire minuti: ");
		minuti = input.nextInt ();
	
		if ((ore < 0) || (ore > 23) || ( minuti < 0) || (minuti > 59))
			System.out.println("Non e' un orario (metodo OR)");
		else
			System.out.println("E' un orario (metodo OR)");	
	
		if ((ore >= 0) && (ore < 24) && ( minuti >= 0) && (minuti < 60))
			System.out.println("E' un orario (metodo AND)");
		else
			System.out.println("Non e' un orario (metodo AND)");	

		ore_ok = (ore >= 0) && (ore < 24);
		minuti_ok = (minuti >= 0) && (minuti < 60);
		if(ore_ok && minuti_ok)
		System.out.println("E' un orario (metodo Boolean)");
		else
		System.out.println("Non e' un orario (metodo Boolean)");
		
		ore_ok = (ore >= 0) && (ore < 24);
		minuti_ok = (minuti >= 0) && ( minuti < 60);
		if(!ore_ok || !minuti_ok)
		System.out.println("Non e' un orario (metodo Boolean negato)");
		else
		System.out.println("E' un orario (metodo Boolean negato)");
		
		input.close();
	}
}
