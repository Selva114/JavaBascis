package PckA;

public class MultiThread {

	public static void main(String[] args) {

		Rice rice = new Rice();
																																																																																																																	Rasam rasam = new Rasam();
		Potato potato = new Potato();
		rice.start();
		rasam.start();
		potato.start();
	}
   
}// main class is closed

class Rice extends Thread {
	public void run()

	{
		int x = 97546;
		for (int i = 1; i <= 20; i++) {
			System.out.println(x + "*" + i + "=" + (x * i));

		}

	}
}

class Rasam extends Thread {
	public void run()

	{
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println((char) i + "-->" + i);
		}

	}
}

class Potato extends Thread {
	public void run()

	{
		for (int i = 1; i <= 100; i++) {
			boolean flag = false;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = true;
				}
			}
			if (!flag) {
				System.out.println("prime number" + i);
			}

		}

	}

}
