package PckA;

//the output will be 3 sentence word write in that Abc file

import java.io.*;

public class LineByLiineWrite {

	public static void main(String[] args) {
		try {
			FileWriter fr= new FileWriter("/home/selva/Desktop/Abc.txt");
			BufferedWriter br= new BufferedWriter(fr);
			br.write("I am going to learn java from tomo \n"+"I am going to learn Python tomo \n" +"iohhi");
			
			br.close();
			fr.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();		
	}
Math.pow(8, 2);
}
	
}
