import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;



public class LanzadorCapitales {
	public static void main (String[] args) {
		
		Process proceso;
		try {
			proceso = new ProcessBuilder(args).start();

			String pais;
			System.out.println("Introduzca el pais");
			Scanner sc=new Scanner(System.in);
			pais=sc.nextLine();

			OutputStream os=proceso.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			PrintWriter pw=new PrintWriter(osw);
			pw.println(pais);
			pw.close();
			osw.close();
			os.close();

			InputStream is=proceso.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			//System.out.println(br);
			String output=br.readLine();

			while(output!=null) {
				System.out.println("La capital de " + pais + " es " + output + ".");
				output=br.readLine();
			}
			br.close();
			isr.close();
			is.close();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
