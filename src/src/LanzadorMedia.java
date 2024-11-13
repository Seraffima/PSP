import java.io.*;
import java.util.Scanner;



public class LanzadorMedia {
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
				pw.println(n);
				n=sc.nextInt();
			}
			//pw.println("0");
			
			pw.close();
			osw.close();
			os.close();
			
			is=proceso.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while((linea=br.readLine())!=null) {
				System.out.println("Media: "+linea);
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
