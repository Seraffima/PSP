import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class LanzadorMaximo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProcessBuilder pb=new ProcessBuilder(args);
		try {
			Process proceso=pb.start();
			InputStream is;
			InputStreamReader isr;
			BufferedReader br;
			OutputStream os;
			OutputStreamWriter osw;
			PrintWriter pw;
			
			String linea;
			
			int n;
			
			os=proceso.getOutputStream();
			osw=new OutputStreamWriter(os);
			pw=new PrintWriter(osw);

			
			n=sc.nextInt();
			while(n!=0) {
				n=sc.nextInt();
				pw.println(n);
			}
			pw.close();
			osw.close();
			os.close();
			
			is=proceso.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while((linea=br.readLine())!=null) {
				System.out.println("El máximo número introducido es: "+linea);
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
