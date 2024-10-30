import java.util.Scanner;

public class Capitales {
	public static void main(String[] args) {
		String pais;
		String capital = "";
		Scanner sc=new Scanner(System.in);
		pais=sc.nextLine();
		switch(pais) {
		case "Japon": 
			capital="Tokyo";
			System.out.println(capital);
			break;
		case "Estados Unidos": 
			capital="Washington D.C";
			System.out.println(capital);
			break;
		case "Inglaterra": 
			capital="Londres";
			System.out.println(capital);
			break;
			default :	System.out.println("una que no esta registrada");
		}

	}
}
