package PckY;

public class NeonNumber {

	public static void main(String[] args) {
	
		int lhs=9;
		int x=lhs*lhs;
		int rhs=0;
		while(x>0)
		{
			int digit=x%10;
			rhs=rhs+digit;
			x=x/10;
		}
		System.out.println(rhs);
		}
	
	
	}


