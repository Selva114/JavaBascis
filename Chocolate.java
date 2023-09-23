package PckB;
//You go shop and buy  a 15 chocoate and you ate return back to the cover to shop and  they give 5 chocolate for that 15 cover. Atthe end  how many chocolate yu got from that shop?
public class Chocolate {
	public static void main(String[] args) {
	int ChocolateBuy=15;
	int TotalChocoateCover=ChocolateBuy;
	int TotalChocolateWeGot=15;
	
	for( ;TotalChocoateCover>=3; )
	{
		int x=TotalChocoateCover/3;
		TotalChocoateCover=(TotalChocoateCover%3)+x;
		TotalChocolateWeGot=TotalChocolateWeGot+x;
	}
	System.out.println(TotalChocolateWeGot);		
		
		
}
}