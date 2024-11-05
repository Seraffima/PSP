import java.util.ArrayList;
import java.util.Scanner;

public class Maximo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n, suma=0;
		n=sc.nextInt();
		while(n!=0) {
			al.add(n);
			n=sc.nextInt();
		}
		Integer maximo= al.getFirst();
		for (int i=1;i<al.size();i++) {
			if(maximo< al.get(i))
			{
				maximo = al.get(i);
			}
		}
		System.out.println(maximo);

	}

}
