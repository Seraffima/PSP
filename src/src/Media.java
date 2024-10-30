import java.util.ArrayList;
import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int n, suma=0;
		n=sc.nextInt();
		while(n!=0) {
			al.add(n);
			n=sc.nextInt();
		}
		
		for (int i=0;i<al.size();i++) {
			suma+=al.get(i);
		}
		System.out.println(suma/al.size());
	}
}
