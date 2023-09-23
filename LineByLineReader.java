package PcKY;

import java.io.BufferedReader;
import java.io.FileReader;

public class LineByLineReader {

	public static void main(String[] args) {
		int count=0;
		try {
			FileReader fr=new FileReader("/home/selva/Documents/xyz.txt");
			BufferedReader br=new BufferedReader(fr);
			while(br.ready())
			{
				String line=br.readLine();
				count=count+1;
				if (count==3)
				{
					System.out.println(line);

				}
			}
			br.close();
			fr.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
