package PckA;
import java.io.*;
public class LineByLine {

	public static void main(String[] args) {
		
		try {
			FileReader fr= new FileReader("/home/selva/Desktop/Abc.txt");
			BufferedReader br= new BufferedReader(fr);
			while (br.ready())
			{
				System.out.println(br.readLine());
			}
			
			br.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
			
			
		}
	}

}
