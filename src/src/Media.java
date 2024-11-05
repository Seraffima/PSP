import java.util.ArrayList;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int n;
		int suma=0;
		System.out.println("Introducir numeros");
		n=sc.nextInt();
		while(n!=0) {
			al.add(n);
			System.out.println("añadido " + n);
			n=sc.nextInt();
		}
		
		for (int i=0;i<al.size();i++) {
			suma+=al.get(i);
			System.out.println("Suma va por: " + suma);
		}
		System.out.println("La media es: " + suma + " / " + al.size() + " = " + (suma/al.size()));
	}
}
